package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ComadMainPage {
	WebDriver driver;
	By summary=(By.linkText("Summary"));
	By relatedActions=(By.partialLinkText("Related Actions"));
	By comadReviewers=(By.linkText("COMAD Reviewers Summary"));
	By comments=(By.linkText("Comments"));
	By relatedRequests=(By.linkText("Related Requests"));
	By reviewNote=(By.linkText("Review Note History"));
	By reviewHistory=(By.linkText("Review History"));
	By associatedFrns=(By.linkText("Assocaited FRNs"));
	By documtents=(By.linkText("Documents"));
	By adjustmentAmount=(By.linkText("Adjustment Amount"));
	
  public ComadMainPage(WebDriver driver) {
	this.driver=driver;

  }
  public void clickRelatedActions() {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(relatedActions).click();    
}}
