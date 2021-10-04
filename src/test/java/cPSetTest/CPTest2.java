package cPSetTest;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import testScripts.BaseClass;

public class CPTest2 extends BaseClass {
	
	@Test
	
	public void CPTest() throws InterruptedException {
		
		//1 - Open the Website "https://www.ndtv.com/business"
		driver.get("https://www.ndtv.com/business");
		
		//2 - Print Href of all the TOP STORIES on the console.
			
		List<WebElement> hrefLinks=driver.findElements(By.xpath("//*[@class=\"widcont_topstories\"]//a"));
		
		for (WebElement topStoriesLinks : hrefLinks) {
			
			System.out.println(topStoriesLinks.getAttribute("href"));
		}
		
		//3 - Assert that the tool tip of the LATEST menu item is “Latest”
		
		String latest = driver.findElement(By.xpath("//*[@class=\"l_lhs topstories-cont\"]//a")).getAttribute("href");
		
		Assert.assertTrue(latest.contains("latest"));
		
		//4 - On the same page "LATEST" get the Href of top 3 stories on the page
		
		Actions act = new Actions(driver);
	
		WebElement button = driver.findElement(By.xpath("//h2[normalize-space()='Top Stories']"));

		
		
	}

}
