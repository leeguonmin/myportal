package himedia.myportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import himedia.myportal.repositories.vo.BoardVo;

@Service
public class BoardServiceImpl implements BoardService {

	@Override
	public List<BoardVo> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVo getContent(Integer no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean write(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(BoardVo boardVo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByNoAndUserNo(Integer no, Long userNo) {
		// TODO Auto-generated method stub
		return false;
	}

}
