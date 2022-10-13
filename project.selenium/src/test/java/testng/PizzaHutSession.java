package testng;

import org.testng.annotations.Test;

import assignments.PH_CheesePizzaCustomize;
import assignments.PH_DeliveryForm;
import assignments.PH_Home;
import assignments.PH_MenuForOrder;
import assignments.PH_PizzaMenu;
import assignments.PH_Upsell;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;

public class PizzaHutSession {

	WebDriver driver;
	String url = "https://www.pizzahut.com";

	@Test
	public void PizzaHutTest() throws InterruptedException {

		PH_Home hp = new PH_Home(driver);
		hp.menuClick();
		hp.menuPizzaClick();

		PH_PizzaMenu mp = new PH_PizzaMenu(driver);
		mp.cheesePizzaClick();
		mp.deliveryOptionClick();

		PH_DeliveryForm dp = new PH_DeliveryForm(driver);
		dp.formInput();
		dp.searchButtonClick();
		dp.continueButtonClick();
//	  Thread.sleep(15000);

		PH_MenuForOrder mop = new PH_MenuForOrder(driver);
		mop.mouseToCheesePizza();
		mop.cheesePizzaMobileClick();

		PH_CheesePizzaCustomize cpp = new PH_CheesePizzaCustomize(driver);
		cpp.crustSizeOptionClick();
		cpp.personalCrustSizeClick();
		cpp.addtoOrderButtonClick();

		PH_Upsell usp = new PH_Upsell(driver);
		usp.viewOrderButtonClick();

	}

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		iBrowsers("chrome");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() throws IOException {
//	  Screenshots();
//	  driver.quit();
	}

	public void iBrowsers(String NameOfBrowser) {
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

	public void Screenshots() throws IOException {
		Date dateSS = new Date();
		String screenshotDate = dateSS.toString().replace(" ", "_").replace(":", "_");

		File snap = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(snap,
				new File("/Users/tantran/Desktop/VA WDE Automation/project.selenium/Screenshots//PH_TestNG_"
						+ screenshotDate + ".png"));

	}
}
