package himedia.myportal.repositories;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.repositories.vo.GuestbookVo;

@Repository
public class GuestbookDaoImpl 
	implements GuestbookDao {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<GuestbookVo> selectAll() {
		List<GuestbookVo> list = sqlSession.selectList("guestbook.selectAll");
		return list;
	}

	@Override
	public int insert(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}


/*
 * import java.util.List;
 * 
 * import org.apache.ibatis.session.SqlSession; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Repository; import
 * org.springframework.stereotype.Service;
 * 
 * import himedia.myportal.repositories.vo.GuestbookVo;
 * 
 * @Repository
 * 
 * @Service public class GuestbookDaoImpl implements GuestbookDao {
 * 
 * @Autowired SqlSession guestbookDaoImpl; 이러면 applicationContext.xml의 어쩌고랑
 * 연결된거래
 * 
 * 
 * @Autowired SqlSession sqlSession; 이러면 applicationContext.xml의 어쩌고랑 연결된거래
 * 
 * @Override public List<GuestbookVo> selectAll() { // TODO Auto-generated
 * method stub return null; }
 * 
 * @Override public int insert(GuestbookVo vo) { // TODO Auto-generated method
 * stub return 0; }
 * 
 * @Override public int delete(GuestbookVo vo) { // TODO Auto-generated method
 * stub return 0; }
 * 
 * 
 * }
 */