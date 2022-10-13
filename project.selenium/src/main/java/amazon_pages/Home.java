package amazon_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	
	WebDriver driver;
	
	@FindBy(partialLinkText = "Today's Deals") WebElement td;
	@FindBy(xpath = "//*[@aria-label='Amazon']") WebElement iLogo;
	@FindBy(id = "twotabsearchtextbox") WebElement searchField;
	@FindBy(id = "nav-search-submit-button") WebElement searchButton;
	
	
	public void todaysDealsClick() {
		td.click();
	}
	
	public void logoClick() {
		iLogo.click();
	}
	
	public void searchFieldClickAndSendkeys() {
		searchField.click();
		searchField.sendKeys("computers");
	}
	
	public void searchButtonClick() {
		searchButton.click();
	}
	
	public Home(WebDriver driver) {		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}



