package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearch {
	
	WebDriver driver;

	public ProductSearch(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "small-searchterms")
	private WebElement search;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchButton;
	
	@FindBy(linkText = "Sample")
	private WebElement text;
	
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'A5 Notebook')]")
	private WebElement pro;
	
	
	public void searchProduct(String text) {
		
		search.sendKeys(text);
		
	}
	
	public void sButton() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			System.out.println("Please enter something");
		}
		searchButton.click();
	}
	
	public void searchText() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();", text);
	}
	
	public void product() {
		
		pro.click();
		
	}
	
	
}
