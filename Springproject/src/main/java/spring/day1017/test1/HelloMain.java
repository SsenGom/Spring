package spring.day1017.test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("자바방식으로 Hello메서드 호출하기");
		
		Hello hello1=new Hello();
		Hello hello2=new Hello();
		
		System.out.println(hello1.getMessage());
		
		System.out.println(hello1==hello2); //레퍼런스 주소비교
		//자바에서는 new로 생성할때마다 새로운 영역에 생성한다
		
		System.out.println("스프링방식으로 Hello메서드 호출하기");
		
		//설정xml파일 가져와서 어플리케이션 실행(웹에서는 필요없다)
		ApplicationContext app1=new ClassPathXmlApplicationContext("appContext1.xml");
	
		//Hello 객체 생성
		Hello h1=(Hello)app1.getBean("hello"); //방법1
		System.out.println(h1.getMessage());
		
		Hello h2=app1.getBean("hello", Hello.class); //방법2
		System.out.println(h2.getMessage());
		
		System.out.println(h1==h2); //true- 생성주소가 같다, 스프링에서는 기본이 싱글톤
	}

}
