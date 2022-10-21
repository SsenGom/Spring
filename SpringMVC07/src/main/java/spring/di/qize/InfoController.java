package spring.di.qize;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InfoController {

	@GetMapping("/info/myform")
	public String one() {
		
		return "info/infoform";
	}
	
	@PostMapping("/info/result")
	public String two(@ModelAttribute("dto") InfoDto dto) {
		return "info/infowrite";
	}
	
}
