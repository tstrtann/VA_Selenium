package amazon_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coupons {
	WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Recently Clipped']") WebElement rc;
	
	public void recentlyClippedClick() {
		rc.click();
	}
	
	public Coupons(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
