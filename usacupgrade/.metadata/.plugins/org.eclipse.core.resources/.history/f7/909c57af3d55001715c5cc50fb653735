package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import dataSheet.Data;
import pages.LoginPage;
import pages.PostAssignmentPage;
import pages.SignOutPage;

public class ComadReview {
 
  LoginPage loginPage;
  WebDriver driver = new FirefoxDriver();
  Data testData = new Data(); 


@Test (priority=1)
public void frmUserLogin() {
	  //Data testData = new Data(); 
	 
	driver.get("https://portal-test4.appiancloud.com/suite");
	loginPage = new LoginPage(driver);
	loginPage.loginToUsac(testData.fRM(), testData.userPass() );
	  
}
@Test (priority=2)
public void frmSelectRequest() throws InterruptedException {

	PostAssignmentPage postAssign = new PostAssignmentPage(driver);
	postAssign.selectRequest(testData.reviewType(),testData.reviewerType(),testData.year(),testData.requestNum(),testData.reviewer());
}
@Test (priority=3)
public void frmSignOut() throws InterruptedException{
	SignOutPage signOut = new SignOutPage(driver);
	signOut.logout();
	
}

}