package spring.answer.model;

import java.util.List;

public interface AnswerDaoInter {
	
	public void insertAnswer(AnswerDto dto);
	public List<AnswerDto> getListAnswer(int num);
	public int getCheckPass(int idx, String pass);
	public void deleteAnswer(int idx);
	
}
