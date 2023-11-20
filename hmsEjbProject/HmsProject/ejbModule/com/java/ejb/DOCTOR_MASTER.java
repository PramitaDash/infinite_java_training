package com.java.ejb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="DOCTOR_MASTER")
public class DOCTOR_MASTER implements Serializable{
		
	
		@Id
		@GeneratedValue
		@Column(name="drid")
		private String drid;
		@Column(name="drname")
		private String  drname;
		@Column(name="dept")
		private String dept;
		public String getDrid() {
			return drid;
		}
		public void setDrid(String drid) {
			this.drid = drid;
		}
		public String getDrname() {
			return drname;
		}
		public void setDrname(String drname) {
			this.drname = drname;
		}
		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}
		public DOCTOR_MASTER(String drid, String drname, String dept) {
			super();
			this.drid = drid;
			this.drname = drname;
			this.dept = dept;
		}
		public DOCTOR_MASTER() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "DOCTOR_MASTER [drid=" + drid + ", drname=" + drname + ", dept=" + dept + "]";
		}
		
		
		
		

	}


