package com.java.ejb;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface EjbHMSProjectRemote {
	
	List<DOCTOR_MASTER> showDoctor();

}
