package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wording {
	static WebDriver driver = new ChromeDriver();
	static String url = "https://www.facebook.com/";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver.get(url);
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String text = driver.findElement(By.xpath("//*[contains(text(),'Connect with friends')]")).getText();
		Thread.sleep(2000);
		
		String text2 = driver.findElement(By.xpath("//span[text()=' Meta © 2022']")).getText();
		Thread.sleep(2000);
		
		driver.quit();
		
	
		
		System.out.println(text + "\n" + text2);
	}
	
}
