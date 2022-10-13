package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {

	static WebDriver driver = new ChromeDriver();
	static String url = "https://amazon.com";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver.get(url);
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement mouseToLogin = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

		// Create Actions for mouse over action, build().perform() is required 
		Actions action = new Actions(driver);
		action.moveToElement(mouseToLogin).build().perform();
		Thread.sleep(5000);
		
		WebElement PrimeMembership = driver.findElement(By.xpath("//*[text()='Prime Membership']"));
		Thread.sleep(5000);
		
		// In order to click on a WebElement inside a drop down module, Action object is called
		// WebElement inside drop down is clicked and execute
		action.moveToElement(PrimeMembership).click().build().perform();
		Thread.sleep(5000);

		driver.quit();
		
		
	}

}
