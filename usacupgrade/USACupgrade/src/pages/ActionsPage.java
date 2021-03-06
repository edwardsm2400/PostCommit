package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ActionsPage {
	
	private WebDriver driver;
	 By actions=(By.partialLinkText("Actions"));
	 By initiateComad=(By.partialLinkText("Initiate COMAD"));
	
 
  public ActionsPage(WebDriver driver) {
	  this.driver = driver;
	  }
  
  
  public void clickInitiate () throws InterruptedException{
	  //Thread.sleep(2000);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(actions).click();
	  driver.findElement(initiateComad).click();
	  
  }

}
