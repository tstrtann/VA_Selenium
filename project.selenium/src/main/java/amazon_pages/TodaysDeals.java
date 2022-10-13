package amazon_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodaysDeals {
	WebDriver driver;
	
	@FindBy(linkText = "Coupons") WebElement cp;
	
	public void couponsClick() {
		cp.click();
	}
	public TodaysDeals(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
