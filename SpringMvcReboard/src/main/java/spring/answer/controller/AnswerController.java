package spring.answer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring.answer.model.AnswerDaoInter;
import spring.answer.model.AnswerDto;

@Controller
public class AnswerController {

	@Autowired
	AnswerDaoInter adao;
	
	@PostMapping("/board/ainsert")
	public String answerinsert(@ModelAttribute AnswerDto dto,
			@RequestParam String currentpage 
		) {
		
		//db에 추가
		adao.insertAnswer(dto);
		
		return "redirect:content?num="+dto.getNum()+"&currentpage="+currentpage;
	}
	
}
