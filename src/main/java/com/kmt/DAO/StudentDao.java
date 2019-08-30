package com.kmt.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.kmt.pojo.Students;

public class StudentDao {
	
	public Students fetchStudentData() {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Students student = session.load(Students.class, 1);
		return student;
		
	}

}
