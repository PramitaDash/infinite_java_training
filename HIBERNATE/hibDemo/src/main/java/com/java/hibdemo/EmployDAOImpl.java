package com.java.hibdemo;

import java.util.List;

import javax.faces.event.ValueChangeEvent;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;

public class EmployDAOImpl{
	
	SessionFactory sf;
    Session session;
	
	private String localCode;  

    public String getLocalCode() {

		return localCode;

	}

	public void setLocalCode(String localCode) {
		this.localCode = localCode;

	}


	public void employLocaleCodeChanged(ValueChangeEvent e) {
		this.localCode=e.getNewValue().toString();



	}



	

	public List<String> getNames(){

   	 sf=SessionHelper.getConnection();
   	 session=sf.openSession();
   	 Criteria cr=session.createCriteria(Employ.class);
   	 Projection projection=Projections.property("name");
   	 cr.setProjection(projection);
   	 List<String> list=cr.list();

   	 return list;

    }

    public List<String> getDepartments(){

   	 sf=SessionHelper.getConnection();
   	 session=sf.openSession();
   	 Criteria cr=session.createCriteria(Employ.class);
   	 Projection projection=Projections.distinct(Projections.property("dept"));
   	 cr.setProjection(projection);
   	 List<String> list=cr.list();

   	 return list;

    }

}