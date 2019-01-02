package com.project.sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Chrome {
	String ExpCustName="Grace Heath";
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://yapstone1470429971.zendesk.com/access/normal/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='user_email']")).click();
			driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("selenium.test@yapstone.com");
			driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("S-test2019!");
			driver.findElement(By.xpath("//input[@class='button primary']")).click();
//			WebDriverWait wait=new WebDriverWait(driver,100);
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ember2263']//*[local-name()='svg']/*[local-name()='path']")));
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			WebElement svgElement=driver.findElement(By.xpath("//div[@id='ember2263']//*[local-name()='svg']/*[local-name()='path']"));
			
			((JavascriptExecutor)driver).executeScript("arguments[0].click();",svgElement);
		//svgElement.click();
           //Find table
			WebElement table=driver.findElement(By.xpath("//div[@id='table4']/table[@id='table5']"));
			try {
				Thread.sleep(9000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//find the row
			WebElement row=table.findElement(By.xpath("//tbody/tr/td[contains(text(),'Jason Littrell')]"));
			row.click();
	}
}


