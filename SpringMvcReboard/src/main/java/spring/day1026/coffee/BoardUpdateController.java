package spring.day1026.coffee;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import spring.day1026.data.BoardDao;
import spring.day1026.data.BoardDaoInter;
import spring.day1026.data.BoardDto;

@Controller
public class BoardUpdateController {

	@Autowired
	BoardDaoInter dao;
	
	@GetMapping("/board/updatepassform")
	public ModelAndView updatepassform(
			@RequestParam String num,
			@RequestParam String currentpage) {
		ModelAndView model=new ModelAndView();
		
		model.addObject("num", num);
		model.addObject("currentpage", currentpage);
		
		model.setViewName("board/updatepassform");
		return model;
	}
	
	@PostMapping("/board/updatepass")
	public ModelAndView updatepass(
			@RequestParam int num,
			@RequestParam int pass,
			@RequestParam int currentpage
			) {
		
		ModelAndView model=new ModelAndView();
		
		//비번이 맞으면 수정폼으로 포워드, 틀릴경우는 passfail 출력
		int check=dao.getCheckPass(num, pass);
		
		if(check==1)
		{
			//비번이 맞으므로 수정폼으로 가니까 dto얻어온다
			BoardDto dto=dao.getData(num);
			
			model.addObject("dto", dto);
			model.addObject("currentpage", currentpage);
			
			model.setViewName("board/updateform");
		}else
		{	
			model.setViewName("board/passfail");
		}
		
		return model;
	}
	
	@PostMapping("/board/update")
	public String insert(@ModelAttribute BoardDto dto,
			@RequestParam String currentpage,
			@RequestParam ArrayList<MultipartFile> upload,
			HttpSession session) {
		
		//업로드한 실제경로
		String path=session.getServletContext().getRealPath("/WEB-INF/photo");
		System.out.println(path);
		
		//파일명에 사용할 날짜
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddmmss");
		
		String photo="";
		//사진선택안하면 no 했을경우,로 나열(파일명은 날짜시간으로 지정)
		if(upload.get(0).getOriginalFilename().equals(""))
			photo=null; //sql의 조건에서 null
		else {
			
			for(MultipartFile f:upload)
			{
				String fName = "f" + sdf.format(new Date()) + f.getOriginalFilename();

				photo+=fName+",";
				
				try {
				f.transferTo(new File(path+"\\"+fName));
				} catch (IllegalStateException e) {
					e.printStackTrace();
				}catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			
			//마지막 컴마제거
			photo=photo.substring(0,photo.length()-1);
			
		}
		
		//dto의 photo에 넣어주기
		dto.setPhoto(photo);
		
		//수정
		dao.updateBoard(dto);
		
		return "redirect:content?num="+dto.getNum()+"&currentpage="+currentpage; // content
	}
	
}
