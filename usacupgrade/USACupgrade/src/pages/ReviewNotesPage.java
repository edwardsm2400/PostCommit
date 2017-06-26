package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ReviewNotesPage {
  WebDriver driver;
  By checkbox=(By.xpath("//input[@type='checkbox']"));
  By addButton=(By.xpath("//button[contains(.,'Add Note')]"));
  By textBox=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div/div/div[3]/div[3]/div/div/div/div/div/div[1]/div/div/div/div[1]/div/textarea"));
  By submitNotes=(By.xpath("//button[contains(.,'Submit New Note')]"));
  By sendToNextLevel=(By.xpath("//button[contains(.,'Send to Next Reviewer')]"));
  By reviewCompleted=(By.xpath("//button[contains(.,'Review Completed')]"));
  
  public ReviewNotesPage(WebDriver driver) {
	this.driver=driver; 
	
	  }
  
  public void addReviewNotes() throws InterruptedException{
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(checkbox).click();  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(addButton).click(); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(textBox).sendKeys("Adding New Note");  
	  Thread.sleep(1000);
	  driver.findElement(submitNotes).click();
	  Thread.sleep(1000);
	  driver.findElement(sendToNextLevel).click();
  }
  public void completeReviewNotes() throws InterruptedException{
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(checkbox).click();  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(addButton).click(); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(textBox).sendKeys("Adding New Note");  
	  Thread.sleep(1000);
	  driver.findElement(submitNotes).click();
	  Thread.sleep(1000);
	  driver.findElement(reviewCompleted).click();
  }
}