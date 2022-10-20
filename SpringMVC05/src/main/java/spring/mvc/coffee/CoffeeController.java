package spring.mvc.coffee;

import java.util.Map;

import org.springframework.stereotype.Controller;import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/data") //상위경로가 같은 데이터 경로 끼리는 묶어서 처리할 수 있음... 다만 반드시 상위경로가 같아야함
public class CoffeeController {

	@RequestMapping("/myform")
	public String one() {
		return "addform";
	}
	
	//@RequestMapping(value="/data/read1",method = RequestMethod.GET)
	@GetMapping("/read1")
	public ModelAndView read1(@RequestParam String name,
			@RequestParam int age) {
		
		ModelAndView model=new ModelAndView();
		
		//request에 저장
		model.addObject("name",name);
		model.addObject("age",age);
		
		//포워드
		model.setViewName("process1");
		
		return model;
	}
	
	//post방식으로 읽기
	@PostMapping("/read2")
	public ModelAndView read2(@ModelAttribute TestDto dto) {
		ModelAndView model=new ModelAndView();
		
		//request저장
		model.addObject("dto",dto);
		
		//포워드
		model.setViewName("process2");
		
		return model;
	}
	
	//map방식으로 일기
	@PostMapping("/read3")
	public ModelAndView read3(@RequestParam Map<String, String> map) {
		ModelAndView model=new ModelAndView();
		
		//request저장
		String sang = map.get("sang");
		String price = map.get("price");
		
		String data=sang+"의 가격은"+price+"입니다";
		
		model.addObject("data", data);
		
		//포워드
		model.setViewName("process3");
		
		return model;
	}
	
}
