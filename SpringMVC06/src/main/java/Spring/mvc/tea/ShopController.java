package Spring.mvc.tea;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShopController {

	@GetMapping("/shop/list")
	public String shoplist()
	{
		return "shop/list";
	}
	
	@GetMapping("/shop/form1")
	public String shopform()
	{
		return "shop/shopform";
	}
	
	//폼에서_shopresult로
	@PostMapping("/shop/process1")
	public String process1(@ModelAttribute ShopDto dto) {
		
		/* model에 저장을 생략할 경우 shopDto(앞 소문자로) 저장됨 */
		
		return "shop/shopresult";
	}
	
	@GetMapping("/map/form2")
	public String form2()
	{
		return "map/mapform";
	}
	
	//폼에서_mapresult로
	@PostMapping("/map/process2")
	public ModelAndView process2(@RequestParam Map<String, String> map) {
		
		ModelAndView model=new ModelAndView();
		
		model.addObject("name", map.get("name"));
		model.addObject("java", map.get("java"));
		model.addObject("spring", map.get("spring"));
		model.addObject("oracle", map.get("oracle"));
		
		model.setViewName("map/mapresult");
		
		return model;
	}
}
