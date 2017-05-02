package com.itg.highcost.cucumber.testDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TestSteps {
	static WebDriver driver; 
	
	@Given ("^user opens browser$")
	public static void openBroswer (){
		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver = new ChromeDriver();	
	}
	
	@And ("^user navigates to application$")
	public static void navigateToApp (){	
		driver.get("https://portal-hctest.appiancloud.com/suite/tempo/");
	}
	@And ("^clicks agree button$")
	public static void clickAgree (){	
		driver.findElement(By.xpath("//input[@type='button']")).click();
	}
	
	@When ("^user enters username \"([^\"]*)\"$")
	public static void enterUsername (String username){
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys(username);
	}
	
	@And ("^user enters password \"([^\"]*)\"$")
	public static void enterPassword (String password){
		driver.findElement(By.xpath("//input[@id='pw']")).sendKeys(password);
	}
	@And ("^user enters submit") 
	public static void enterSubmit (){
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
	}
	@Then ("^user is able to log into system") 
	public static void verfiyLogin (){
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Test pa1')]")));
		WebElement userProfile = driver.findElement(By.xpath("//a[contains(.,'Test pa1')]"));
		Assert.assertTrue(userProfile.isDisplayed());
		driver.close();
	}
	@Then ("^user is not able to log into system") 
	public static void verfiyNotLogin (){
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='message']")));
		WebElement errorMessage = driver.findElement(By.xpath("//div[@class='message']"));
		Assert.assertTrue(errorMessage.isDisplayed());
		System.out.println(errorMessage.getText());
		driver.close();
	}
}