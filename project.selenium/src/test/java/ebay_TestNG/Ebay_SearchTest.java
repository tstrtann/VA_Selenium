package ebay_TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.Utilities;
import ebay_pages.Ebay_Home;
import ebay_pages.Ebay_ToysHobbies;

public class Ebay_SearchTest extends Utilities{
	SoftAssert sa = new SoftAssert();

	
  @Test
  public void searchTest() throws InterruptedException {
	  Ebay_Home home = new Ebay_Home(driver);
	  home.searchFieldSendKeys();
	  home.selectSearchField();
	  home.searchBtnClk();
	  
	  String toysHobbiesValidate = driver.getTitle();
	  sa.assertEquals("pokemon in Toys and Hobbies: Search Result | eBay", toysHobbiesValidate);

	  Ebay_ToysHobbies th = new Ebay_ToysHobbies(driver);
	  th.collectibleCardGamesClick();
	  
	  sa.assertEquals("pokemon in Toys and Hobbies: Search Result | eBay", toysHobbiesValidate);
	  sa.assertAll();	  
  }


}
