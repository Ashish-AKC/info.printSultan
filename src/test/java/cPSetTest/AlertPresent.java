package cPSetTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import testScripts.BaseClass;
//Unexpected alert handle
public class AlertPresent extends BaseClass {
	
	
	@Test
	
	public void alertTest() throws InterruptedException {
		
		driver.get("https://demoqa.com/alerts");
		
		
		try {
			driver.findElement(By.id("alertButton")).click();
            //driver.findElement(By.id("timerAlertButton")).click();
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert simpleAlert = driver.switchTo().alert();
            simpleAlert.accept();
            System.out.println("Unexpected alert accepted");
        } catch (Exception e) {
            System.out.println("unexpected alert not present");
        }
		
		
		
	}

}
