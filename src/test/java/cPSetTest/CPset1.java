package cPSetTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testScripts.BaseClass;

public class CPset1 extends BaseClass{


	@Test(groups = "Book")
	public void CPsetTest1() throws InterruptedException {

		driver.get("https://www.meripustak.com/");

		WebElement searchBar = driver.findElement(By.id("txtsearch"));

		WebElement searchBtn = driver.findElement(By.id("btnsearch"));


		searchBar.sendKeys("Python");
		searchBtn.click();
		Thread.sleep(2000);

		//List<WebElement> offerPrice = driver.findElements(By.xpath("//div[@class='book_list']//div[@itemprop='offers']"));

		//List<WebElement> productName = driver.findElements(By.xpath("//div[@class='book_list']//span[@itemprop='name']"));

		List <WebElement> list = driver.findElements(By.xpath("//*[@class='right']"));

		for (WebElement webElement : list) {

			System.out.println(webElement.getText());
			
			
		}



	}

	@Test(groups = "Book")
	public void CPsetTest2() throws InterruptedException {

		driver.get("https://www.meripustak.com/");

		WebElement searchBar = driver.findElement(By.id("txtsearch"));

		WebElement searchBtn = driver.findElement(By.id("btnsearch"));

		searchBar.sendKeys("Java");
		searchBtn.click();
		Thread.sleep(3000);

	}
	@Test(groups = "Book")
	public void CPsetTest3() {

		driver.get("https://www.meripustak.com/");

		WebElement searchBar = driver.findElement(By.id("txtsearch"));

		WebElement searchBtn = driver.findElement(By.id("btnsearch"));

		searchBar.sendKeys("Oracle");
		searchBtn.click();
	}


}