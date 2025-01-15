package himedia.myportal.repositories;


import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.exception.GuestbookDaoException;
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
		int insertedCount = 0;
		try {
			insertedCount = sqlSession.insert("guestbook.insert", vo);
			// PersistenceException or SQLException
		} catch (Exception e) {
			// 예외 전환
			throw new GuestbookDaoException("방명록 기록 중 에러 발생", vo);
		}
		
		return insertedCount;
	}

	@Override
	public int delete(GuestbookVo vo) {
		int deletedCount = 0;
		try {
			deletedCount = sqlSession.delete("guestbook.delete", vo);
		} catch (Exception e) {
			throw new GuestbookDaoException("방명록 삭제 중 에러 발생", vo);
		}
		return deletedCount;
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