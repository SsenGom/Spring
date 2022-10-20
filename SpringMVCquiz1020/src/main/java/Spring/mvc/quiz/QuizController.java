package Spring.mvc.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class QuizController {

	@RequestMapping("/data/myform")
	public String one() {
		return "addform";
	}
	
	@PostMapping("/data/info")
	public ModelAndView info(@ModelAttribute SawonDto dto) {
		ModelAndView model=new ModelAndView();
		
		model.addObject("dto",dto);
		
		model.setViewName("testform");
		
		return model;
	}
	
}
