package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static PreparedStatement selectprod;
	static {
		try {
			conn=DBUtil.getMyConnection();
			selectprod=conn.prepareStatement("select * from product");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> findall() {
		List<Product> plist=new ArrayList<>();
		try {
			ResultSet rs=selectprod.executeQuery();
			plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4)));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
