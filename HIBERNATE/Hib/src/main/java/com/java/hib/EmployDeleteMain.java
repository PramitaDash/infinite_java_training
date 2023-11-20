package com.java.hib;

import java.util.Scanner;


import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import antlr.collections.List;

public class EmployDeleteMain {
	public static void main(String[] args) {
		int empno;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Enploy no  ");
		empno = sc.nextInt();
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.createQuery("from Employ where empno="+empno);
		List<Employ> employList = query.list();
		if(employList.size()>0) {
			Employ employee = employList.get(0);
			Transaction tran = session.beginTransaction();
			session.delete(employee);
			tran.commit();
			System.out.println("***Record Deleted ***");
		}else {
			System.out.println("*** Employ Record Not Found***");
		}
		
	}

}
