package com.java.demo;

public class ValidateMain {
	
	public static void main(String[] args) {
		Login log = new Login();
		log.setUserName("Pramita");
		log.setPassCode("Pramita");
		Login login = new LoginDAOImpl().authenticate(log);
		if(login!=null) {
			System.out.println("correct");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
