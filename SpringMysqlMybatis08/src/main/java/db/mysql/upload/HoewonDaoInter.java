package db.mysql.upload;

import java.util.List;
import java.util.Map;

public interface HoewonDaoInter {

	public int getTotalCount();
	public void insertHoewon(HoewonDto dto);
	
	//public List<HoewonDto> getAllDatas();
	public List<HoewonDto> getAllDatas(Map<String, String> map);
	public HoewonDto getData(String num);
	public void updateHoewon(HoewonDto dto);
}
