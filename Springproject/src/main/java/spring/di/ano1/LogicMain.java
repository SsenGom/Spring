package spring.di.ano1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LogicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext app1=new ClassPathXmlApplicationContext("annoConfig1.xml");
		
		LogicController logic1=(LogicController)app1.getBean("logic");
		logic1.insert("Happy");
		logic1.delete("5");
	}

}
