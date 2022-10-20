package spring.mvc.read;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HappyController {

	@RequestMapping("/banana/insert")
	public ModelAndView one() {
		
		ModelAndView mview=new ModelAndView();
		
		//request에 저장
		mview.addObject("java",88);
		mview.addObject("spring", 77);
		
		//포워드할 jsp파일 지정
		mview.setViewName("result2");
		
		return mview;
	}
	
	@RequestMapping("/orange/delete")
	public String two(Model model,HttpSession session) {
		
		model.addAttribute("name", "마이클");
		
		//session저장
		session.setAttribute("myid", "juno");
		
		
		return "result3";
	}
	@RequestMapping("/shop/detail")
	public String three(Model model) {
		
		
		return "result4";
	}
	
}
