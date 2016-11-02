package com.tnz.test.bean;

public class People {

	private Long id;

	private String userName;
	
	private String birthday;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "People [id=" + id + ", userName=" + userName + ", birthday=" + birthday + "]";
	}

}
