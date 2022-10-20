package spring.mvc.read;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

	@RequestMapping("/board/add/data")
	public String good(Model model) {
		
		model.addAttribute("title","이미지퀴즈");
		
		return "result5";
	}
	
}
