package db.mysql.market;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MarketDao implements MarketDaoInter {

	@Autowired
	private SqlSession session;
	
	@Override
	public int GetCount() {
		// TODO Auto-generated method stub
		return session.selectOne("CountOfMarket");
	}

	@Override
	public List<MarketDto> AllList() {
		// TODO Auto-generated method stub
		return session.selectList("AllListOfMarket");
	}

}
