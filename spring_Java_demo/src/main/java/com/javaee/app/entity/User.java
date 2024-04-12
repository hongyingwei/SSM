package com.javaee.app.entity;

public class User extends Person {
    @Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", nick=" + nick
				+ ", regTime=" + regTime + ", pid=" + pid + "], " + super.toString();
	}

	private Integer userId;
    private String username;
    private String password;
    private String nick;
    private java.sql.Timestamp regTime;
    
    public User(String username, String nick) {
		this.username = username;
		this.nick = nick;
	}
    
    public User(String username, String nick, String name, String email) {
    	super(name, email);
		this.username = username;
		this.nick = nick;
	}

	public User() {
		super();
	}

	private Integer pid;

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public java.sql.Timestamp getRegTime() {
        return this.regTime;
    }

    public void setRegTime(java.sql.Timestamp regTime) {
        this.regTime = regTime;
    }

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
