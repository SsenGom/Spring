package spring.mvc.read;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("msg", "HomeController로 부터 포워드됨");
		model.addAttribute("today", new Date());
		
		return "home"; //WEB-INF / day1019/home.jsp
	}
	
	@RequestMapping("/apple/list") //맵핑주소는 가급적 앞에 /를 붙여주자 , 주소값에 .do .me 라고 붙이면 home링크값에 .do .me를 넣어줘야함(과거에 쓰던 레거시 주소값) .. do나 min이나 다호출됨
	//@RequestMapping("/apple/list.min") //min만 가능
	public String hello(Model model) {
		
		model.addAttribute("name", "백준호");
		model.addAttribute("hp", "010-2300-5016");
		
		return "result1";
	}
}
