package com.demo.service;

import java.util.List;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.model.Address;
import com.demo.model.MyUser;
import java.util.*;

public class UserServiceImpl implements UserService {
    
	public UserDao udao;
	Scanner sc=new Scanner(System.in);
	
	public UserServiceImpl() {
		udao=new UserDaoImpl();
	}
	public void addnewUser() {
		
		System.out.println("enetr user id");
		int uid=sc.nextInt();
		System.out.println("enetr user name");
		String uname=sc.next();
		System.out.println("enetr address id");
		int aid=sc.nextInt();
		System.out.println("enetr street");
		String street=sc.next();
		System.out.println("enetr city");
		String city=sc.next();
		MyUser u=new MyUser(uid,uname,new Address(aid,street,city));
		udao.save(u);
	}

	public List<MyUser> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
