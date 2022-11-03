package db.mysql.today;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository //dao등록 
public class CarMemberDao implements CarMemberDaoInter {

	@Autowired
	private SqlSession session;
	
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return session.selectOne("totalCountOfCarMember");
	}

	@Override
	public List<CarMemberDto> getAllDatas() {
		// TODO Auto-generated method stub
		return session.selectList("selectAllCarMember");
	}

	@Override
	public void inserCarMember(CarMemberDto dto) {
		// TODO Auto-generated method stub
		session.insert("insertOfCarMember",dto);
	}

	@Override
	public CarMemberDto getData(String num) {
		// TODO Auto-generated method stub
		return session.selectOne("selectOneOfCarMember",num);
	}

	@Override
	public void updateCarMember(CarMemberDto dto) {
		// TODO Auto-generated method stub
		session.update("updateOfCarMember", dto);
	}

	@Override
	public void deleteCarMember(String num) {
		// TODO Auto-generated method stub
		session.update("deleteOfMyMember", num);
	}


	

}
