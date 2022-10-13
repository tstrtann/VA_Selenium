package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	final static WebDriver driver = new ChromeDriver();
	static String url = "https://demoqa.com/alerts";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Alert pops up and then accept
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		// Alert pops up after 5 seconds, wait 5 seconds, then dismiss
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		// Alert pops up to confirm, then accept 
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		// Alert pops up, enter prompt... not common
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("rwetwertwert");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
		
		Thread.sleep(5000);
		
		

		driver.quit();
	}
	

}
