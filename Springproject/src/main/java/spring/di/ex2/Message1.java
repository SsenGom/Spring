package spring.di.ex2;

public class Message1 implements MessageInter {

	@Override
	public void sayHello(String name) {
		// TODO Auto-generated method stub

		System.out.println("저는" +name+"입니다");
	}

}
