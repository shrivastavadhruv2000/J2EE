package com.demo.service;

import java.util.List;

import com.demo.model.MyUser;

public interface UserService {
	void addnewUser();
	
	List<MyUser> getAllUsers();

}
