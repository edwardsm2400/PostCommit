<<<<<<< HEAD
//added nothing

//  adding after changes 


// Final test


// should work now
=======

>>>>>>> e825d54c4df58e32cc7dbec58b867cbf6f48250b
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import dataSheet.Data;
import pages.LoginPage;
import pages.RecordsPage;

public class LoginTest {
	
	LoginPage loginPage;
	
	 WebDriver driver = new FirefoxDriver();
	 
	@Test (priority=1)
	public void userLogin() {
		  Data testData = new Data(); 
		 
		  driver.get("https://portal-int.appiancloud.com/suite/");
		  
		  loginPage = new LoginPage(driver);
				  
		  loginPage.loginToUsac(testData.userName(), testData.userPass() );
		  
	  }
	@Test (priority=2)
	public void recordsTab(){
		RecordsPage recordsPage = new RecordsPage(driver);
		  recordsPage.clickAppeals();
	}
	}
