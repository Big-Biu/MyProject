package com.gkb.UserService;

public class Grade {
	private String id=null;
	private String name=null;
	private String subject=null;
	private String grade=null;
	private String teacher=null;
	public Grade(String id, String name, String subject, String grade,
			String teacher, String note) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.grade = grade;
		this.teacher = teacher;
		this.note = note;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	private String note=null;
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Grade(String id, String name, String subject, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.grade = grade;
	}
	public Grade() {
		super();
	}
}
