package com.trains.org.project.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookCreateAccount {
	

	static WebDriver driver = new ChromeDriver();
	static String url = "https://facebook.com";
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub	
		
		System.setProperty("webdriver.safari.driver", 
				"/usr/bin/safaridriver");

		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement createAccount = driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		Thread.sleep(2000);
		
		// Name Field
		WebElement Name = driver.findElement(By.name("firstname"));
		Name.click();
		Name.sendKeys("Test");
		
		// Last Name Field
		WebElement LastName = driver.findElement(By.name("lastname"));
		LastName.click();
		LastName.sendKeys("Test");
		
		// Phone Number Field
		WebElement PhoneOrEmail = driver.findElement(By.name("reg_email__"));
		PhoneOrEmail.click();
		PhoneOrEmail.sendKeys("Tester");
		Thread.sleep(2000);

		
		// New PW Field
		WebElement Password = driver.findElement(By.name("reg_passwd__"));
		Password.click();
		Password.sendKeys("abc!23BN");
		
		// Select Month
		WebElement Month = driver.findElement(By.name("birthday_month"));
		Select m = new Select(Month);
		m.selectByVisibleText("Sep");
		
		// Select Day
		WebElement Day = driver.findElement(By.name("birthday_day"));
		Select d = new Select(Day);
		d.selectByVisibleText("16");
		
		// Select Year
		WebElement Year = driver.findElement(By.name("birthday_year"));
		Select y = new Select(Year);
		y.selectByVisibleText("1996");
		Thread.sleep(2000);

		
		
		// Radio Button --- Gender
//		List<WebElement> radioButton = driver.findElements(By.className("_58mt"));
//		for(WebElement e: radioButton) {
//			if(e.getText().equalsIgnoreCase("custom")) {
//				e.click();
//			}
//		}

		// Radio Button 
		WebElement toggles;
		//--- using Absolute Xpath
//		toggles = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/form/div/div/span/span/input)[3]"));
		//--- using Relative Xpath
		toggles = driver.findElement(By.xpath("//label[text()='Custom']"));
		
		toggles.click();
		
		// Submit 
//		WebElement Submit = driver.findElement(By.name("websubmit"));
//		Submit.click();
		
		// Submit using Relative XPath
		WebElement Submit = driver.findElement(By.xpath("//button[text()='Sign Up' or @name='websubmit']"));
		Submit.click();
		
		
		
		Thread.sleep(2000);

		driver.quit();
		
		
	}




}
