package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class SelectFrnPage {
	
	private WebDriver driver;
	
	By year=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div[1]/div/div/div[1]/div/div/div/div[1]/div/select"));
	By frn=(By.xpath("//label[contains(text(),'FRN')]"));
	By search=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div/div/div[2]/div[3]/div/div/div/div/div/div/div[2]/button[2]"));
	By checkbox = (By.xpath("//input[@type='checkbox']"));
	By addFrn= (By.xpath("//button[contains(.,'Add')]"));
	By continueOn =  (By.xpath("//button[contains(.,'Continue')]"));
	By recovery = (By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div/div/div[5]/div[3]/div/div/div/div/div/div/div/div/div[3]/div/table/tbody/tr/td[7]/div/div/div/div[1]/div/select"));
	By adjustment = (By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div/div/div[5]/div[3]/div/div/div/div/div/div/div/div/div[3]/div/table/tbody/tr/td[8]/div/div/div/div[1]/div/select"));
	By primary = (By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div/div/div[5]/div[3]/div/div/div/div/div/div/div/div/div[3]/div/table/tbody/tr/td[6]/div/div/div[1]/div/div/span/input"));
	By nickname=(By.xpath("//label[contains(text(),'Nickname')]"));
	By narrative=(By.xpath("//label[contains(text(),'Narrative')]"));
	By origin=(By.xpath("/html/body/div[6]/div[2]/div/div[2]/div/div[2]/div[2]/div/div/div/div/div/form/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div/div/div/div/div[3]/div/div/div/div[1]/div/select"));
	By submit=  (By.xpath("//button[contains(.,'Submit')]"));
	By confirm = (By.cssSelector(".appian-body .GJEWJWHDCGB h5"));
	
	public SelectFrnPage(WebDriver driver) {
	  this.driver = driver;
	  }
  
  
  public void selectingFrn (String frnNum, String recoveryType) throws InterruptedException{
	  
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(year).sendKeys("2016");
	  driver.findElement(year).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  driver.findElement(frn).sendKeys(frnNum);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(search).click();
	  Thread.sleep(2000);
	  driver.findElement(checkbox).click();
	  Thread.sleep(1500);
	  driver.findElement(addFrn).click();
	  Thread.sleep(1500);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(primary).click();
	  Thread.sleep(1000);
	  driver.findElement(recovery).sendKeys(recoveryType);
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(adjustment).sendKeys("CIPA Violation");
	  Thread.sleep(1000);
	  driver.findElement(continueOn).click();
	  }
  
  public void comadDetails () throws InterruptedException, AWTException{
	  String text = "C:\\USAC Project\\PostCommit\\usacupgrade\\upload.xlsx";
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
		Robot robot = new Robot();
		
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(nickname).sendKeys("Nickname goes here");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  driver.findElement(narrative).sendKeys("Story of my life");
	  Thread.sleep(1500);
	  driver.findElement(origin).sendKeys("Appeals");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@type='file']")).click();
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(2500);
		driver.findElement(submit).click();
		
  }
  
  public void comadConfirm (){
	  
	  
  }
}
