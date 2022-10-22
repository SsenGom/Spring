package db.mysql.today;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyCarDao {
	
	@Autowired
	private SqlSession session;
	
	public int getTotalCount() {
		return session.selectOne("totalCountOfMyCar");
	}
	
	
	public void insertCar(MyCarDto dto) {
		session.insert("insertOfMyCar", dto);
	}
	
	public List<MyCarDto> listCart(){
	
		return session.selectList("listOfMyCar");
	}
}

