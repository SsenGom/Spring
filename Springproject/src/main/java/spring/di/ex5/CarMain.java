package spring.di.ex5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {

	public static void main(String[] args) {
		
		
		ApplicationContext app=new ClassPathXmlApplicationContext("annoConfig1.xml");
		
		MyCarController myCar=(MyCarController)app.getBean("myCarController");
		
		myCar.writeTire();
	}
}
