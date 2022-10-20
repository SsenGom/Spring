package spring.di.log;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/")
	public String start()
	{
		return "redirect:login/form1"; //return "form"과 같음 ... 
	}
	
	@GetMapping("/login/form1")
	public String login() {
		
		return "form";
	}
	
	@GetMapping("/login/read1")
	public String process(Model model,@RequestParam(value = "myid") String id, 
			@RequestParam String mypass) {
		//(value = "myid")값은 string 변수값과 같을 경우 안써줘도 됨 ...변수값을 다르게 입력하고 싶으면 적어주고
		model.addAttribute("id",id);
		String msg="";
		if(mypass.equals("1234"))
			msg="로그인성공";
		else
			msg="로그인실패";
		
		model.addAttribute("msg",msg);
		
		return "result";
	}
}
