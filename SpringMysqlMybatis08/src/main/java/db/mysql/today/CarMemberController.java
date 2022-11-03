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
	public String list(Model model)
	{
		//전체개수가져오기
		int count=daoInter.getTotalCount();
		//목록가져오기
		List<CarMemberDto> list=daoInter.getAllDatas();
		
		//request에 개수저장
		model.addAttribute("totalCount", count);
		model.addAttribute("list", list);
		
		return "carmember/list";
	}
	
	@GetMapping("/writeform")
	public String form()
	{
		return "carmember/addform";
	}
	
	@PostMapping("/write")
	public String insert(@ModelAttribute CarMemberDto dto)
	{
		daoInter.insertCarMember(dto);
		return "redirect:list";
	}
	
	//상세페이지 보기
	@GetMapping("/detail")
	public String detailPage(Model model,@RequestParam String num)
	{
		CarMemberDto dto=daoInter.getData(num);
		model.addAttribute("dto", dto);
		return "carmember/detailPage";
	}
	
	//수정폼이동
	@GetMapping("/updateform")
	public String updateform(Model model,@RequestParam String num)
	{
		CarMemberDto dto=daoInter.getData(num);
		model.addAttribute("dto", dto);
		return "carmember/updateform";
	}
	
	//수정
	@PostMapping("/update")
	public String update(@ModelAttribute CarMemberDto dto)
	{
		daoInter.updateCarMember(dto);
		return "redirect:list";
	}
	
	//삭제
	@GetMapping("/delete")
	public String delete(@RequestParam String num)
	{
		daoInter.deleteMember(num);
		return "redirect:list";
	}
	
}
