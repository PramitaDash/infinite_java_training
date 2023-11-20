package com.java.hms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PatientDAOImpl implements PatientDAO {
	
	SessionFactory sf;
	Session session;

	
	public String addPatientDao(Patient_master patient) {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Transaction trans = session.beginTransaction();
		session.save(patient);
		System.out.println(patient);
		trans.commit();
		return "patient added";
	}


	@Override
	public List<Patient_master> showPatientDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(Patient_master.class);
		List<Patient_master> Patientlist = criteria.list();
		return Patientlist;
		// TODO Auto-generated method stu
	}

}
