package db.mysql.upload;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HoewonController {

	@Autowired
	HoewonDaoInter dao;
	
	//폼으로이동
	@GetMapping("/hoewon/form")
	public String form()
	{
		return "hoewon/addform";
	}
	
	
	//리스트로이동(ModelAndView)
	@GetMapping("/hoewon/list")
	public ModelAndView list(
			//리스트 검색 //defaultValue = "name" 초기값은 이름, required = false 없어도 검색됨
			@RequestParam (defaultValue = "name") String title,
			@RequestParam (required = false)String search			
			)
	{
		ModelAndView model=new ModelAndView();
		
		int totalCount=dao.getTotalCount();
		
		System.out.println(title+","+search);
		
		Map<String, String> map=new HashMap<String, String>();
		map.put("title", title);
		map.put("search", search);
		
		List<HoewonDto> list=dao.getAllDatas(map);
		
		//request에 저장
		model.addObject("list", list);
		model.addObject("totalCount", totalCount);
		
		
		//포워드
		model.setViewName("hoewon/list");
		
		return model;
	}
	
	//폼입력후 다시 리스트로
	@PostMapping("/hoewon/insert")
	public String insert(@ModelAttribute HoewonDto dto,
			@RequestParam MultipartFile upload,
			HttpSession session)
	{
		String path=session.getServletContext().getRealPath("/WEB-INF/image");
		System.out.println(path);
		
		String photo="";
		
		//사진선택을 안했을경우 no
		if(upload.getOriginalFilename().equals(""))
			photo="no";
		else {
			photo=upload.getOriginalFilename();
			//업로드
			try {
				upload.transferTo(new File(path+"\\"+photo));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//dto의 photo에 넣어주기
		dto.setPhoto(photo);
		
		//insert
		dao.insertHoewon(dto);
		
		
		return "redirect:list";
	}
	
	//수정을 누르면 업데이트 폼으로 이동
	@GetMapping("/hoewon/updateform")
	public String getData(Model model, @RequestParam String num) {
		
		HoewonDto dto=dao.getData(num);
		model.addAttribute("dto",dto);
		
		return "hoewon/updateform";
	}
	
	@PostMapping("/hoewon/update")
	public String update(@ModelAttribute HoewonDto dto,
			@RequestParam MultipartFile upload,
			HttpSession session) {
		//multipart의 파라메타는 폼의 사진 name과 같아야한다. 
		String path=session.getServletContext().getRealPath("/WEB-INF/image");
		//path값은 selvlet-context에서 설정가능
		
		System.out.println(path);
		
		String photo="";
		
		photo=upload.getOriginalFilename();
		
		//업로드
		try {
			upload.transferTo(new File(path+"\\"+photo)); //이미지 업로드 하는 부분
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//dto에 photo넣기
		dto.setPhoto(photo);
		
		dao.updateHoewon(dto);
		
		return "redirect:list";
	}
	
}
