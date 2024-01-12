package com.demo.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;

public class TestMyUserAddress {

	public static void main(String[] args) {
		Address addr=new Address(1,"Bhawarkua","Indore");
		Address addr1=new Address(2,"Rajwada","Indore");
        MyUser u1=new MyUser(10,"Dhruv",addr);
        MyUser u2=new MyUser(20,"Ashish",addr1);
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction tr=session.beginTransaction();
        session.save(u1);
        session.save(u2);
        tr.commit();
	}

}
