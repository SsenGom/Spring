package Spring.MVC.sist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	//@RequestMapping(value = "/", method= RequestMethod.GET)
	@GetMapping("/")
	public String hello1(Model model) {
		//Model: request에 데이터를 저장하기 위한 인터페이스
		//서블릿에서 코딩했떤 request.setAttribute와 같다
		model.addAttribute("name", "쌍용교육센터");
		model.addAttribute("addr", "서울시 강남구");
		
		return "home"; //WEB-INF/view/home.jsp 를 가르킴 
	}
	
}
