package spring.di.ex5;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class MyCarController {
	
	//@Autowired 구현할 클래스가 한개일 경우 자동주입, 아닐 경우에는 문제가 발생
	//이럴경우 정확하게 bean의 이름으로 주입
	
	//@Resource(name="koreaTire")
	@Resource(name="canadaTire")
	Tire tire;
	
	public void writeTire() {
		System.out.println("내차의 타이어 브랜드는 **");
		tire.writeTireName();
	}
}
