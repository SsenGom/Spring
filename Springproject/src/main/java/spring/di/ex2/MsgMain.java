package spring.di.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MsgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("기존 자바방식으로 생성후 호출");
		MessageInter m1=new Message1();
		m1.sayHello("철수");
		
		MessageInter m2=new Message2();
		m2.sayHello("영이");
		
		System.out.println("스프링방식으로 객체 생성후 호출");
		ApplicationContext context=new ClassPathXmlApplicationContext("appContext2.xml");
		
		MessageInter m3=(Message1)context.getBean("mesBean1");
		m3.sayHello("마이클");
		MessageInter m4=context.getBean("mesBean2",Message2.class);
		m4.sayHello("존");
	}

}
