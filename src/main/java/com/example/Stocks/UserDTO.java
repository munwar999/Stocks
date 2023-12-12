package com.example.Stocks;

public class UserDTO {
	private String f_name;
	private String l_name;
	private String email;
	private String mobile_no;
	private String password;
	
	
	public UserDTO(String f_name, String l_name, String email,String mobile_no, String password) {
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
		this.password = password;
		this.mobile_no = mobile_no;
	}

	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
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
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	

}

