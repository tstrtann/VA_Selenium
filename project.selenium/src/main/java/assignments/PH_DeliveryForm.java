package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PH_DeliveryForm {
	
	WebDriver driver;
	
	@FindBy(id = "w2-address") WebElement addressField;
	@FindBy(id = "w2-address2") WebElement aptField;
	@FindBy(id = "w2-city") WebElement cityField;
	@FindBy(id = "w2-state") WebElement stateField;
	@FindBy(id = "w2-zip") WebElement zipField;
	
	@FindBy(xpath = "//span[text()='Search']") WebElement searchButton;
//	@FindBy(xpath = "//*[text()='Pre-Order']") WebElement continueButton;
	@FindBy(xpath = "//*[text()='Continue']") WebElement continueButton;

	
	public void formInput() {		
		addressField.sendKeys("2709 Fairmount Avenue");
		aptField.sendKeys("2nd");
		cityField.sendKeys("Atlantic City");
		stateField.sendKeys("NJ");
		zipField.sendKeys("08401");
	}
	
	public void searchButtonClick() {
		searchButton.click();
	}
	
	public void continueButtonClick() {
		continueButton.click();
	}
	
	public PH_DeliveryForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
