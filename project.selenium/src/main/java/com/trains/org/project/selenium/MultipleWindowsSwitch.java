package com.trains.org.project.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleWindowsSwitch {
	
	/*
	 * Windows handling
	 * - use Set<String> (variable) = driver.getWindowHandles(); to put store multiple Windows in script
	 * - use Iterator<String> (variable) = (SetVar).iterator(); to manipulate different Windows
	 * - make sure when switching windows use driver.switchToWindows(nameOfWindows);
	 *  
	 * 
	 */
	
	static WebDriver driver = new ChromeDriver();
	static String url = "https://www.amazon.com";
	
	public static void main(String[] args) throws InterruptedException {
		// created an Actions object to use Keysboard input


		driver.get(url);
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
//		WebDriverWait wait = new WebDriverWait(driver, 20); // ExplicitWait
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"Today's Deals\"]")));
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // ImplicitWait
		WebElement TodaysDeals = driver.findElement(By.xpath("//*[text()=\"Today's Deals\"]"));
		
		// opening Kindle to another separate window
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.SHIFT).build().perform();
		TodaysDeals.click();
		actions.keyUp(Keys.SHIFT).build().perform();
		
		// get Window Handles --- each window have it's own unique Session number, Set allows to return multiple String
		Set<String> windowsHandles = driver.getWindowHandles();
		
		// Iterator will read the first index value once its stored in Set, then search if there's any other index value
		Iterator<String> iterator = windowsHandles.iterator();
		String firstWindowHandle = iterator.next();
		String secondWindowHandle = iterator.next();
		
		System.out.println("First Window ID: "+firstWindowHandle);
		System.out.println("Second Window ID: "+secondWindowHandle);
	
		driver.switchTo().window(secondWindowHandle);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Coupons = driver.findElement(By.xpath("//a[@aria-label='Coupons']"));
		Coupons.click();
		
		driver.close();
		
		driver.switchTo().window(firstWindowHandle);
		TodaysDeals.click();
		
		Thread.sleep(5000);

		driver.navigate().back();
		driver.quit();
		
		
		
		
	}
}
