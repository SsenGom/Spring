package db.mysql.upload;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HoewonDao implements HoewonDaoInter {

	@Autowired
	private SqlSession session;
	
	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return session.selectOne("selectCountOfHoewon");
	}

	@Override
	public void insertHoewon(HoewonDto dto) {
		// TODO Auto-generated method stub
		session.insert("insertOfHoewon", dto);
	}

	/*
	 * @Override public List<HoewonDto> getAllDatas() { // TODO Auto-generated
	 * method stub return session.selectList("selectAllOfHoewon"); }
	 */
	@Override
	public List<HoewonDto> getAllDatas(Map<String, String> map) {
		// TODO Auto-generated method stub
		return session.selectList("selectAllOfHoewon",map);
	}

	@Override
	public HoewonDto getData(String num) {
		// TODO Auto-generated method stub
		return session.selectOne("selectOneOfHoewon",num);
	}

	@Override
	public void updateHoewon(HoewonDto dto) {
		// TODO Auto-generated method stub
		session.update("insertOfHoewon", dto);
	}

}
