package facebook_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver driver;
	
	@FindBy(name = "email") WebElement email;
	@FindBy(name = "pass") WebElement password;
	@FindBy(name = "login") WebElement loginButton;
	
	public Home(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void emailToField(String emailValue) {
		email.clear();
		email.sendKeys(emailValue);
	}
	
	public void passwordToField(String pwValue) {
		password.clear();
		password.sendKeys(pwValue);
	}
	
	public void loginButtonClick() {
		loginButton.click();
	}

}
