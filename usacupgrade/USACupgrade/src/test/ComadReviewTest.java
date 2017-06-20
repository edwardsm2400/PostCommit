package test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import dataSheet.Data;
import pages.ComadMainPage;
import pages.LoginPage;
import pages.PostAssignmentPage;
import pages.RecordsPage;
import pages.RelatedActionsPage;
import pages.ReviewNotesPage;
import pages.SignOutPage;

public class ComadReviewTest {
 
  LoginPage loginPage;
  WebDriver driver = new FirefoxDriver();
  Data testData = new Data(); 


@Test (priority=1)
public void finalReviewManagerLogin() {
	  //Data testData = new Data(); 
	 
	driver.get("https://portal-test4.appiancloud.com/suite");
	loginPage = new LoginPage(driver); 
	loginPage.loginToUsac(testData.ComadFinalReviewManager(), testData.userPassword() );
	  
}
@Test (priority=2)
public void finalReviewManagerAssignRequest() throws InterruptedException {

	PostAssignmentPage postAssign = new PostAssignmentPage(driver);
	postAssign.selectRequest(testData.ComadReviewType(),testData.ComadFinalReviewerType(),testData.ComadRequestYear(),testData.ComadRequestNumber(),testData.ComadFinalReviewerName());
}
@Test (priority=3)
public void finalReviewManagerSignOut() throws InterruptedException{
	SignOutPage signOut = new SignOutPage(driver);
	signOut.logout();
	
}

@Test (priority=4)
public void finalReviewerLogin(){

	loginPage.loginToUsac(testData.ComadFinalReviewer(), testData.userPassword() );
}

@Test (priority=5)
public void finalReviewerSelectRequest() throws InterruptedException {

	RecordsPage records = new RecordsPage(driver);
	records.clickComad(testData.ComadRequestNumber());
}

@Test (priority=6)
public void finalReviewerRelatedActions(){
	ComadMainPage mainPage = new ComadMainPage(driver);
	mainPage.clickRelatedActions();

}

@Test (priority=7)
public void finalReviewerAddReviewNotes(){
	RelatedActionsPage relatedActions = new RelatedActionsPage(driver);
	relatedActions.clickAddReviewNotes();
	
}
@Test (priority=8)
public void finalReviewerSubmitNote() throws InterruptedException{
	ReviewNotesPage notesPage = new ReviewNotesPage(driver);
	notesPage.addReviewNotes();
	
}
@Test (priority=9)
public void finalReviewerSignOut() throws InterruptedException{
	SignOutPage signOut = new SignOutPage(driver);
	signOut.logout();
}

@Test (priority=10)
public void qareviewManagerLogin(){

	loginPage.loginToUsac(testData.ComadQaManager(), testData.userPassword() );
}

@Test (priority=11)
public void qaReviewManagerAssignRequest() throws InterruptedException {

	PostAssignmentPage postAssign = new PostAssignmentPage(driver);
	postAssign.selectRequestAsOther(testData.ComadReviewType(),testData.ComadQaReviewerType(),testData.ComadRequestYear(),testData.ComadRequestNumber(),testData.ComadQaReviewerName());
}
@Test (priority=12)
public void qaReviewManagerSignOut() throws InterruptedException{
	SignOutPage signOut = new SignOutPage(driver);
	signOut.logout();
}

@Test (priority=13)
public void qaReviewerLogin(){

	loginPage.loginToUsac(testData.ComadQaReviewer(), testData.userPassword() );
}

@Test (priority=14)
public void qaReviewerSelectRequest() throws InterruptedException {

	RecordsPage records = new RecordsPage(driver);
	records.clickComad(testData.ComadRequestNumber());
}

@Test (priority=15)
public void qaReviewerRelatedActions(){
	ComadMainPage mainPage = new ComadMainPage(driver);
	mainPage.clickRelatedActions();

}

@Test (priority=16)
public void qaReviewerAddReviewNotes(){
	RelatedActionsPage relatedActions = new RelatedActionsPage(driver);
	relatedActions.clickAddReviewNotes();
	
}
@Test (priority=17)
public void qaReviewerSubmitNote() throws InterruptedException{
	ReviewNotesPage notesPage = new ReviewNotesPage(driver);
	notesPage.addReviewNotes();
	
}
@Test (priority=18)
public void qaReviewerSignOut() throws InterruptedException{
	SignOutPage signOut = new SignOutPage(driver);
	signOut.logout();
}
@Test (priority=19)
public void usacReviewManagerLogin(){

loginPage.loginToUsac(testData.ComadUsacManager(), testData.userPassword() );
}

@Test (priority=20)
public void usacReviewManagerAssignRequest() throws InterruptedException {

	PostAssignmentPage postAssign = new PostAssignmentPage(driver);
	postAssign.selectRequestAsOther(testData.ComadReviewType(),testData.ComadUSACReviewerType(),testData.ComadRequestYear(),testData.ComadRequestNumber(),testData.ComadUsacReviewerName());
}
@Test (priority=21)
public void usacReviewManagerSignOut() throws InterruptedException{
	SignOutPage signOut = new SignOutPage(driver);
	signOut.logout();
}
@Test (priority=22)
public void usacReviewerLogin(){

loginPage.loginToUsac(testData.ComadUsacReviewer(), testData.userPassword() );
}

@Test (priority=23)
public void usacReviewerSelectRequest() throws InterruptedException {

	RecordsPage records = new RecordsPage(driver);
	records.clickComad(testData.ComadRequestNumber());
}

@Test (priority=24)
public void usacReviewerRelatedActions(){
	ComadMainPage mainPage = new ComadMainPage(driver);
	mainPage.clickRelatedActions();

}

@Test (priority=25)
public void usacReviewerAddReviewNotes(){
	RelatedActionsPage relatedActions = new RelatedActionsPage(driver);
	relatedActions.clickAddReviewNotes();
	
}

@Test (priority=26)
public void usacReviewerSubmitNote() throws InterruptedException{
	ReviewNotesPage notesPage = new ReviewNotesPage(driver);
	notesPage.completeReviewNotes();
}
}