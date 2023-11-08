//package com.TechAssessment3;
//
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public final class StepDefanitionLogin {
//
//	UtilityClass data = new UtilityClass();
//	LoginPageAction objLogin = new LoginPageAction();
//	HomePageActions objHome = new HomePageActions();
//	
//		
//	@Given("User launches the website")
//	public void user_launches_the_website() {
//		HelperClass.openPage(data.url);
//	    System.out.println("login page");	
//	}
//
//	
//	@When("User enters the valid username and password")
//	public void user_enters_the_valid_username_and_password() {
//		objLogin.login(data.username, data.password);
//		System.out.println("Username and password");
//	}
////
//	
//	@Then("User successfully loged in the application")
//	public void user_successfully_loged_in_the_application() {
//		objLogin.clickLogin();
//		System.out.println("login button");
//		Assert.assertTrue(objHome.getVerifyText().contains("Dashboard"));
//		System.out.println("sucessfull login");
//	}
//	
//	
////	@When("User enters the Invalid username and password")
////	public void user_enters_the_invalid_username_and_password() {
////	 
////		
////		
////	}
////
////	
////	@Then("User able to see the error message")
////	public void user_able_to_see_the_error_message() {
////	   
////		
////		
////	}
//
//	
////	@Given("User can login to the demo application")
////	public void user_can_login_to_the_demo_application() {
////		HelperClass.openPage(data.url);
////	    System.out.println("login page");
////	}
//// 
////	@When("User clicks Login")
////	public void user_clicks_login() {
////		objLogin.loginClick();
////	}
//// 
////	@When("User enters Email and Password")
////	public void user_enters_email_and_password() {
////		objLogin.login(data.username, data.password);
////		System.out.println("User logged in");
////	}
//// 
////	@When("User clicks login button")
////	public void user_clicks_login_button() {
////		objLogin.clickLogin();
////		System.out.println("User clicks login ");
////	}
//// 
////	@Then("User logged in sucessfully")
////	public void user_logged_in_sucessfully() {
////		Assert.assertTrue(objHome.getVerifyText().contains("tomcruize@gmail.com"));
////		System.out.println("sucessfull login");
////	}
//// 
////	@Then("Login will be unsucessful with error message")
////	public void login_will_be_unsucessful_with_error_message() {
////		Assert.assertTrue(objHome.VerifyErrorMessage().contains("Login was unsuccessful. Please correct the errors and try again."));
////		System.out.println("User logged in with invalid credentials");
//// 
////	}
////}
//// 
////	
////	
////	
//	
//}
//
//
