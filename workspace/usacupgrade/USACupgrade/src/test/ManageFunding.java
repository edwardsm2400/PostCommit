package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import dataSheet.Data;
import pages.LoginPage;
import pages.RecordsPage;


public class ManageFunding {
  
	LoginPage loginPage;
	
	
  WebDriver driver = new FirefoxDriver();
	 
	/*@Test (priority=1)
	public void firstTest() {
		  Data testData = new Data(); 
		 
		  driver.get("https://portal-hctest.appiancloud.com/suite/");
		  
		  loginPage = new LoginPage(driver);
				  
		  loginPage.loginToUsac(testData.getProgramAnalystName(), testData.getProgramAnalystPass() );
		  
	  }
	

	@Test (priority=2)
	public void secondTest(){
		RecordsPage recordsPage = new RecordsPage(driver);
		  recordsPage.ClickUsers();
	}
	@Test (priority=3)
	public void thirdTest(){
		Data testData = new Data(); 
		selectUser = new SelectUser();
		
		selectUser.pickUser(testData.getUser());
		
	}*/
	}