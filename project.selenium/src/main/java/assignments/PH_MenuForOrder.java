package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PH_MenuForOrder {
	
	WebDriver driver;
	
	
	@FindBy(xpath = "//div[@data-testid='Cheese Pizza-wrapper']") WebElement cheesePizzaMobile;

	
	public void mouseToCheesePizza() {
		Actions a = new Actions(driver);
		a.moveToElement(cheesePizzaMobile).perform();
	}
	
	public void cheesePizzaMobileClick() {
		cheesePizzaMobile.click();
	}
	
	public PH_MenuForOrder(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(cheesePizzaMobile));
	}
}
