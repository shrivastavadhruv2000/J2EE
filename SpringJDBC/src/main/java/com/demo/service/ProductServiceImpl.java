package com.demo.service;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;
import com.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDao pdao;

	@Override
	public int addnewProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter pname");
		String pname=sc.next();
		System.out.println("enter qty");
		int qty=sc.nextInt();
		System.out.println("enter price");
		double price=sc.nextDouble();
		Product p=new Product(pid,pname,qty,price);
		return pdao.save(p);
		
	}

	@Override
	public int deleteById(int pid) {
		// TODO Auto-generated method stub
		return pdao.deleteById(pid);
	}

	@Override
	public int modifyById(int pid, int qty, double pr) {
		// TODO Auto-generated method stub
		return pdao.modifyById(pid,qty,pr);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return pdao.showAllProduct();
	}

}
