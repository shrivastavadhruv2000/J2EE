package com.demo.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("emp")
public class Employee {
	
	@Value("101")
	private int empid;
	@Value("Dhruv")
	private String ename;
	public Employee() {
		super();
		System.out.println("Default Constructor");
	}
	public Employee(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
		System.out.println("Parameterised cons");
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
		System.out.println(" setEmpid");
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
		System.out.println("setEname");
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + "]";
	}
	

}
