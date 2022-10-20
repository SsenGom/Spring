package spring.di.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuizController {
	
	@RequestMapping("/nice/hi")
	public String job(Model model) {
		
		model.addAttribute("name","백준호");
		model.addAttribute("addr","송양로76");
		
		return "nice";
	}
	
	@RequestMapping("/hello")
	public String job2(Model model) {
		
		model.addAttribute("msg","안녕하세요");
		
		return "hello";
	}
	@RequestMapping("/happy")
	public String job3(Model model) {
				
		return "happy";
	}
}
