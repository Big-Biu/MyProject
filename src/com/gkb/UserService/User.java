package com.gkb.UserService;

public class User {
	private String id=null;
	private String name=null;
	private String psw=null;
	private String position=null;
	private String sex=null;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public User(String id, String name, String psw, String position, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.psw = psw;
		this.position = position;
		this.sex = sex;
	}
	public User() {
		super();
	}
}
