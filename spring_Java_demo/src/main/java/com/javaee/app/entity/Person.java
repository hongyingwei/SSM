package com.javaee.app.entity;

public class Person {
    @Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", sex=" + sex + ", age=" + age + ", telNum=" + telNum
				+ ", email=" + email + "]";
	}

	public Person() {
		super();
	}

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	private Integer pid;
    private String name;
    private String sex;
    private Integer age;
    private String telNum;
    private String email;

    public Integer getPid() {
        return this.pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelNum() {
        return this.telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
