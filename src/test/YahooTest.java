package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class YahooTest {
	
	 @BeforeSuite
	 public void initializeSelenium(){
		 System.out.println("In the very beggining-initialize the selenium");
		 //Selenium object-webdriver
	 }
	 
	 @AfterSuite
	 public void shutdownSelenium(){
System.out.println("In the very end-destroy the selenium");
		//destroy the selenium objects-webdriver
	 }
	
	 @BeforeTest
	 public void openConn() {
		 System.out.println("Connecting to DB");
		//Connection to DB and other things which are required before starting execution of any TC
	  }
	 
	 @AfterTest
	 public void closeConn(){
		 System.out.println("Closing connection to DB");
	 }
	  
	  @BeforeMethod
	  public void openBrowser() {
		  System.out.println("Opening Browser");
		  //suppose for each TC we need to open different browser then we can write that code here for opening required browsers 
		  //as per TC requirement
	  }
	  
	  @AfterMethod 
	  public void closeBrowser(){
		  System.out.println("Closing Browser");
	  }
	
	  @Test
	  public void testReceiveMail() {
		  //Selenium Code
		  System.out.println("Testing Receiving mail");
	  }
  
	  @Test
	  public void testSendMail() {
		  //Selenium Code
		  System.out.println("Testing Sending Mail");
	  }
  
  

 

}
