package Mavenproject.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_POM {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//select[@name='location']")
	private WebElement Location;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement Hotel;
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement Roomtype;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[4]")
	private WebElement Roomnumber;
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement Date;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[5]")
	private WebElement number;
	
	@FindBy(xpath = "(//select[@class='search_combobox'])[6]")
	private WebElement children;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement click1;
	
	@FindBy(xpath = "//input[@name='radiobutton_0']")
	private WebElement click2;
	
	@FindBy(xpath = "//input[@name='continue']")
	private WebElement click3;
	
	
	public Address_POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getRoomnumber() {
		return Roomnumber;
	}

	public WebElement getDate() {
		return Date;
	}

	public WebElement getNumber() {
		return number;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getClick1() {
		return click1;
	}

	public WebElement getClick2() {
		return click2;
	}

	public WebElement getClick3() {
		return click3;
	}
	
	

}
