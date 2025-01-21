package himedia.myportal.repositories.vo;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

// 마이sql 추가하고 Vo 생성 했음 

public class UserVo {
	private Integer no;
	
	@NotEmpty
	@Length(min=2, max=8)
	private String name;
	
	@NotEmpty
	@Email
	private String email;
	
	@NotEmpty
	@Length(min=4, max=20)
	private String password;
	
	@NotNull
	private String gender;
	private Date joinDate;
	
	
	// 생성자
	public UserVo() {
		super();
	}
	
	

	public UserVo(String name, String email, String password, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
	}



	public UserVo(Integer no, String name, String email, String password, String gender, Date joinDate) {
		super();
		this.no = no;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.joinDate = joinDate;
	}



	// 겟셋 
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}


	//투스트링
	@Override
	public String toString() {
		return "UserVo [no=" + no + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", joinDate=" + joinDate + "]";
	}
	
	
	
	

}


// 생성자, 겟셋 등등을 손쉽게 만들어주는 라이브러리가 롬복
