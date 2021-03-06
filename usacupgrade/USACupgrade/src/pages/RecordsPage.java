package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class RecordsPage {
  
  
  WebDriver driver;
  
  By records=(By.partialLinkText("Records"));
  By appeals=(By.partialLinkText("Appeals"));
  By comad=(By.linkText("COMAD"));
  By servicesub=(By.partialLinkText("Service Substitutions"));
  By search=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/input"));
  By clickRequestLink=(By.partialLinkText("Auto - "));
  
  
  public RecordsPage(WebDriver driver) {
	  this.driver=driver;
  }
  
  public void clickAppeals() {
  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
  driver.findElement(records).click();    
  driver.findElement(appeals).click();  
  }
  
  public void clickComad(String Request) throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(records).click();
	  Thread.sleep(1000);
	  driver.findElement(comad).click();  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(search).sendKeys(Request);
	  driver.findElement(search).sendKeys(Keys.ENTER);
	  Thread.sleep(1500);
	  driver.findElement(clickRequestLink).click();
	  
	  }
  
  public void clickServiceSub() {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(records).click();
	  driver.findElement(servicesub).click();  
	  }
}
