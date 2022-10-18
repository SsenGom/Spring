package spring.di.ano1;

import org.springframework.stereotype.Component;

@Component //자동으로 빈에 등록(id는 클래스명, 단 첫글자는 소문자 즉.. myDao가 아이디가 된다)
public class MyDao implements DaoInter {

	@Override
	public void insertData(String str) {
		// TODO Auto-generated method stub

		System.out.println(str+"_데이터 db추가 성공!");
		
	}

	@Override
	public void deleteData(String num) {
		// TODO Auto-generated method stub

		System.out.println(num+"_에 해당하는 데이터 삭제 성공!");
	
		
	}

}
