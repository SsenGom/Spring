package Spring.mvc.tea;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {

	@GetMapping("/board/form")
	public String form() {
		
		return "board/writeform";
	}
	
	@PostMapping("/board/process")
	public ModelAndView process1(
			@RequestParam String name,
			@RequestParam String date,
			@RequestParam String gender,
			@RequestParam(required = false) String msg, 
			/* 폼에 요소가 없으면 씀.(require = false) 라고 써주는 이유는 true가 기본값이라, 
			 * 항목이 없어도 에러가 안나게 하려면 false입력 ★굉장히 중요 요소가 없는값은 무조건 다써줘야함*/
			@RequestParam(defaultValue = "1") int currentPage		
			/* (defaultValue = "1") default값 출력 */
			) {
		
		ModelAndView model=new ModelAndView();
		
		model.addObject("name", name);
		model.addObject("date", date);
		model.addObject("gender", gender);
		model.addObject("msg", msg);
		model.addObject("currentPage", currentPage);
		
		model.setViewName("board/result1");
		
		return model;
	}
	
	//인덱스의 이미지, css, 확인에 대한 결과
	@GetMapping("/board/result2")
	public String result2(Model model) {
		
		model.addAttribute("myimg1", "../image/smell.png");
		model.addAttribute("myimg2", "../image/taste.png");
		model.addAttribute("title","좋아하는 이미지 입니다");
		
		return "board/result2";
	}
}
