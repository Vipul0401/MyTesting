package com.sdet;

import java.util.ResourceBundle;

public class App {
	
	public int userLogin(String in_user, String in_pwd)
	{
		ResourceBundle rb1=ResourceBundle.getBundle("config");
		String userName=rb1.getString("username");
		String password=rb1.getString("password");
		
		if ((in_user.equals(userName)) && (in_pwd.equals(password)))
			return 1;
		else
			return 0;
		
	}
	
	

}
