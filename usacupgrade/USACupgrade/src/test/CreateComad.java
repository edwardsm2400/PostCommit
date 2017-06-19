package test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import dataSheet.Data;
import pages.ActionsPage;
import pages.LoginPage;
import pages.RecordsPage;
import pages.SelectFrnPage;
import pages.SelectRecord;


public class CreateComad {
	
		LoginPage loginPage;
		WebDriver driver = new FirefoxDriver();
		Data testData = new Data(); 
	
	 
	@Test (priority=1)
	public void userLogin() {
		  //Data testData = new Data(); 
		 
		driver.get("https://portal-test4.appiancloud.com/suite");
		loginPage = new LoginPage(driver);
		loginPage.loginToUsac(testData.userName(), testData.userPass() );
		  
	  }
	@Test (priority=2)
	public void actionsTab() throws InterruptedException {
	
	
		ActionsPage actionsPage = new ActionsPage(driver);
		actionsPage.clickInitiate();
	}
	
	@Test (priority=3)
	public void selectFrn() throws InterruptedException, AWTException{
		SelectFrnPage selectFrnpage = new SelectFrnPage(driver);
		selectFrnpage.selectingFrn(testData.comadFrn(), testData.recoveryType());
		selectFrnpage.comadDetails(testData.requestName(), testData.narrative());
		selectFrnpage.comadConfirm();
		
		
	}
	}