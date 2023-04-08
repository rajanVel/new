package Mavenproject.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingdetails_POM {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='first_name']")
	private WebElement raja;
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement Rajan;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement Address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement Number;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardtype;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement Expdate;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement Expmonth;
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement pin;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement click4;
	
	
	
	
	public Bookingdetails_POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRaja() {
		return raja;
	}

	public WebElement getRajan() {
		return Rajan;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getNumber() {
		return Number;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getExpdate() {
		return Expdate;
	}

	public WebElement getExpmonth() {
		return Expmonth;
	}

	public WebElement getPin() {
		return pin;
	}

	public WebElement getClick4() {
		return click4;
	}

	


}
