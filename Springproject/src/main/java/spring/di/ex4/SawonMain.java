package spring.di.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ex3.MyInfo;
import spring.di.ex3.Person;

public class SawonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app=new ClassPathXmlApplicationContext("appContext4.xml");
		
		Sawon sa=app.getBean("saw", Sawon.class);
		sa.writeData();
	
		Sawon sa2=app.getBean("saw2",Sawon.class);
		sa2.writeData();
	}

	
}
