package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkout {

	@FindBy(xpath = "//li[@class='col-sm-4']//h6")
	private WebElement Topcategories;

	@FindBy(id = "small-searchterms")
	private WebElement search;

	@FindBy(xpath = "//*[@id=\"jcarousel-3-350\"]/div/div[1]/strong")
	private WebElement Bestseller;

	@FindBy(linkText = "/personalized")
	private WebElement text;

	public void topCategorie(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,850)");

	}

	public void bestSeller(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(850,860)");

		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView();", text);

		}
	


}
