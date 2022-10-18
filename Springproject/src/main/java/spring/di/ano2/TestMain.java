package spring.di.ano2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ano1.LogicController;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ApplicationContext app3=new ClassPathXmlApplicationContext("annoConfig1.xml");
		
		MysqlControler logic1=(MysqlControler)app3.getBean("Mysql");
		logic1.insert("한지혜");
		logic1.delete("3");
		logic1.select("김유정");
		
	}

}
