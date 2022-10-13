package assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PH_Home {
	WebDriver driver;
	
	@FindBy(xpath = "//span[@class='MuiButton-label']") WebElement menuDropDown;
	@FindBy(xpath = "//a[@data-testid='link-menu-pizza-link']") WebElement pizzaMenuDropDown;
	
	public void menuClick()	{

		menuDropDown.click();
	}
	
	public void menuPizzaClick() {

		pizzaMenuDropDown.click();
	}
	
	public PH_Home(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



}
