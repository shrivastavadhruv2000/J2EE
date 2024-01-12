package com.demo.test;
import java.util.Scanner;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

public class TestCrud {

	public static void main(String[] args) {
		
		int choice=0;
		Scanner sc=new Scanner(System.in);
		UserService uservice=new UserServiceImpl();
		do {
			System.out.println("1. Add new USer\n2. Display all user\n 3. display by id");
			System.out.println("4. delete by id\n5. update by id\n 6. sort by id\n 7. exit");
			System.out.println("Choice : ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				uservice.addnewUser();
				break;
				
			}
			
		}while(choice!=7);

	}

}
