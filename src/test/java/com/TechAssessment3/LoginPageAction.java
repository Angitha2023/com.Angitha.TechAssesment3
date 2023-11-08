//package com.TechAssessment3;
//
//import org.openqa.selenium.support.PageFactory;
//
//public class LoginPageAction {
//
//	LoginPageLocators loginPageLocators = null;
//	
//		String strUserName, strPassword;
//		
//		public  LoginPageAction() {  //constructor
//			this.loginPageLocators = new LoginPageLocators();
//			PageFactory.initElements(HelperClass.getDriver(),loginPageLocators);
//		}
//		
//		//set username in textbox
//		public void setUserName(String strUserName) {
//			loginPageLocators.username.sendKeys(strUserName);
//		}
//		
//		public void setPassword(String strPassword) {
//			loginPageLocators.password.sendKeys(strPassword);
//		}
//		
//		public void clickLogin() {
//			loginPageLocators.login.click();
//		}
//		
//		
//		public void login(String strUsername, String strPassWord) {
//			this.setUserName(strUsername);
//			this.setPassword(strPassWord);
//		}
//	 
//	}
//
