package Mavenproject.Automation;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager_project1 {
	
	public WebDriver driver;

	public Pageobjectmanager_project1(WebDriver driver2) {

	this.driver = driver2;
	
	}

	public  Loginpage_POM Lin;

	public  Address_POM Add;
	
	public  Bookingdetails_POM Book;
	
	
	public Loginpage_POM getinstanceLin() {
		
		if (Lin==null) {
			Lin= new Loginpage_POM(driver);
		}
		return Lin;
	}

	public Address_POM getinstanceAdd() {
		
		if (Add== null) {
			
			Add= new Address_POM(driver);
			
		}
		return Add;
	}

	public Bookingdetails_POM getinstanceBook() {
		
		if (Book== null) {
			Book = new Bookingdetails_POM(driver);
		}
		return Book;
	}
	
}
