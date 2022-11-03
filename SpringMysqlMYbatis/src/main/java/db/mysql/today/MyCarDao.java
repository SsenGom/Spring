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
	
	//count
	
	public int getTotalCount() {
		return session.selectOne("totalCountOfMyCar");
	}
	
	
	//insert
	
	public void insertCar(MyCarDto dto) {
		session.insert("insertOfMyCar", dto);
	}
	
	//list
	
	public List<MyCarDto> listCart(){
	
		return session.selectList("listOfMyCar");
	}
	
	//selectone
	public MyCarDto getData(String num) {
		return session.selectOne("selectOneOfMycar",num);
	}
	
	//update
	public void updateCar(MyCarDto dto) {
		session.update("updateOfMyCar", dto);
	}
	
	//delete
	public void delete(String num) {
		session.delete("deleteOfMyCar", num);
	}
	
}

