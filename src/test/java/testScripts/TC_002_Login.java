package testScripts;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.RegLoginPage;
import utilities.ReadConfig;


public class TC_002_Login extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException {
		
		ReadConfig pro = new ReadConfig();
		logger.info("TestCase for login started");
		driver.get(pro.getBaseUrl());
		
		logger.info("Navigate to Webpage");
		
		RegLoginPage regLogin = new RegLoginPage(driver);
		
		regLogin.loginIcon();
		Thread.sleep(3000);
		regLogin.emailForLogin(pro.getEmailId());
		regLogin.passwordForLogin(pro.getPassword());
		regLogin.loginButton();
		logger.info("Login Successfully");
		takeScreenshot("HomePage");
		logger.info("Screenshot taken for homepage");
		Assert.assertEquals("Print Sultan",driver.getTitle(), "Test Case failed");
		logger.info("TestCase 2 ended");

	}

}
