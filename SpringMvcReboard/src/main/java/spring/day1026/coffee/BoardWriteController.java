package spring.day1026.coffee;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.javassist.Loader.Simple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import spring.day1026.data.BoardDaoInter;
import spring.day1026.data.BoardDto;

@Controller
public class BoardWriteController {

	
	@Autowired
	BoardDaoInter dao;
	
	//새글, 답글 모두해당
	@GetMapping("/board/writeform")
	public ModelAndView form(@RequestParam Map<String, String> map
	/*
	 * @RequestParam(defaultValue="0")int num,
	 * 
	 * @RequestParam(defaultValue="0")int regroup,
	 * 
	 * @RequestParam(defaultValue="0")int restep,
	 * 
	 * @RequestParam(defaultValue="0")int relevel,
	 * 
	 * @RequestParam(defaultValue="1")int currentPage
	 */		
			) {
		ModelAndView mview=new ModelAndView();
		
		//5개의 값은 답글일경우에만 넘어온다 (새글일 경우 안넘어옴)
		String currentpage=map.get("currentpage");
		String num=map.get("num");
		String regroup=map.get("regroup");
		String restep=map.get("restep");
		String relevel=map.get("relevel");
		
		System.out.println(currentpage+","+num); //새글인 경우는 null값 나옴
		
		//입력폼에 hidden으로 넣어줘야함...답글일 때 대비 
		mview.addObject("currentpage", currentpage==null?"1":currentpage);
		mview.addObject("num", num==null?"0":num);
		mview.addObject("regroup", regroup==null?"0":regroup);
		mview.addObject("restep", restep==null?"0":restep);
		mview.addObject("relevel", relevel==null?"0":relevel);
		
		//0으로 넣어야 dao에서 새글로 인식... 풀이 새글, 답글 공통이므로
		mview.setViewName("board/writeform");
		return mview;
	}
	
	
	@PostMapping("/board/insert")
	public String insert(@ModelAttribute BoardDto dto,
			@RequestParam int currentpage,
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
			photo="no";
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
		
		//insert
		dao.insertBoard(dto);
		
		//목록이 아닌 content로 이동하려믄 maxnum값을 알아야함
		int num=dao.getMaxNum();
		
		
		return "redirect:content?num="+num+"&currentpage="+currentpage; //content가 없으므로 일단 list
	}
}
