package com.java.ejb;

import javax.ejb.Remote;

@Remote
public interface EjbHmsBeanRemote {
	
	String addPatientReport(PatientReport patientReport);

}
