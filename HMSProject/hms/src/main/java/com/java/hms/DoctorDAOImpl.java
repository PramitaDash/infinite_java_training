package com.java.hms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DoctorDAOImpl implements DoctorDAO {
	
	SessionFactory sf;
	Session session;

	@Override
	public List<DOCTOR_MASTER> showDoctorDao() {
		sf = SessionHelper.getConnection();
		session = sf.openSession();
		Criteria criteria = session.createCriteria(DOCTOR_MASTER.class);
		List<DOCTOR_MASTER> DoctorList = criteria.list();
		return DoctorList;
	
	}

}
