package db.mysql.today;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/carmember")
public class CarMemberController {

	@Autowired
	CarMemberDaoInter daoInter;
	
	@GetMapping("/list")
	public String list(Model model) {
		
		//전체개수가져오기
		int count=daoInter.getTotalCount();
		
		//목록가져오기
		List<CarMemberDto> list=daoInter.getAllDatas();
		
		//목록 request에 갯수 저장
		model.addAttribute("count",count);
		model.addAttribute("list",list);
		
		return "carmember/list";
	}
	
	@GetMapping("/writeform")
	public String writeform() {
		return "carmember/addform";
	}
	
	@PostMapping("/write")
	public String insert(@ModelAttribute CarMemberDto dto) {
		daoInter.inserCarMember(dto);
		return "redirect:list";
	}
	
	@GetMapping("/detail")
	public String detail(Model model,@RequestParam String num) {
		
		CarMemberDto dto=daoInter.getData(num);
		model.addAttribute("dto",dto);
		
		return "carmember/detail";
	}
	@GetMapping("/updateform")
	public String update1(Model model,@RequestParam String num) {
		
		CarMemberDto dto=daoInter.getData(num);
		model.addAttribute("dto",dto);
		
		return "carmember/updateform";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute CarMemberDto dto)
	{
		daoInter.updateCarMember(dto);
		return "redirect:list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam String num)
	{
		daoInter.deleteCarMember(num);
		return "redirect:list";
	}

}
