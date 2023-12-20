package com.demo.test;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class FirstJDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			
			String url ="jdbc:mysql://localhost:3306/dhruv?useSSL=false";
			String username="root";
			String password="123456788";
			Connection con=DriverManager.getConnection(url,username,password);
			
			if(con.isClosed()) {
				System.out.println("Connection is Closed");
			}
			else {
				System.out.println("Connection Created");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
