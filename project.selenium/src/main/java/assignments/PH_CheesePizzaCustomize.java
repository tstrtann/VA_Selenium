package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PH_CheesePizzaCustomize {
	
	WebDriver driver;
	
	@FindBy(xpath = "//h2[text()='Crust']") WebElement crustSizeOption;
	@FindBy(xpath = "//p[text()='Personal']") WebElement personaCrustlSize;
	@FindBy(xpath = "//button[@aria-label='add to order']") WebElement addToOrderButton;
	
	public void crustSizeOptionClick() {
		crustSizeOption.click();
	}
	
	public void personalCrustSizeClick() {
		personaCrustlSize.click();
	}
	
	public void addtoOrderButtonClick() {
		addToOrderButton.click();
	}
	
	public PH_CheesePizzaCustomize(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
