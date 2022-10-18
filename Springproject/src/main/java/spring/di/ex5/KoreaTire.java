package spring.di.ex5;

import org.springframework.stereotype.Component;

@Component
public class KoreaTire implements Tire {

	@Override
	public void writeTireName() {
		// TODO Auto-generated method stub
		
		System.out.println("한국타이어");
	}

}
