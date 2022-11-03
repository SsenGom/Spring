package spring.day1026.coffee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring.answer.model.AnswerDaoInter;
import spring.answer.model.AnswerDto;
import spring.day1026.data.BoardDaoInter;
import spring.day1026.data.BoardDto;

@Controller
public class BoardContentController {

	@Autowired
	BoardDaoInter dao;
	
	@Autowired
	AnswerDaoInter adao;
	
	@GetMapping("/board/content")
	public ModelAndView content(
			@RequestParam int num,
			@RequestParam int currentpage
			) {
	
		ModelAndView mview=new ModelAndView();
		
		//조회수 증가
		dao.updateReadCount(num);
		
		//dto
		BoardDto dto=dao.getData(num);
		
		mview.addObject("dto", dto);
		mview.addObject("currentpage", currentpage);
		
		//num에 해당하는 댓글을 db에서 가져와 보낸다
		List<AnswerDto> alist=adao.getListAnswer(num);
		
		mview.addObject("acount",alist.size());
		mview.addObject("alist",alist);
		
		mview.setViewName("board/content");
		
		return mview;
	}
	
}
