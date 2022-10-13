package common;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;

public class Utilities {

	public WebDriver driver;

	@Parameters({ "browser", "website" })

	@BeforeClass
	public void iBrowsers(String NameOfBrowser, String url) {
		if (NameOfBrowser.equalsIgnoreCase("chrome")) { // Chrome Driver
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			System.out.println("Chrome Driver Browser");
		} else if (NameOfBrowser.equalsIgnoreCase("edge")) { // Edge Driver
			System.setProperty("webdriver.edge.driver", "/usr/local/bin/msedgedriver");
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			System.out.println("Edge Driver Browser");
		} else if (NameOfBrowser.equalsIgnoreCase("safari")) { // Safari Driver
			driver = new SafariDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			System.out.println("Safari Driver Browser");
		}
	}

	@AfterClass
	public void afterClass() throws IOException {
//		Screenshots();
		driver.close();
//		driver.quit();
	}

	/* 
	 * 
	 * To take screenshots:
	 * 
	 * - TakesScreenshot takes the WebDriver 
	 * - .getScreenshotAs(FILE)
	 * - create a path to store Screenshots in, FileHandler.copy
	 * - create a folder and use direct location of path
	 * - make sure to have a name inside path location and ".png" or "jpg"
	 * 
	 * For multiple screenshots, use Date concept
	 * - create date obj
	 * - convert to String 
	 * - replace characters
	 *  
	 */
	public void Screenshots() throws IOException {
		Date dateSS = new Date();
		String screenshotDate = dateSS.toString().replace(" ", "_").replace(":", "_");
		
		String userPath = System.getProperty("user.dir"); // For User path sharing

		File snap = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(snap,
				new File(userPath + "/Screenshots//AM_TestNG_"
						+ screenshotDate + ".png"));

	}

}
