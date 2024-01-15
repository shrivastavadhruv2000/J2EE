package com.demo.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.demo.model.*;
public class TestWiring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springcon.xml");
		MyUser u1=(MyUser) ctx.getBean("u1");
		System.out.println(u1);
		MyUser u2=(MyUser) ctx.getBean("u2");
		System.out.println(u2);
		Student s1=(Student) ctx.getBean("st1");
		System.out.println(s1);
		MyUser u3=(MyUser) ctx.getBean("u3");
		System.out.println(u3);
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
