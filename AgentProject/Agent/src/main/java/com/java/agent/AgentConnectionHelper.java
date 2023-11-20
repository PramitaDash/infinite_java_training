package com.java.agent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AgentConnectionHelper {
	
public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		
		ResourceBundle rb = ResourceBundle.getBundle("Agent");
		String driver = rb.getString("driver");
		String url = rb.getString("url");
		String user = rb.getString("user");
		String pwd = rb.getString("password");
		
		Connection connection = null;
		Class.forName(driver);
		connection = DriverManager.getConnection(url, user, pwd);
		return connection;
	}

}
