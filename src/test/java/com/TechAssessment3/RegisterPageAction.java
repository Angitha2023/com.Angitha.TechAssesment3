package com.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageAction {

	RegisterPageLocators registrationpagelocators= null;
	
	String strFirstName, strlastName, stremail ,strpassWord;
	
	public  RegisterPageAction() {  
		//constructor
		this.registrationpagelocators = new RegisterPageLocators();
		PageFactory.initElements(HelperClass.getDriver(),registrationpagelocators);
	}
	
	//set username in textbox
	public void setFirstName(String strFirstName) {
		registrationpagelocators.firstname.sendKeys(strFirstName);
	}
	
	public void setLastName(String strlastName) {
		registrationpagelocators.Lastname.sendKeys(strlastName);
	}
	
	public void setEmail(String stremail) {
		registrationpagelocators.email.sendKeys(stremail);
	}
	
	public void setpassword(String strpassWord) {
		registrationpagelocators.passWord.sendKeys(strpassWord);
	}
	
	public void setConpassword(String strConpassword) {
		registrationpagelocators.Conpassword.sendKeys(strConpassword);
	}
	

	
	public void clickRadioButton() {
		registrationpagelocators.radioButton.click();
	}
	
	
	
	public void login(String strFirstName, String strlastName) {
		this.setFirstName(strFirstName);
		this.setLastName(strlastName);
	}
	
	
	
}

