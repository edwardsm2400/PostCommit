package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SignOutPage {
  
  private WebDriver driver;


  public SignOutPage(WebDriver driver) {
  		this.driver = driver;
  	}
By outName=(By.cssSelector(".appian-body .GJEWJWHDIFC a"));
By signOut=(By.partialLinkText("Sign Out")); 

    public void logout () throws InterruptedException{
    Thread.sleep(1500);
    driver.findElement(outName).click();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.findElement(signOut).click();
    
    	
    	
}

}