package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MyAssignedPage {
	
	private WebDriver driver;
	By review=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div/select"));
	By reviewer=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div[1]/div/div/div[2]/div/div/div/div[1]/div/select"));	
	By expander=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[1]/a"));
	By requestNum=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div[2]/div/div/div[1]/div/div/div/div[1]/div/input"));
	By fundingYear=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div[2]/div/div/div[2]/div/div/div/div[1]/div/select"));
	By applyFilter=(By.xpath("//button[contains(.,'Apply Filter')]"));
	By checkbox = (By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div[4]/div[3]/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[2]/table/thead/tr/th[1]/input"));
	By selectReviewer=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div/div/div[5]/div[3]/div/div/div/div/div/div[1]/div/div/div[1]/div/div/div"));		
	By assignButton=(By.xpath("//button[contains(.,'Assign Case(s) to Reviewer')]"));
	By clickRequestLink=(By.partialLinkText("Auto"));
	
  public MyAssignedPage(WebDriver driver) {
	  this.driver = driver;
  }
  
  public void  selectRequest (String Review,String ReviewerType,String ComadRequestYear, String Request, String Reviewer) throws InterruptedException{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(review).sendKeys(Review);
		driver.findElement(review).sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		driver.findElement(reviewer).sendKeys(ReviewerType);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1500);
		driver.findElement(fundingYear).sendKeys(ComadRequestYear);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(requestNum).sendKeys(Request);
		driver.findElement(expander).click();
		Thread.sleep(1500);
		driver.findElement(applyFilter).click();
		Thread.sleep(1000);
		driver.findElement(clickRequestLink).click();
		
		}
  }