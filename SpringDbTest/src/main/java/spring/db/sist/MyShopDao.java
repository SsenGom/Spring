package spring.db.sist;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MyShopDao {

	@Autowired
	private SqlSession session;

	public List<MyShopDto> getAllList(){
		
		return session.selectList("getAlllistOfMyShop"); /*sellectList파라메타 값 1개짜리는 메서드에 파라메타값이 없을 때, 있으면 2개짜리 */
	}
}
