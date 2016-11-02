package com.tnz.test.bean;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

	private Long id;

	private String userName;

	private String passwd;

	private Date birthday;

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

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", userName=" + userName + ", passwd=" + passwd + ", birthday=" + birthday + "]";
	}

}
