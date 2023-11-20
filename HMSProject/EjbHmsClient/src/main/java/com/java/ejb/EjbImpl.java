package com.java.ejb;

import javax.naming.NamingException;

public class EjbImpl {
	
	public String addPatientReport(PatientReport patientReport) throws NamingException {
		EjbHmsBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		System.out.println(patientReport);
		remote.addPatientReport(patientReport);
		return "EmployDaoTable.jsp?faces-redirect=true";
	}

}
