package himedia.myportal.exception;

import himedia.myportal.repositories.vo.UserVo;

public class UserDaoException extends RuntimeException {
	private UserVo userVo = null;
	
	// 기본 생성자 
	public UserDaoException() {
		
	}
	
	// 에러메세지 생성자 
	public UserDaoException(String message) {
		super(message);
	}
	
	public UserDaoException(String message, UserVo userVo) {
		super(message);
		this.userVo = userVo;
	}

}
