package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SelectRecord {
	 WebDriver driver;
	  
	  By userSearch=(By.xpath("/html/body/div[7]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div[1]/div[2]/input"));
	
  public void record(String Record) {
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(userSearch).sendKeys(Record);
	  driver.findElement(userSearch).sendKeys(Keys.ENTER);
	  
  }
}
