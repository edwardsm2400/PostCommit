package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class EditNotesPage {
  WebDriver driver;
  By checkbox=(By.xpath("//input[@type='checkbox']"));
  By checkbox1=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[2]/table/tbody[1]/tr[1]/td[1]/div"));
  By checkbox2=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[2]/table/tbody[1]/tr[2]/td[1]/div"));
  By checkbox3=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[2]/table/tbody[1]/tr[3]/td[1]/div"));
  By checkbox4=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div/div/div/div/div/div/div/div[3]/div/div/div[2]/table/tbody[1]/tr[4]/td[1]/div"));
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
	  Thread.sleep(2000);
	  driver.findElement(submitNoteChange).click();
	  Thread.sleep(1500);
	  driver.findElement(sendToNextLevel).click();
  }
  
  public void fourEditReviewNotes() throws InterruptedException{
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(checkbox1).click();  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(editButton).click(); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(textBox).sendKeys(Keys.CONTROL + "a");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  driver.findElement(textBox).sendKeys("Adding Edit Note");  
	  Thread.sleep(2000);
	  driver.findElement(submitNoteChange).click();
	  Thread.sleep(2000);
	  driver.findElement(checkbox2).click();  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(editButton).click(); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(textBox).sendKeys(Keys.CONTROL + "a");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  driver.findElement(textBox).sendKeys("Adding Edit Note");  
	  Thread.sleep(2000);
	  driver.findElement(submitNoteChange).click();
	  Thread.sleep(2000);
	  driver.findElement(checkbox3).click();  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(editButton).click(); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(textBox).sendKeys(Keys.CONTROL + "a");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  driver.findElement(textBox).sendKeys("Adding Edit Note");  
	  Thread.sleep(2000);
	  driver.findElement(submitNoteChange).click();
	  Thread.sleep(2000);
	  driver.findElement(checkbox4).click();  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(editButton).click(); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(textBox).sendKeys(Keys.CONTROL + "a");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  driver.findElement(textBox).sendKeys("Adding Edit Note");  
	  Thread.sleep(2000);
	  driver.findElement(submitNoteChange).click();
	  Thread.sleep(2000);
	  driver.findElement(sendToNextLevel).click();
  }
  
  
  
  public void completeReviewNotes() throws InterruptedException{
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(checkbox).click();  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(editButton).click(); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  driver.findElement(textBox).sendKeys(Keys.CONTROL + "a");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  driver.findElement(textBox).sendKeys("Adding Edit Note");  
	  Thread.sleep(2000);
	  driver.findElement(submitNoteChange).click();
	  Thread.sleep(1500);
	  driver.findElement(reviewCompleted).click();
  }
  
  public void fourCompleteReviewNotes() throws InterruptedException{
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	 /* driver.findElement(checkbox1).click();  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(editButton).click(); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(textBox).sendKeys(Keys.CONTROL + "a");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  driver.findElement(textBox).sendKeys("Adding Edit Note");  
	  Thread.sleep(2000);
	  driver.findElement(submitNoteChange).click();
	  Thread.sleep(2000);
	  driver.findElement(checkbox2).click();  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);  
	  driver.findElement(editButton).click(); 
	  Thread.sleep(1500);
	  driver.findElement(textBox).sendKeys(Keys.CONTROL + "a");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  driver.findElement(textBox).sendKeys("Adding Edit Note");  
	  Thread.sleep(2000);
	  driver.findElement(submitNoteChange).click();
	  Thread.sleep(2000);
	  driver.findElement(checkbox3).click();  
	  Thread.sleep(1500);
	  driver.findElement(editButton).click(); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(textBox).sendKeys(Keys.CONTROL + "a");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  driver.findElement(textBox).sendKeys("Adding Edit Note");  
	  Thread.sleep(2000);
	  driver.findElement(submitNoteChange).click();
	  Thread.sleep(2000);
	  driver.findElement(checkbox4).click();  
	  Thread.sleep(1500);
	  driver.findElement(editButton).click(); 
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(textBox).sendKeys(Keys.CONTROL + "a");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
	  driver.findElement(textBox).sendKeys("Adding Edit Note");  
	  Thread.sleep(2000);
	  driver.findElement(submitNoteChange).click();
	  Thread.sleep(2000);*/
	  driver.findElement(reviewCompleted).click();
  }
}
