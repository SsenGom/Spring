package spring.di.ano1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component ("logic") //명시적으로 줄 수 있음... else 첫글자가 소문자인 낙타
public class LogicController {

	@Autowired //자동주입
	DaoInter daointer;
	
	public LogicController(MyDao dao) {
		this.daointer=dao;
		
	}
	
	//insert
	public void insert(String str) {
		daointer.insertData(str);
	}
	
	//delete
	public void delete(String num) {
		daointer.deleteData(num);
	}
}
