package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int save(Product p) {
		
		return jdbcTemplate.update("insert into product values(?,?,?,?)", new Object[] {
			p.getPid(),p.getPname(),p.getQty(),p.getPrice()	
		});
	}
	@Override
	public int deleteById(int pid) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("delete from product where pid=?",new Object[] {pid});
	}
	@Override
	public int modifyById(int pid, int qty, double pr) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("update product set qty=?,price=? where pid=?",new Object[] {qty,pr,pid});
	}
	@Override
	public List<Product> showAllProduct() {
		// TODO Auto-generated method stub
		List<Product> lst=jdbcTemplate.query("Select * from product", (rs,num)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(4));
			p.setPrice(rs.getDouble(3));
			return p;
		});
		return lst;
	}
	
	

}
