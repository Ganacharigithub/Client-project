package com.project.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Yapstone {
	
	

	@Test
	public void login() {
		
		
		
		System.setProperty("webdriver.gecko.driver","C:\\ffdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://yapstone1470429971.zendesk.com/access/normal/");
//	WebElement iframe=driver.findElement(By.xpath("//div[3]/iframe"));
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@id='user_email']")).click();
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("selenium.test@yapstone.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("S-test2019!");
		driver.findElement(By.xpath("//input[@class='button primary']")).click();
//		WebDriverWait wait=new WebDriverWait(driver,200);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ember2259']/a[@href='/agent/filters']"))).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='ember2251']/a[@href='/agent/filters']/span")).click();
		
	}

}
