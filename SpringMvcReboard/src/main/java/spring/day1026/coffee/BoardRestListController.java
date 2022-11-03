package spring.day1026.coffee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.day1026.data.BoardDao;

@RestController
public class BoardRestListController {

	@Autowired
	BoardDao dao;
	
	
	
}
