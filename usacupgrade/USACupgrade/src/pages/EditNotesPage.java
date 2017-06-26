package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class EditNotesPage {
  WebDriver driver;
  By checkbox=(By.xpath("//input[@type='checkbox']"));
  By editButton=(By.xpath("//button[contains(.,'Edit Note')]"));
  By textBox=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div/div/div[3]/div[3]/div/div/div/div/div/div[1]/div/div/div/div[1]/div/textarea"));
  By submitNoteChange=(By.xpath("//button[contains(.,'Submit Note Change')]"));
  By sendToNextLevel=(By.xpath("//button[contains(.,'Send to Next Reviewer')]"));
  By reviewCompleted=(By.xpath("//button[contains(.,'Review Completed')]"));
  
  public EditNotesPage(WebDriver driver) {
	this.driver=driver; 
	
	  }
  
  public void editReviewNotes() throws InterruptedException{
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(checkbox).click();  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(editButton).click(); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(textBox).sendKeys(Keys.CONTROL + "a");
	  driver.findElement(textBox).sendKeys("Adding Edit Note");  
	  Thread.sleep(1000);
	  driver.findElement(submitNoteChange).click();
	  Thread.sleep(1000);
	  driver.findElement(sendToNextLevel).click();
  }
  public void completeReviewNotes() throws InterruptedException{
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(checkbox).click();  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(editButton).click(); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  driver.findElement(textBox).sendKeys(Keys.CONTROL + "a");
	  driver.findElement(textBox).sendKeys("Adding Edit Note");  
	  Thread.sleep(1000);
	  driver.findElement(submitNoteChange).click();
	  Thread.sleep(1000);
	  driver.findElement(reviewCompleted).click();
  }
}
