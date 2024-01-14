package com.demo.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.demo.model.HelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BeanFactory bc=new XmlBeanFactory(new ClassPathResource("springconfig.xml"));
        ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		System.out.println("before");
        HelloWorld hello=(HelloWorld) ctx.getBean("hw");
        System.out.println("after");
		System.out.println(hello.sayHello());
       
	}

}
