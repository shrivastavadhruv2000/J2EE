package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {
	int save(Product p);

	int deleteById(int pid);

	int modifyById(int pid, int qty, double pr);

	List<Product> showAllProduct();

}
