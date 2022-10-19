package ebay_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.Utilities;
import ebay_pages.Ebay_Home;

public class Ebay_ToysHobbiesPageTest extends Utilities {
	
	
  @Test
  public void toysHobbiesPageTest() throws InterruptedException {
	  Ebay_Home home = new Ebay_Home(driver);
//	  Thread.sleep(7000);
	  home.collectibleArtHover();
//	  Thread.sleep(2000);
//	  home.funkoPopClick();
	  home.artPaintingClick();
	  
//	  Thread.sleep(2000);
	  
	  String validateFunkoTitle = driver.getTitle();
//	  System.out.println(validateFunkoTitle);
	  Assert.assertEquals("Art Paintings for sale | eBay", validateFunkoTitle);
	  	  
  }
  
  
  
}
