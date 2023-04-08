package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchpagePOM {
	
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement Location;

	@FindBy(id = "hotels")
	private WebElement Hotels;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement Rooms;
	
	@FindBy(id = "room_nos")
	private WebElement room_nos;

	@FindBy(id = "datepick_in")
	private WebElement datepick_in;
	
	@FindBy(id = "datepick_out")
	private WebElement datepick_out;
	
	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adult_room;
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child_room;
	
	@FindBy(id = "Submit")
	private WebElement Submit;
	
	
	
	public SearchpagePOM(WebDriver driver2) {
		
		this.driver=driver2;

		PageFactory.initElements(driver2,this);
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoom() {
		return Rooms;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return Submit;
	}
	

	
	
	

}
