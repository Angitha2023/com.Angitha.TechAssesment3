package com.angitha.assesment3;

import org.openqa.selenium.support.PageFactory;

public class LoginHomePageActions {

LoginHomePageLocators loginHomePageLocators = null;
	
	public  LoginHomePageActions() {  
		this.loginHomePageLocators = new LoginHomePageLocators();
		PageFactory.initElements(HelperClass.getDriver(),loginHomePageLocators);
	}
	public String getVerifyText() {
		return loginHomePageLocators.assertContains.getText();
	}
	public String VerifyErrorMessage() {
		return loginHomePageLocators.VerifyErrorMessage.getText();
	}

	



}
