package com.jsu.testspringmvc.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
	private int id;
	@NotBlank(message = "用户名不能为空")
	@Size(min = 1, max = 20, message = "用户名长度必须在3到20个字符之间")
	private String user_name;
	
	@NotBlank(message = "密码不能为空")
    @Size(min = 1, max = 20, message = "密码长度必须在6到20个字符之间")
	private String password;
	private String cnname;
	private int sex;
	private String mobile;
	private String email;
	private String note;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCnname() {
		return cnname;
	}

	public void setCnname(String cnname) {
		this.cnname = cnname;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", user_name='" + user_name + '\'' +
				", password='" + password + '\'' +
				", cnname='" + cnname + '\'' +
				", sex=" + sex +
				", mobile='" + mobile + '\'' +
				", email='" + email + '\'' +
				", note='" + note + '\'' +
				'}';
	}
}
