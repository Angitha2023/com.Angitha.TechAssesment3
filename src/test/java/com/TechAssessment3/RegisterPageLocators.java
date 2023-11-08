package com.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	
	@FindBy(xpath="//input[@id='gender-female']")
	public WebElement radioButton;

	@FindBy(xpath="//input[@id='FirstName']")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@id='LastName']")
	public WebElement Lastname;
	
	@FindBy(xpath="//input[@id=\"Email\"]")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='Password']")
	public WebElement passWord;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	public WebElement Conpassword;
	
}

