package testScripts;

import org.testng.annotations.Test;
import pageObjects.Checkout;

public class TC_004_Checkout extends BaseClass {
	
	@Test
	public void checkoutProduct() throws InterruptedException {
		
		Checkout cout = new Checkout();	
		driver.get(prop.getBaseUrl());
		Thread.sleep(1000);
		logger.info("Text 4 started");
		cout.topCategorie(driver);
		logger.info("Navigate to Top categoies");
		//cout.nextButton();
		Thread.sleep(2000);
		cout.bestSeller(driver);
		logger.info("Navigate to Best seller");
		//cout.nextButton1();
		
	}
	

}
