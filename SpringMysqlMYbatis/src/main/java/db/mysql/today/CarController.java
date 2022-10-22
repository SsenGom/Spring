package db.mysql.today;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {

	@Autowired
	MyCarDao dao;
	
	@GetMapping("/samsung/list")
	public String list(Model model) {
		//dao로부터 총갯수 가져오기
		int totalcount=dao.getTotalCount();
		
		//출력은 이곳에서 설정
		List<MyCarDto> list=dao.listCart();
				
		//request에 저장
		model.addAttribute("totalcount",totalcount);
		model.addAttribute("list",list);

		return "car/carlist";
	}
	
	@GetMapping("/samsung/writeform")
	public String write() {
		
		return "car/carform";
	}
	
	@PostMapping("/samsung/write")
	public String insert(@ModelAttribute MyCarDto dto) {
		
		dao.insertCar(dto);
		
		return "redirect:list";
	}
	
	}
