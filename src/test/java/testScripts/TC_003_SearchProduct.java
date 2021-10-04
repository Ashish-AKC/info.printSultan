package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.ProductSearch;
import utilities.ReadConfig;

public class TC_003_SearchProduct extends BaseClass {
	
	@Test
	public void searchTest() throws InterruptedException {
		
		ReadConfig pro = new ReadConfig(); //Details fetch from Properties file
		
		driver.get(pro.getBaseUrl());
		
		logger.info("URL passed successfully");
		
		ProductSearch sp = new ProductSearch(driver);
		
		sp.searchProduct(pro.search());
		logger.info("Search for overall");
		Thread.sleep(1000);
		
		takeScreenshot("ProductSuggetion"); //Take screenshot for product suggestions
		logger.info("Screenshot taken successfully for product suggestions");
		sp.sButton();
		
		sp.searchText();
		logger.info("Product search test passed");
		sp.product();
		takeScreenshot("ProductDetailPage");
		logger.info("Screenshot taken for product detail page");
		
		Assert.assertEquals(driver.getCurrentUrl(),UrlSearch);
		
	}

}
