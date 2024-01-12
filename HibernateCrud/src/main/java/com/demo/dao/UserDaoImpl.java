package com.demo.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.model.MyUser;

public class UserDaoImpl implements UserDao {

	static SessionFactory sf;
	static {
		sf=HibernateUtil.getMySessionFactory();
	}
	public void save(MyUser u) {
		
		// TODO Auto-generated method stub
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(u);
		tr.commit();
		session.close();
		
	}

}
