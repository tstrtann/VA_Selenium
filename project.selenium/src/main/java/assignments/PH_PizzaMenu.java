package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PH_PizzaMenu {
	WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Cheese Pizza']") WebElement cheesePizza;
	@FindBy(xpath = "//*[text()='DELIVERY']") WebElement deliveryOption;
	
	public void cheesePizzaClick() {
		cheesePizza.click();
	}
	
	public void deliveryOptionClick() {
		deliveryOption.click();
	}
	
	
	
	public PH_PizzaMenu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	


}
