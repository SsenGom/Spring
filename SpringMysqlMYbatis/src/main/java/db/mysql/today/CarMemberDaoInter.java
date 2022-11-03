package db.mysql.today;

import java.util.List;


public interface CarMemberDaoInter {

	public int getTotalCount();
	public List<CarMemberDto> getAllDatas();
	public void inserCarMember(CarMemberDto dto);
	public CarMemberDto getData(String num);
	public void updateCarMember(CarMemberDto dto);
	public void deleteCarMember(String num);
}
