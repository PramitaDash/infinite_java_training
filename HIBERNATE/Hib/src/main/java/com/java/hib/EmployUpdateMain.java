package com.java.hib;



	import java.util.Scanner;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.AnnotationConfiguration;

	public class EmployUpdateMain {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Employ employ = new Employ();
			System.out.println("Enter employ No:");
			employ.setEmpno(sc.nextInt());
			System.out.println("Enter Employ Name:");
			employ.setName(sc.next());
			System.out.println("Enter Gender (MALE/FEMALE) ");
			employ.setGender(Gender.valueOf(sc.next()));
			System.out.println("Enter Department:");
			employ.setDept(sc.next());
			System.out.println("Enter Basic:");
			employ.setBasic(sc.nextDouble());
			AnnotationConfiguration cfg = new AnnotationConfiguration().configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(employ);
			transaction.commit();
			System.out.println("**Employ Record Updated**");
		}

	}


