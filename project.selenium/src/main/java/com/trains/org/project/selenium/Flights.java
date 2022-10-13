package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights {

	final static WebDriver driver = new ChromeDriver();
	static String url = "https://www.expedia.com/Flights";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	

		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		// Select "leave from"
		WebElement leaveFrom = driver.findElement(By.xpath("//*[@aria-label='Leaving from']"));
		leaveFrom.sendKeys("Atlantic City");
		Thread.sleep(2000);

		
		WebElement departing = driver.findElement(By.id("d1-btn"));
		departing.click();
		Thread.sleep(2000);

		// Select Departing date using Xpath
		driver.findElement(By.xpath("//*[@aria-label='Oct 6, 2022']")).click();
		Thread.sleep(2000);

		// Select Return date using Xpath
		driver.findElement(By.xpath("//*[@aria-label='Nov 26, 2022']")).click();
		Thread.sleep(2000);

		WebElement dateButton = driver.findElement(By.xpath("//button[@data-stid='apply-date-picker']"));
		dateButton.click();
		Thread.sleep(2000);

		driver.close();
		
		System.out.println("Test finished!");
		

	}
		
}
