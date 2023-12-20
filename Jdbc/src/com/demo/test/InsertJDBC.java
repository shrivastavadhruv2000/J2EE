package com.demo.test;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.xdevapi.Statement;

public class InsertJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			String url="jdbc:mysql://localhost:3306/dhruv";
			
			Connection conn=DriverManager.getConnection(url,"root","123456788");
			
			String query="create table table1(tid int(20) primary key auto_increment,tname varchar(200) not null,tcity varchar(400))";
			
			
			java.sql.Statement stmt=conn.createStatement();
			stmt.executeUpdate(query);
			System.out.println("Table is Created");
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
