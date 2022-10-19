package ebay_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ebay_Home {
	WebDriver driver;
	
	@FindBy(id = "gh-logo") WebElement homeLogo;
	@FindBy(xpath = "//input[@aria-label='Search for anything']") WebElement searchField;
	@FindBy(xpath = "//select[@aria-label='Select a category for search']") WebElement selectSearchField;
	@FindBy(id = "gh-btn") WebElement searchBtn;
	
	@FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[5]") WebElement collectiblesArt;

	// Links
	@FindBy(xpath = "//*[text()='Funko Pop!']") WebElement funkoPop;
	@FindBy(linkText = "Art Paintings") WebElement artPaintings;
	
	public Ebay_Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void homeLogoClick() {
		homeLogo.click();
	}
	
	public void searchFieldSendKeys() {
		searchField.click();
		searchField.clear();
		searchField.sendKeys("pokemon");
	}
	
	public void selectSearchField() {		
		Select s = new Select(selectSearchField);
		s.selectByVisibleText("Toys & Hobbies");
	}
	
	public void searchBtnClk() {
		searchBtn.click();
	}
	
	public void collectibleArtClick() {
		collectiblesArt.click();
	}
	
	public void collectibleArtHover() {
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		wait.until(ExpectedConditions.elementToBeSelected(collectiblesArt));
		
		Actions a = new Actions(driver);
		a.moveToElement(collectiblesArt).build().perform();
		
		
	}
	
	public void funkoPopClick() {
//		funkoPop.click();
	}
	
	public void artPaintingClick() {
		
		artPaintings.click();
		
	}

}

