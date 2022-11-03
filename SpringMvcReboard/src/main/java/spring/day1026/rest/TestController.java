package spring.day1026.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.day1026.data.BoardDao;
import spring.day1026.data.BoardDto;

//일반적인 메서드는 못쓰고 제이슨 변환만 할 수 있는 콘트롤러
//따로 에이젝스 작업시 필요한 제이슨만 모아놔도 좋음
@RestController
public class TestController {

	@Autowired
	BoardDao dao;
	
	@GetMapping("/sist/list2")
	public List<BoardDto> list()
	{
		return dao.getList(0, 3);
	}
	
	@GetMapping("sist/data2")
	public BoardDto readdata(@RequestParam int num)
	{
		return dao.getData(num);
	}
}
