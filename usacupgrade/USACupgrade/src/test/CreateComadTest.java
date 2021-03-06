package test;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import dataSheet.Data;
import pages.ActionsPage;
import pages.LoginPage;
import pages.PostAssignmentPage;
import pages.RecordsPage;
import pages.SelectFrnPage;
import pages.SelectRecord;
import pages.SignOutPage;


public class CreateComadTest {
	
		LoginPage loginPage;
		WebDriver driver = new FirefoxDriver();
		Data testData = new Data(); 
	
		
	@Test (priority=1)
	public void userLogin() {
		 
		//driver.get("https://portal-test4.appiancloud.com/suite");
		driver.get("https://portal-test.usac.org/suite/");
		loginPage = new LoginPage(driver);
		loginPage.loginToUsac(testData.userName(), testData.userPassword() );
		  
	  }
	@Test (priority=2)
	public void actionsTab() throws InterruptedException {
	
	
		ActionsPage actionsPage = new ActionsPage(driver);
		actionsPage.clickInitiate();
	}
	
	@Test (priority=3)
	public void selectFrn() throws InterruptedException, AWTException{
		SelectFrnPage selectFrnpage = new SelectFrnPage(driver);
		selectFrnpage.selectingFrn(testData.ComadFrn(), testData.ComadRecoveryType());
		selectFrnpage.comadDetails(testData.ComadRequestName(), testData.ComadNarrative());
		//selectFrnpage.comadConfirm();
		
	}
	/*
	@Test (priority=4)
	public void initiatorSignOut() throws InterruptedException{
		SignOutPage signOutpage = new SignOutPage(driver);
		signOutpage.logout();
	}
	
	@Test (priority=5)
	public void initialReviewManagerLogin(){
		loginPage = new LoginPage(driver);
		loginPage.loginToUsac(testData.ComadInitialReviewManager(), testData.userPassword() );
	}
	
	@Test (priority=6)
	public void initialReviewManagerAssign() throws InterruptedException{
		PostAssignmentPage postAssign = new PostAssignmentPage(driver);
		postAssign.selectRequest(testData.ComadReviewType(),testData.ComadFinalReviewerType(),testData.ComadRequestYear(),testData.ComadRequestNumber(),testData.ComadFinalReviewerName());
		
}*/

}

