package Mavenproject.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class proj2sendpage {
	
	public static WebDriver driver;
	
	@FindBy(xpath ="//select[@name='location']")
	
	private WebElement Location;
	
	@FindBy(xpath ="//select[@name='room_type']")
	
	private WebElement Hotel;
	
	@FindBy(xpath ="//select[@name='room_type']")
	
	private WebElement Roomtype;
	
	@FindBy(xpath ="(//select[@class='search_combobox'])[4]")
	
	private WebElement Roomnumber;
	
	@FindBy(xpath ="//input[@name='datepick_in']")
	
	private WebElement date;
	
	@FindBy(xpath ="(//select[@class='search_combobox'])[5]")
	
	private WebElement number;
	
	@FindBy(xpath ="(//select[@class='search_combobox'])[6]")
	
	private WebElement children;
	
	@FindBy(xpath ="//input[@id='Submit']")
	
	private WebElement submit;
	
	public proj2sendpage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public void setLocation(WebElement location) {
		Location = location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public void setHotel(WebElement hotel) {
		Hotel = hotel;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		Roomtype = roomtype;
	}

	public WebElement getRoomnumber() {
		return Roomnumber;
	}

	public void setRoomnumber(WebElement roomnumber) {
		Roomnumber = roomnumber;
	}

	public WebElement getDate() {
		return date;
	}

	public void setDate(WebElement date) {
		this.date = date;
	}

	public WebElement getNumber() {
		return number;
	}

	public void setNumber(WebElement number) {
		this.number = number;
	}

	public WebElement getChildren() {
		return children;
	}

	public void setChildren(WebElement children) {
		this.children = children;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}


}
