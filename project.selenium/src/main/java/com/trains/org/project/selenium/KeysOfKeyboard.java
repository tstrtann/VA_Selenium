package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysOfKeyboard {
	static WebDriver driver = new ChromeDriver();
	static String url = "https://amazon.com";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver.get(url);
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Computer");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.COMMAND).sendKeys("a").build().perform();
		action.keyDown(Keys.COMMAND).sendKeys("c").build().perform();
		action.keyUp(Keys.COMMAND);
		Thread.sleep(2000);
		action.sendKeys(Keys.DELETE).build().perform();
		Thread.sleep(2000);
		action.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);

		driver.quit();
		

	}

}
