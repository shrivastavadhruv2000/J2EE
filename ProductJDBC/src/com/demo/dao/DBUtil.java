package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	static Connection conn=null;
	
	public static Connection getMyConnection() {
		if(conn==null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/dhruv?useSSl=false&allowPublicKeyRetrival=true";
				Connection con=DriverManager.getConnection(url,"root","123456788");
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
		
		
	}
	public static void closeMyConnection() {
		if(conn!=null) {
			try {
				conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
