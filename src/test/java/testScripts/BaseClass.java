package testScripts;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import utilities.ReadConfig;


public class BaseClass {

	ReadConfig prop = new ReadConfig();
	protected WebDriver driver;
	String driverPath = System.getProperty("user.dir")+"/driver/chromedriver.exe";
	String date = new SimpleDateFormat("yyyy-MM-dd/hhmmss").format(new Date());
	String emailVal = "The specified email already exists";
	public static Logger logger;
	
	@BeforeClass
	//Setup for Browser
	public void setup() {

		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		logger=Logger.getLogger("info.printSultan");
		PropertyConfigurator.configure("log4j.properties");
		


	}

	@AfterClass
	//Close all windows
	public void tearDown() throws InterruptedException {

		Thread.sleep(2000);
		driver.quit();

	}

		
	//Take Full screen ScreenShot
	public void takeScreenshot(String Filename) {

		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File sourchPath = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(System.getProperty("user.dir")+"\\screenshots\\"+Filename+"_"+date+".png");
		try {
			FileUtils.copyFile(sourchPath, destinationPath);
		} catch (IOException e) {
			System.out.println("File location not found");
			e.printStackTrace();
		}

	}
	//Take particular element screen ScreenShot

	public void takeElementScreenShot(WebElement element, String Filename) {

		File sourchPath = element.getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(System.getProperty("user.dir")+"\\screenshots\\"+Filename+"_"+date+".png");
		try {
			FileUtils.copyFile(sourchPath, destinationPath);
			System.out.println("Screenshot taken");
		} catch (IOException e) {
			System.out.println("File location not found");
			e.printStackTrace();
		}


	}

}


