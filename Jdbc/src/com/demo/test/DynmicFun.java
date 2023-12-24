package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.io.*;

public class DynmicFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			String url="jdbc:mysql://localhost:3306/dhruv?useSSl=false&allowPublicKeyRetrival=true";
			Connection con=DriverManager.getConnection(url,"root","123456788");
			
			String query="insert into table1(tName,tCity) value(?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			
			System.out.println("Enter name:");
			String name=br.readLine();
			System.out.println("Enter city:");
			String city=br.readLine();
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			
			pstmt.executeUpdate();
			
			System.out.println("inserted");
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
