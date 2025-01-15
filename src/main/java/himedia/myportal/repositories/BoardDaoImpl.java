package himedia.myportal.repositories;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import himedia.myportal.exception.BoardDaoException;
import himedia.myportal.repositories.vo.BoardVo;


@Repository
public class BoardDaoImpl implements BoardDao {
	@Autowired
	SqlSession sqlSession;

	@Override
	public List<BoardVo> selectAll() {
		List<BoardVo> list = sqlSession.selectList("board.selectAll");
		return list;
	}

	@Override
	public int insert(BoardVo boardVo) {
		try {
			return sqlSession.insert("board.insert", boardVo);
		} catch (Exception e) {
			throw new BoardDaoException("게시물 삽입 중 예외 발생", boardVo);
		}
		
	}

	@Override
	public BoardVo getContent(Long no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long no, Long userNo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
