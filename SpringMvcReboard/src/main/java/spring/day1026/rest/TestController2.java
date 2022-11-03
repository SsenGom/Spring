package spring.day1026.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.day1026.data.BoardDao;
import spring.day1026.data.BoardDto;

@Controller
public class TestController2 {

	@Autowired
	BoardDao dao;
	
	// @ResponseBody 사용 json파일로 받을수 있음
	@GetMapping("/sist/list")
	public @ResponseBody List<BoardDto> list(){
		
		return dao.getList(0, 5);
	}
	
	@GetMapping("/sist/data")
	@ResponseBody
	public  BoardDto readdata(@RequestParam int num)
	{
		return dao.getData(num);
	}
}
