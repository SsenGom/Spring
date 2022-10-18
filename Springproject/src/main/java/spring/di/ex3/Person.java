package spring.di.ex3;

public class Person {

	String schoolName;
	MyInfo info; //my인포의 멤버값들을 모두 가짐
	
	//생성자
	public Person(MyInfo info) {
		super(); //모든 메서드는 객체를 상속받는다
		this.info=info;
	}
	
	//setter
	public void setSchoolName(String schoolName) {
		this.schoolName=schoolName;
	}
	
	//출력
	public void write() {
		System.out.println("***학생정보출력***");
		System.out.println("학교명: "+schoolName);
		System.out.println("이름: "+info.name);
		System.out.println("나이: "+info.age);
		System.out.println("주소: "+info.addr);
	}
}
