package com.demo.model;

import java.util.Set;

import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.*;
public class Employee {
	public Employee() {
		super();
	}
	@Id
	private int empid;
	private String ename;
	@ManyToMany
	@JoinTable(name="emp_proj11",joinColumns= {@JoinColumn(name="empid")},
	inverseJoinColumns= {@JoinColumn(name="projid")})
	Set<Project> pset;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Set<Project> getPset() {
		return pset;
	}
	public void setPset(Set<Project> pset) {
		this.pset = pset;
	}
	public Employee(int empid, String ename, Set<Project> pset) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.pset = pset;
	}
	
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}

}
