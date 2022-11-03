package spring.answer.model;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnswerDao implements AnswerDaoInter {

	@Autowired
	private SqlSession session;
	
	@Override
	public void insertAnswer(AnswerDto dto) {
		// TODO Auto-generated method stub
		session.insert("InsertOfReAnswer",dto);
	}

	@Override
	public List<AnswerDto> getListAnswer(int num) {
		// TODO Auto-generated method stub
		return session.selectList("SelectNumOfReboard",num);
	}

	@Override //int, string 같이 둘의 자료형이 틀리면 object삽입
	public int getCheckPass(int idx, String pass) {
		// TODO Auto-generated method stub
		HashMap<String, Object> map =new HashMap<String, Object>();
		map.put("idx", idx);
		map.put("pass", pass);
		
		return session.selectOne("passCheckOfReanswer",map);
	}

	@Override
	public void deleteAnswer(int idx) {
		// TODO Auto-generated method stub
		session.delete("deleteOfAnswer",idx);
	}

}
