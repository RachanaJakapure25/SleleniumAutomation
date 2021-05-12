package com.automation;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	
private  WebDriver driver=null;
	
	 
	
	public BaseTest() {
	// TODO Auto-generated constructor stub
}

	public  WebDriver initializeWebBrowser() throws ExceptionInInitializerError {
		if(driver==null){
			
			System.setProperty("webdriver.chrome.driver","G:/eclipse/Automation_Training/src/ExternalResource/chromedriver.exe");
			
			driver=new ChromeDriver();
		}
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}

public  void tearDown(){
		
		driver.close();
	}
	
}
