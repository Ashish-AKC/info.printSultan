package pageObjects;


import utilities.Xls_DataProvider;
import utilities.Xls_Reader;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegLoginPage {

	WebDriver driver;
	static Boolean eval;
	String ee;

	public RegLoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	Xls_DataProvider data = new Xls_DataProvider();

	//All element locators in Register and login page

	@FindBy(xpath = "//a[normalize-space()='Register']")
	@CacheLookup
	private WebElement registerIcon;

	@FindBy(xpath = "//a[normalize-space()='Log in']")
	@CacheLookup
	private WebElement loginIcon;

	@FindBy(xpath = "//div[@class='language-selector']")
	@CacheLookup
	private WebElement languageTab;

	@FindBy(id = "FirstName")
	@CacheLookup
	private WebElement firstName;

	@FindBy(id = "LastName")
	@CacheLookup
	private WebElement lastName;

	@FindBy(id = "Email")		//Use for registration and login both
	@CacheLookup
	private WebElement email;

	@FindBy(name = "Phone")
	@CacheLookup
	private WebElement Phone;

	@FindBy(name = "customer_attribute_1")
	@CacheLookup
	private WebElement houseNo;

	@FindBy(name = "customer_attribute_2")
	@CacheLookup
	private WebElement floor;

	@FindBy(name = "StreetAddress")
	@CacheLookup
	private WebElement streetAddress;

	@FindBy(id = "CountryId")
	@CacheLookup
	private WebElement countryId;

	@FindBy(xpath = "//select[@id='StateProvinceId']/option")
	@CacheLookup
	private List<WebElement> stateProv;

	@FindBy(id = "Password")  		//Use for registration and login both
	@CacheLookup
	private WebElement Password;

	@FindBy(name = "ConfirmPassword")
	@CacheLookup
	private WebElement conPassword;

	@FindBy(id = "register-button")
	@CacheLookup
	private WebElement submitButton;

	@FindBy(xpath = "//input[@id='RememberMe']")
	@CacheLookup
	private WebElement rememberCheck;

	@FindBy(id = "small-searchterms")
	@CacheLookup
	private WebElement searchBar;

	@FindBy(xpath = "//input[@value='Search']")
	@CacheLookup
	private WebElement searchButton;

	@FindBy(xpath = "//input[@value='Log in']")
	@CacheLookup
	private WebElement loginButton;

	@FindBy(xpath = "//input[@value='Register']")
	@CacheLookup
	private WebElement registerButton;

	@FindBy(xpath = "//div[@class='result']")
	private WebElement afterRegistration;

	@FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
	public WebElement emailValidate;

	@FindBy(name = "register-continue")
	private WebElement register_continue;



	//All methods for registration

	public boolean verifyRegistration() {

		afterRegistration.getText();
		return true;

	}
	
	//Email validate
	public void emailValidate() {

		if(emailValidate.getText().contentEquals("The specified email already exists")) {

			eval = emailValidate.isDisplayed();
		}else {
			
			register_continue.click();
			
		}
	}

	public void register_continue() {

		register_continue.click();
	}

	public void registerIcon() {

		registerIcon.click();

	}

	public void setFirstName() {

		firstName.sendKeys(firstname);
	}

	public void setLastName() {

		lastName.sendKeys(lastname);
	}

	public void setEmailId() {

		email.sendKeys(emailId);
	}

	public void setPhone() {

		Phone.sendKeys(phone);
	}

	public void houseNo() {

		houseNo.sendKeys(houseno);
	}

	public void floor() {

		floor.sendKeys(floorr);
	}

	public void streetAdd() {

		streetAddress.sendKeys(streetaddress);	
	}

	public void country() {

		Select con = new Select(countryId);
		con.selectByIndex(1);

	}

	public void state() {

		// Iterating through the list selecting the desired option
		for( int s = 0; s<stateProv.size();s++){
			// if the option is By Subject click that option
			if( stateProv.get(s).getText().equals(stateprovine))
			{
				stateProv.get(s).click();
				break;
			}

		}
	}

	public void password() {

		Password.sendKeys(password);
	}

	public void conPassword() {

		conPassword.sendKeys(CoPassword);
	}

	public void submitButton() {

		submitButton.click();
	}

	public void languageTab() {

		languageTab.click(); //Pending for implementation
	}


	//All methods for login purpose

	public void loginIcon() {

		loginIcon.click();

	}

	public void emailForLogin(String emailForLogin) {

		email.sendKeys(emailForLogin);

	}

	public void passwordForLogin(String pwdForLogin) {


		Password.sendKeys(pwdForLogin);

	}

	public void rememberCheck() {

		rememberCheck.click();
	}

	public void searchBar(String searchText) {

		searchBar.sendKeys(searchText);
	}

	public void searchButton() {

		searchButton.click();
	}

	public void loginButton() {

		loginButton.click();
	}

	public boolean registerButton() {

		registerButton.click();
		return true;

	}




	Xls_Reader reader = new Xls_Reader("C:\\Users\\Admin\\office\\info.printSultan\\src\\main\\java\\testData\\Testdata.xlsx");


	String firstname = reader.getCellData("Registration", "Firstname", 2);
	String lastname = reader.getCellData("Registration", "Lastname", 2);
	String emailId = reader.getCellData("Registration", "Email", 2);
	String phone = reader.getCellData("Registration", "Phone", 2);
	String houseno = reader.getCellData("Registration", "HouseNo", 2);
	String floorr = reader.getCellData("Registration", "Floor", 2);
	String streetaddress = reader.getCellData("Registration", "StreetAddress", 2);
	String country = reader.getCellData("Registration", "Country", 2);
	String stateprovine = reader.getCellData("Registration", "ProvineState", 2);
	String password = reader.getCellData("Registration", "Password", 2);
	String CoPassword = reader.getCellData("Registration", "CoPassword", 2);
	String username = reader.getCellData("Login", "Username", 2);
	String lpassword = reader.getCellData("Login", "Password", 2);




}


