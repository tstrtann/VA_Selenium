package testng;

import org.testng.annotations.Test;

import common.Utilities;
import facebook_pages.Home;

import org.testng.annotations.DataProvider;

public class FB_Login_DataProvider extends Utilities{
	
  @Test(dataProvider = "loginInfo") // calling the name of DataProvider Object (below) to provide values
  public void LoginTest(String n, String s) throws InterruptedException {
	  Home home = new Home(driver);
	  home.emailToField(n);
	  Thread.sleep(5000);
	  
	  home.passwordToField(s);
	  Thread.sleep(5000);

	  home.loginButtonClick();
	  Thread.sleep(5000);
	  
	  driver.navigate().back();

  }

  
  // Checking same code with different input, Provider helps
  @DataProvider
  public Object[][] loginInfo() {
    return new Object[][] {
      new Object[] { "tested", "password" }, // 1st collumn = 1, emailToField() and passwordToField()
      new Object[] { "tested2", "password2" }, // 2nd collumn = 2
      new Object[] { "tested3", "password3" }, // 3rd collumn = 3
    };
  }
}
