package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static PreparedStatement insprod;
	static {
		try {
			conn=DBUtil.getMyConnection();
//			selectprod=conn.prepareStatement("select * from Product1");
			insprod=conn.prepareStatement("insert into product values(?,?,?,?)");
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
	

	

	@Override
	public void save(Product p) {
		// TODO Auto-generated method stub
		try{
			insprod.setInt(1, p.getPid());
			insprod.setString(2,p.getPnm());
			insprod.setInt(3, p.getQty());
			insprod.setDouble(4,p.getPrice());
			int n=insprod.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		 	
	}

}
