package com.java.demo;

import java.util.List;

public interface EmployDAO {
	List<Employ> showEmployDao();
	Employ searchEmployDao(int empno);
	String addEmployDAO(Employ employ);
	List<Employ> showEmployCr();
	Employ searchEmployCr(int empno);
}
