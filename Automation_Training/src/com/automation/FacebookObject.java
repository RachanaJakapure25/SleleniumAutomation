package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class FacebookObject  {
	
	private WebDriver driver;
	
	WrapperFunction objWrapperFunctio;
	
	 
	public FacebookObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		
	}
	
	public FacebookObject() {
		// TODO Auto-generated constructor stub
		objWrapperFunctio=new WrapperFunction(new BaseTest().initializeWebBrowser());
		
		
	}
	
	public void  setUserFirstName(String strFirstName){
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(strFirstName);
		objWrapperFunctio.waitMethod(5);
		
	}
	
public void  setUserLastName(String strLastName){
		
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(strLastName);
	objWrapperFunctio.waitMethod(5);
	
	}
	
	public void setUserMobileNumber(String strPhoneNumber){
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(strPhoneNumber);
		objWrapperFunctio.waitMethod(5);
		
	}
	
	public void setUserPassword(String strPassword){
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(strPassword);
		objWrapperFunctio.waitMethod(5);
	}
	
	public void setUserDateofBirth(String strDate){
		
		 objWrapperFunctio.SelectObjectCreate("//select[@name='birthday_date']", strDate); 
		 
		
	}
	
	public void setUserDateofMonth(String strMonth){
		
		objWrapperFunctio.SelectObjectCreate("//select[@name='birthday_month']", strMonth); 
		 
	}
	
	public void setUserDateofYear(String strYear){
		
		objWrapperFunctio.SelectObjectCreate("//select[@name='birthday_year']", strYear); 
		
	}
	
	public void setUserGender(String strGender){
		
		if(strGender.equalsIgnoreCase("female"))
			driver.findElement(By.xpath("//input[@id='u_2_4_xP']")).click();
		  
		if(strGender.equalsIgnoreCase("male"))
			driver.findElement(By.xpath("//input[@id='u_2_5_HI']")).click();
		else
			driver.findElement(By.xpath("//input[@id='u_2_6_mz]")).click();
			
	}
	
	
	
}
