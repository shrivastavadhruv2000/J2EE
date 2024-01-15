package com.demo.service;
import java.util.Scanner;
import com.demo.beans.*;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	private ProductDao pdao;
	public ProductServiceImpl() {
		pdao=new ProductDaoImpl();
	}

	@Override
	public void addnewProduct() {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter pname");
		String pname=sc.next();
		System.out.println("enter qty");
		int qty=sc.nextInt();
		System.out.println("enter price");
		double price=sc.nextDouble();
		Product p=new Product(pid,pname,qty,price);
		pdao.save(p);


		
	}

}
