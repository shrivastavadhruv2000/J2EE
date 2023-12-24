package com.demo.test;
import java.sql.*;

public class Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
			
			String url="jdbc:mysql://localhost:3306/dhruv?useSSL=false&allowPublicKeyRetrieval=true";
			Connection con=DriverManager.getConnection(url,"root","123456788");
			String query="insert into table1(tName,tCity) value(?,?)";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setString(1, "Dhruv Shrivastava");
			pstmt.setString(2, "Indore");
			
			pstmt.executeUpdate();
			
			System.out.println("inserted");
			
			con.close();
					
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
