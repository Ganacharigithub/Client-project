package com.project.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshotutility {
	
	public static String getScreenshot(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
//		String path1="C:\\Users\\Divya\\Documents\\Screenprints";
		File Destination=new File(path);
		try {
			FileUtils.copyFile(src, Destination);
		}catch(IOException e) {
			System.out.println("Capture Failed"+e.getMessage());
		}
		return path;
		
	}
	}


