package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PH_Upsell {
	WebDriver driver;
	
	@FindBy(xpath = "//span[text()='View order']") WebElement viewOrderButton;

	public void viewOrderButtonClick() {
		viewOrderButton.click();
	}
	
	public PH_Upsell(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
