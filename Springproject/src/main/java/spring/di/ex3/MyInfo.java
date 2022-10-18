package spring.di.ex3;

public class MyInfo {

	String name;
	int age;
	String addr;
	
	//생성자
	public MyInfo(String name, int age, String addr) {
		
		this.name=name;
		this.age=age;
		this.addr=addr;
	}
	
	//메서드
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MyInfo[name="+name+", age="+age+", addr="+addr+"]";
	}
	
}
