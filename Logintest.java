package com.project.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Logintest extends Screenshotutility {
	
	WebDriver driver;
	ExtentReports extent;
	ExtentTest Logger;
	@BeforeMethod
	public void setup() {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("./Reports/practice2.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	    Logger=extent.createTest("LoginTest");
//		Logger.log(Status.INFO,"Login to manulife");
//		Logger.log(Status.PASS,"Login verified");
//		Logger.log(Status.FAIL, "details");
//		 extent.flush();
		
	}
	

	@Test
	public void login() throws IOException {
		
		System.setProperty("webdriver.gecko.driver","C:\\ffdriver\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.manulife.ca/personal.html");
		driver.getTitle();
		Assert.assertTrue(driver.getTitle().contains("Divya"));
	}
		
	
	
	@AfterMethod
	public void teardown(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
		String temp=Screenshotutility.getScreenshot(driver);
		

}
	}
}

