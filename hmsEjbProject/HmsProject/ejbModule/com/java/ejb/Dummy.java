package com.java.ejb;

public class Dummy {
	
	public static void main(String[] args) {
		try {
			System.out.println(new ().showDoctor());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
