package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
  private WebDriver driver;


public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

  
  By agreeButton=(By.cssSelector(".btn, input.iBlueButton"));
  By username=By.id("un");
  By password=By.id("pw");
  By signInButton=(By.xpath("//input[@type='submit']"));
		  
 
  public void loginToUsac (String userid, String passid){
	  driver.findElement(agreeButton).click();
	  driver.findElement(username).sendKeys(userid);
	  driver.findElement(password).sendKeys(passid);
	  driver.findElement(signInButton).click();
  }
}
