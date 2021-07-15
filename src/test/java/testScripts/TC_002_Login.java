package testScripts;


import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.RegLoginPage;
import utilities.ReadConfig;


public class TC_002_Login extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException {
		
		ReadConfig pro = new ReadConfig();
		
		driver.get(pro.getBaseUrl());
		
		logger.info("TestCase for login started");
		
		RegLoginPage regLogin = new RegLoginPage(driver);
		
		regLogin.loginIcon();
		Thread.sleep(3000);
		regLogin.emailForLogin(pro.getEmailId());
		regLogin.passwordForLogin(pro.getPassword());
		regLogin.loginButton();
		//takeScreenshot("HomePage");
		Assert.assertEquals("Print Sultan",driver.getTitle(), "Test Case failed");
		logger.info("TestCase for login Ended & Pass");

	}

}
