package com.technocredits.orangehrm.pages;

import com.technocredits.orangehrm.base.PredefinedMethods;

public class LoginPage extends PredefinedMethods{
	
	//This should follow the singleton pattern in order to remove the depedency for multiple creating of the object.
	private static LoginPage loginPage;
	private LoginPage() {
		super();
	}
	
	public static LoginPage getInstance() {
		if(loginPage==null) {
			loginPage=new LoginPage();
			
		}
		return loginPage;
	}
	
	
	public void enterValueForLoginPage(String locator, String value) {
		setText(locator, value);
	}

}
