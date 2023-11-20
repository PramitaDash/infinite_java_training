package com.java.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EjbHMSProject
 */
@Stateless
@LocalBean
public class EjbHMSProject implements EjbHMSProjectRemote {

    /**
     * Default constructor. 
     */
    public EjbHMSProject() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<DOCTOR_MASTER> showDoctor() {
		// TODO Auto-generated method stub
		return null;
	}

}
