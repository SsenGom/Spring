package spring.di.ex3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InfoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("appContext3.xml");
		
		//MyInfo부터 먼저 생성후 확인
		MyInfo my=(MyInfo)context.getBean("my");
		//값확인
		System.out.println(my.toString());
		
		//Person
		Person p=(Person)context.getBean("person");
		//값확인
		p.write();
	}

}
