package spring.db.sist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@Autowired
	MyShopDao dao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		//dao로부터 전체리스트 출력 메서드 가져오기
		List<MyShopDto> list=dao.getAllList();
		
		//받아온 list를 request로 저장
		model.addAttribute("list",list);
		model.addAttribute("count",list.size());
		
		return "home";
	}
	
}
