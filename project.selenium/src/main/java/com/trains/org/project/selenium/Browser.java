package com.trains.org.project.selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	static WebDriver driver = new ChromeDriver();
	static String url = "https://google.com";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"/Users/tantran/Desktop/VA WDE Automation/project.selenium/Drivers/chromedriver");
		
		// Go to URL 
		driver.get(url);
	
		// Maximize window
		driver.manage().window().maximize();
		
		// REFRESH on WebPage
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		// BACKWARD on WebPage
		driver.navigate().back();
		Thread.sleep(3000);
		
		// FORWARD on WebPage
		driver.navigate().forward();
		Thread.sleep(3000);
		
		// Get SESSION ID (in String) - unique ID for each execution of session
	    String windowHandle = driver.getWindowHandle();
	    System.out.println("Window Handle: " +windowHandle);
	    
	    // Get page URL (in String)
	    String currentPage = driver.getCurrentUrl();
	    System.out.println("Current Page: " +currentPage);
	    
	    // Get page TITLE (in String)
	    String title = driver.getTitle();	
	    System.out.println("Webpage Title: " +title);
		
		// Syntax to wait (in milliseconds)
		Thread.sleep(5000);
		
//		driver.findElement(By.id("gbqfbb")).click();
//		driver.findElement(By.name("q")).click();
//		driver.findElement(By.name("q")).clear();
//		driver.findElement(By.name("q")).sendKeys("weather");
//		driver.findElement(By.className("gNO89b")).click();
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a" + "\n"));
		for(WebElement link:allLinks){
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
		

	}

}
