package himedia.myportal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import himedia.myportal.repositories.GuestbookDao;
import himedia.myportal.repositories.vo.GuestbookVo;

@Service
public class GuestbookServicesImpl implements GuestbookServices {
	@Autowired
	GuestbookDao guestbookDaoImpl;
	
	@Override
	public List<GuestbookVo> getMessageList() {
		List<GuestbookVo> list =
				guestbookDaoImpl.selectAll();
		return list;
	}

	@Override
	public boolean writeMessage(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMessage(GuestbookVo vo) {
		// TODO Auto-generated method stub
		return false;
	}
	
}