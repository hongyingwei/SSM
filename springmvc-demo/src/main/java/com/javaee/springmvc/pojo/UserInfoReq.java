package com.javaee.springmvc.pojo;

import java.io.Serializable;
import java.util.List;

public class UserInfoReq implements Serializable{
	private List<String> honors;
	private int id;
	private List<User> teamMembers;
	private String teamName;
	
	public List<String> getHonors() {
		return honors;
	}
	public void setHonors(List<String> honors) {
		this.honors = honors;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<User> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<User> teamMembers) {
		this.teamMembers = teamMembers;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	@Override
	public String toString() {
		return "UserInfoReq [honors=" + honors + ", id=" + id + ", teamMembers=" + teamMembers + ", teamName="
				+ teamName + "]";
	}
}
