package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RelatedActionsPage {
	WebDriver driver;
	
	By manageCct=(By.partialLinkText("Manage CCTs & Outreach"));
	By manageEscalations=(By.partialLinkText("Manage Escalations"));
	By logNewCase=(By.partialLinkText("Log New Case Activity"));
	By addReviewNotes=(By.partialLinkText("Add Review Notes"));
	By manageDocuments=(By.partialLinkText("Manage Documents"));
	By manageHolds=(By.partialLinkText("Manage Holds"));
	By viewAdjustmentAmount=(By.partialLinkText("View Adjustment Amount"));
	By manageComadHolds=(By.partialLinkText("Manage COMAD Holds"));
	
	
  public RelatedActionsPage(WebDriver driver) {
	  this.driver=driver;
  }

public void clickAddReviewNotes(){
	driver.findElement(addReviewNotes).click();

}}
