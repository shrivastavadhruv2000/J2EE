package com.demo.model;

import java.util.List;

public class Student {
	private int sid;
	private String name;
	private List<String> hobbies;
	private List<Skills> slist;
	public Student(int sid, String name, List<String> hobbies, List<Skills> slist) {
		super();
		this.sid = sid;
		this.name = name;
		this.hobbies = hobbies;
		this.slist = slist;
	}
	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public List<Skills> getSlist() {
		return slist;
	}
	public void setSlist(List<Skills> slist) {
		this.slist = slist;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", hobbies=" + hobbies + ", slist=" + slist + "]";
	}
	

}
