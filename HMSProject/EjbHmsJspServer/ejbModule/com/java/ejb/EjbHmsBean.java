package com.java.ejb;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class EjbHmsBean
 */
@Stateless
@Remote(EjbHmsBeanRemote.class)
public class EjbHmsBean implements EjbHmsBeanRemote {
	
	@PersistenceContext(unitName = "EmpMgmtPU")
	private EntityManager entitymanager;
	

    /**
     * Default constructor. 
     */
    public EjbHmsBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String addPatientReport(PatientReport patientReport) {
		entitymanager.persist(patientReport);
		return "Patient Record Inserted...";
	}


}
