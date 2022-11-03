package spring.day1026.coffee;

import java.io.File;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.day1026.data.BoardDaoInter;
import spring.day1026.data.BoardDto;

@Controller
public class BoardDeleteController {

	@Autowired
	BoardDaoInter dao;
	
	@GetMapping("/board/deletepassform")
	public ModelAndView deletepassform(
			@RequestParam int num,
			@RequestParam int currentpage) {
		ModelAndView model=new ModelAndView();
		
		model.addObject("num", num);
		model.addObject("currentpage", currentpage);
		
		model.setViewName("board/deletepassform");
		return model;
	}
	
	@PostMapping("/board/deletepass")
	public String updatepass(
			@RequestParam int num,
			@RequestParam int pass,
			@RequestParam int currentpage,
			HttpSession session
			) {
		
		//비번이 맞으면 수정폼으로 포워드, 틀릴경우는 passfail 출력
		int check=dao.getCheckPass(num, pass);
		
		if(check==0)
		{
			return "board/passfail";

		}else
		{	
			//photo폴더에 있는 사진삭제
			//번호의 사진 
			String photo=dao.getData(num).getPhoto();
			
			//,로 분리
			if(!photo.equals("no")) {
				
				String [] fName= photo.split(",");
				
				//실제 업로드 경로
				String path=session.getServletContext().getRealPath("/WEB-INF/photo");
				//fname 포이치문으로 경로에서 모두삭제
				for(String f:fName)
				{
					File file=new File(path+"\\"+f);
					file.delete();
				}
			
			}
			//db에서도 삭제
			dao.deleteBoard(num);
			//목록으로 이동
			return "redirect:list?currentpage="+currentpage;

		}
		
	}
}
