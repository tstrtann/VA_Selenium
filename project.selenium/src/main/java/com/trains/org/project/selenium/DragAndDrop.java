package com.trains.org.project.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	final static WebDriver driver = new ChromeDriver();
	static String url = "https://jqueryui.com/droppable/";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver.get(url);
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Switch to iFrame before doing drag and drop
		driver.switchTo().frame(0);
		
		// Drag and Drop
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(5000);
		
		// Switch back to parent frame before able to click different WebElement
		driver.switchTo().parentFrame();
		
		WebElement Resizable = driver.findElement(By.linkText("Resizable"));
		Resizable.click();
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	
}
