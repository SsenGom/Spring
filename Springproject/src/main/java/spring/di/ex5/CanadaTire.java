package spring.di.ex5;

import org.springframework.stereotype.Component;

@Component
public class CanadaTire implements Tire {

	@Override
	public void writeTireName() {
		// TODO Auto-generated method stub
		System.out.println("캐나다 타이어");
	}

}
