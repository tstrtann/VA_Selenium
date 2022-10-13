package assignments;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PizzaHut {
	
	static WebDriver driver = new ChromeDriver();
	static String url = "https://www.pizzahut.com/";
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		// Menu 
		WebElement Menu = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
		Menu.click();
		
//		Thread.sleep(5000);
		
		// Menu ---> Pizza
		WebElement Pizza = driver.findElement(By.xpath("//a[contains(@data-testid,'link-menu-pizza-link')]"));
		Pizza.click();
		
//		Thread.sleep(5000);
		
		// Click on Cheese Pizza
		WebElement CheesePizza = driver.findElement(By.xpath("//*[text()='Cheese Pizza']"));
		CheesePizza.click();
		
//		Thread.sleep(5000);
		
		// Click DELIVERY option
		WebElement Delivery = driver.findElement(By.xpath("//*[text()='DELIVERY']"));
		Delivery.click();
		
		// Enter address
		WebElement address = driver.findElement(By.id("w2-address"));
		address.click();
		address.sendKeys("2709 Fairmount Avenue");
		
		// Enter Apt
		WebElement apt = driver.findElement(By.id("w2-address2"));
		apt.click();
		apt.sendKeys("2");
		
		// Enter City
		WebElement city = driver.findElement(By.id("w2-city"));
		city.click();
		city.sendKeys("Atlantic City");
		
		// Enter State
		WebElement state = driver.findElement(By.id("w2-state"));
		state.click();
		state.sendKeys("NJ");
		
		// Enter ZIP
		WebElement zip = driver.findElement(By.id("w2-zip"));
		zip.click();
		zip.sendKeys("08401");
		
//		Thread.sleep(5000);
		
		// Click Search
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		
//		Thread.sleep(5000);
		
		// Click Continue
//		driver.findElement(By.xpath("//*[text()='Pre-Order']")).click();
		driver.findElement(By.xpath("//*[text()='Continue']")).click();
		
		Thread.sleep(10000);

		
		// Select Cheese Pizza again
		driver.findElement(By.xpath("//p[text()='Cheese Pizza']")).click();
		
//		Thread.sleep(15000);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		
		// Click on Crust
		driver.findElement(By.xpath("//h2[text()='Crust']")).click();
		
//		Thread.sleep(5000);
		
		// Select 'Personal' size pizza
		driver.findElement(By.xpath("//p[text()='Personal']")).click();
		
//		Thread.sleep(5000);
		
		// Click 'Add to Order'
		driver.findElement(By.xpath("//span[text()='add to order']")).click();
		
		Thread.sleep(10000);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// View order 
		driver.findElement(By.xpath("//span[text()='View order']")).click();
		
//		Thread.sleep(5000);
		
		// Screenshot
		Screenshots();
		
		driver.close();
	}
	
	private static void Screenshots() throws IOException {
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(ss, 
				new File("/Users/tantran/Desktop/VA WDE Automation/project.selenium/Screenshots//PHCheckout.png"));
	}

}
