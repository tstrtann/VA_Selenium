package ebay_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_ToysHobbies {
	WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Collectible Card Games']") WebElement collectibleCardGames;
	
	public Ebay_ToysHobbies(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void collectibleCardGamesClick() {
		collectibleCardGames.click();
	}

}
