package com.javaee.springmvc.pojo;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student implements Serializable{
	
    @NotBlank(message = "�û�������Ϊ��")
    @Size(min = 3, max = 20, message = "�û������ȱ�����3��20���ַ�֮��")
    private String username;
 
    @NotBlank(message = "���벻��Ϊ��")
    @Size(min = 6, max = 20, message = "���볤�ȱ�����6��20���ַ�֮��")
    private String password;
    
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "�ֻ������ʽ����")
    public String phone;

    // getter��setter����
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [username=" + username + ", password=" + password + "]";
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
 
}