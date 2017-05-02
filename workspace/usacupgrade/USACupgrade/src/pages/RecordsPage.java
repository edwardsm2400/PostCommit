package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RecordsPage {
  
  
  WebDriver driver;
  
  By records=(By.partialLinkText("Records"));
  By appeals=(By.partialLinkText("Appeals"));
  By comad=(By.partialLinkText("COMAD"));
  By users=(By.partialLinkText("Users"));
  
  
  public RecordsPage(WebDriver driver) {
	  this.driver=driver;
  }
  
  public void clickAppeals() {
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
  driver.findElement(records).click();    
  driver.findElement(appeals).click();  
  }
  
  public void clickComad() {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(records).click();
	  driver.findElement(comad).click();  
	  }
  
  public void clickUsers() {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(records).click();
	  driver.findElement(users).click();  
	  }
}
