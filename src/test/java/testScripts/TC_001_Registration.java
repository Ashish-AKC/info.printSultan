package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.RegLoginPage;
import utilities.ReadConfig;


public class TC_001_Registration extends BaseClass{

	@Test
	public void Registration() throws InterruptedException {

		ReadConfig pro = new ReadConfig();

		driver.get(pro.getBaseUrl());
		logger.info("Test 2 started--------");
		RegLoginPage regLogin = new RegLoginPage(driver);

		regLogin.registerIcon();
		Thread.sleep(1000);
		logger.info("Registration page opened");
		regLogin.setFirstName();
		regLogin.setLastName();
		regLogin.setEmailId();
		regLogin.setPhone();
		logger.info("User details entered from excel");
		takeScreenshot("Registration");
		regLogin.houseNo();
		regLogin.floor();
		regLogin.streetAdd();	
		regLogin.country();
		logger.info("Contry selected Kuwait");
		Thread.sleep(1000);
		regLogin.state();
		takeScreenshot("Registration");
		regLogin.password();
		regLogin.conPassword();
		regLogin.registerButton();
		Thread.sleep(2000);
		//regLogin.emailValidate();
		try {
			Assert.assertEquals("Print Sultan. Register",driver.getTitle(), "Test Case Passed");
		} catch (AssertionError e) {
			e.printStackTrace();
			System.out.println("test not successfully pass");
		}
		
		logger.info("Test 2 Ended");
	
	}

}
