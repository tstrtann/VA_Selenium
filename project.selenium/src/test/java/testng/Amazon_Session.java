package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.trains.org.project.selenium.iBrowser;

import amazon_pages.Coupons;
import amazon_pages.Home;
import amazon_pages.TodaysDeals;
import common.Utilities;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Amazon_Session extends Utilities {
//	WebDriver driver;
//	String url = "https://www.amazon.com";
	
	/*
  @Test(priority = 2, dependsOnMethods = "searchTest")
  public void pageTest() throws InterruptedException {
	  Home home = new Home(driver);
	  home.todaysDealsClick();
	 
	  
	  Thread.sleep(5000);
	  
	  TodaysDeals deals = new TodaysDeals(driver);
	  deals.couponsClick();
	  Thread.sleep(5000);

	  Coupons coupons = new Coupons(driver);
	  coupons.recentlyClippedClick();
	  Thread.sleep(5000);
  }*/
  
  @Test(priority = 1)
  public void searchTest() {
	  int links = driver.findElements(By.tagName("a")).size();
	  if(links<=500) {
		  driver.navigate().refresh();
	  }else {
		  System.out.println("Page has more than 500 links... continue to test");
	  }
	  
	  Home home = new Home(driver);
	  home.logoClick();
	  home.searchFieldClickAndSendkeys();
	  home.searchButtonClick();
	  
	  // Validating if the Title matches
	  String currentURL = driver.getTitle();
	  
	  SoftAssert sa = new SoftAssert(); // SoftAssert continue if Assert is failed

//	  sa.assertEquals(currentURL, "Amazon.com : computers");
//	  sa.assertAll(); // Checks all assertions no matter if it failed or success, PLACE AT END OF TEST!

	  Assert.assertEquals(currentURL, "Amazon.com : computers");
	  
	  
	  
	  int homeLink = driver.findElements(By.xpath("//a[text()='Amazon Basics']")).size();
	  if(homeLink==1) {
		  driver.findElement(By.xpath("//a[text()='Amazon Basics']")).click();
		  driver.close();
	  }else {
		  System.out.println("Element is not displaying");
	  }
	  
	  sa.assertAll();
 
  }
  
  
  
}
  
  
  /*
   * 
   * 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  driver.get("https://www.amazon.com");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
  @BeforeTest
  public void beforeClass() {
	  iBrowsers("chrome");
  }
  
  @AfterTest
  public void afterClass() throws InterruptedException, IOException {
	  Screenshots();
	  Thread.sleep(6000);
	  driver.close();  
  }
  
  public void iBrowsers(String NameOfBrowser) {
			if(NameOfBrowser.equalsIgnoreCase("chrome")) { 			// Chrome Driver
				driver = new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				String handle = driver.getWindowHandle();
				System.out.println("Chrome Driver: "+handle);
			}else if (NameOfBrowser.equalsIgnoreCase("edge")) { 	// Edge Driver 
				System.setProperty("webdriver.edge.driver", "/usr/local/bin/msedgedriver");
				driver = new EdgeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				String handle = driver.getWindowHandle();
				System.out.println("Edge Driver: "+handle);
			}else if(NameOfBrowser.equalsIgnoreCase("safari")) {	// Safari Driver 
				driver = new SafariDriver();
				driver.get(url);
				driver.manage().window().maximize();
				String handle = driver.getWindowHandle();
				System.out.println("Safari Driver: "+handle);
			}
		}
  
  public void Screenshots() throws IOException{
		Date dateSS = new Date();
		String screenshotDate = dateSS.toString().replace(" ", "_").replace(":", "_");
		
		File snap = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(snap, 
				new File("/Users/tantran/Desktop/VA WDE Automation/project.selenium/Screenshots//"+screenshotDate+"_Amazon.png"));
  }
}*/
