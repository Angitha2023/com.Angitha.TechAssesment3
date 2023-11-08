package com.TechAssessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	//Include unique element "wishlist"
	@FindBy(xpath="//span[contains(text(),'Wishlist')]")
	public WebElement HomepageText;
	
	@FindBy(xpath="//span[contains(text(),'unsuccessful')]")
	public WebElement errorMessage;

	
	
}
