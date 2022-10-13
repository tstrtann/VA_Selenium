package com.trains.org.project.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iBrowser {
	static WebDriver driver;
	static String url = "https://google.com";
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		IBrowsers("edge");
		Screenshots();
		Thread.sleep(2000);
		driver.close();
	}

	// create a method with argument to input name of browser 
	public static void IBrowsers(String NameOfBrowser) {
		if(NameOfBrowser.equalsIgnoreCase("chrome")) { 			// Chrome Driver
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			String handle = driver.getWindowHandle();
			System.out.println("Chrome Driver: "+handle);
		}else if (NameOfBrowser.equalsIgnoreCase("edge")) { 	// Edge Driver 
			System.setProperty("webdriver.edge.driver", "/usr/local/bin/msedgedriver");
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			String handle = driver.getWindowHandle();
			System.out.println("Edge Driver: "+handle);
		}else if(NameOfBrowser.equalsIgnoreCase("safari")) {	// Safari Driver 
			driver = new SafariDriver();
			driver.get(url);
			driver.manage().window().maximize();
			String handle = driver.getWindowHandle();
			System.out.println("Safari Driver: "+handle);
		}
	}
	
	// Create method for screenshot
	public static void Screenshots() throws IOException{
		Date dateSS = new Date();
		String screenshotDate = dateSS.toString().replace(" ", "_").replace(":", "_");
		
		File snap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(snap, 
				new File("/Users/tantran/Desktop/VA WDE Automation/project.selenium/Screenshots//"+screenshotDate+"_HP.png"));
		
	}
}
