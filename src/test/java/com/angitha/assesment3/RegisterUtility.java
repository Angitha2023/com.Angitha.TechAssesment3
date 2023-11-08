package com.angitha.assesment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
 
public class RegisterUtility {
	
String url, firstname, lastname, Email, Password, confirmpassword;
 
	
	public RegisterUtility(){
		data();
	}
	public void data() {
		File file = new File("C:\\Users\\avelayudhan\\eclipse_workspace02\\com.angithaVelayudhan.TechAssessment3\\src\\test\\resources\\Feature\\Register.feature");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		url = prop.getProperty("url");
		firstname = prop.getProperty("firstname");
		lastname = prop.getProperty("lastname");
		Email = prop.getProperty("Email");
		Password = prop.getProperty("Password");
		confirmpassword = prop.getProperty("confirmpassword");

	}
	

}
