package himedia.myportal.repositories;

public interface UserDao {
	public int insert(UserVo vo);
	public UserVo selectUser(String email);
	public UserVo selectUser(String email, String password);

}
