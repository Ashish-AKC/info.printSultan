package tyielClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testScripts.BaseClass;

public class State extends BaseClass{
	
	
	@Test
	
	public void state() throws InterruptedException {
		
		driver.get("http://printsultan.info/registerresult/1?returnUrl=/");
		
		
		WebElement ts = driver.findElement(By.xpath("//div[@class='result']"));
		
		System.out.println(ts.getText());
		
	}

}
