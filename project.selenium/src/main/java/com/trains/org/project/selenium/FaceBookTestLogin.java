package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTestLogin {
	
	static WebDriver driver = new ChromeDriver();
	static String url = "https://facebook.com";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"/Users/tantran/Desktop/VA WDE Automation/project.selenium/Drivers/chromedriver");
		
		driver.get(url);
		driver.manage().window().maximize();
		
	    // Locator: ID
	    WebElement userField = driver.findElement(By.id("email"));
		userField.sendKeys("asdf@asdg.asdf");
		sleep(2000);
		
		// Locator: Name
		WebElement passField = driver.findElement(By.name("pass"));
		passField.sendKeys("123asd");
		sleep(2000);
		
		// Locator: Name
		driver.findElement(By.name("login")).click();
		sleep(2000);
		
		/* 
		 * Locator: LinkText
		
	 	WebElement forgotField = driver.findElement(By.linkText("Forgot password?"));
		forgotField.click();
		 
		 */
		
		
		// Locator: PartialLinkText
		WebElement forgotField = driver.findElement(By.partialLinkText("Forgot"));
		forgotField.click();

		
		getSession();
		
		getTitle();
		
		sleep(2000);
		
		close();
		
		endTestText();
	}
	
	private static void endTestText() {
		System.out.println("\nTest Complete!");
	}
	
	public static void sleep(int milliSeconds) throws InterruptedException {
		Thread.sleep(milliSeconds);
	}
	
	public static void close() {
		driver.close();
	}
	
	private static void getSession() {
		// Get Session ID
		String getSession = driver.getWindowHandle();
		System.out.println("Session ID : " +getSession);
	}
	
	private static void getTitle() {
		// Get Title of the WebPage
	    String getTitle =  driver.getTitle();
	    System.out.println("Page Title : " +getTitle);
	}

}
