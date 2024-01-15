package com.demo.test;
import java.util.Scanner;

import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProductCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ProductService pservice=new ProductServiceImpl();
		int choice =0;
		do {
			System.out.println("1. add new product\n2. Delete product\n3. modify product");
			System.out.println("4. display all\n5. display by id\n6. display in sorted order of price\n 7. exit");
			System.out.println("Choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				pservice.addnewProduct();
			}
		}while(choice!=7);

	}

}
