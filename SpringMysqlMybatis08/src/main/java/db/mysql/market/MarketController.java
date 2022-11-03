package db.mysql.market;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MarketController {

	@Autowired
	MarketDaoInter dao;
	
	//입력폼으로이동
	@GetMapping("/market/form")
	public String insert() {
		return "market/insertform";
	}
	
	@GetMapping("/market/list")
	public ModelAndView list() {
		
		ModelAndView model=new ModelAndView();
		
		int totalCount=dao.GetCount();
		List<MarketDto> list=dao.AllList();
		
		//request 주입
		model.addObject("totalCount", totalCount);
		model.addObject("list", list);
		
		//포워드
		model.setViewName("market/list");
		
		return model;
	}
}
