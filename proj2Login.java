package Mavenproject.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class proj2Login {
	
	public static WebDriver driver;

	@FindBy(xpath ="//input[@id='username']" )
	private WebElement username;
	
	@FindBy(xpath ="//input[@type='password']" )
	private WebElement pasword;
	
	@FindBy(xpath ="//input[@class='login_button']" )
	private WebElement login;	
	

	public proj2Login(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver2, this);
	
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPasword() {
		return pasword;
	}

	public WebElement getLogin() {
		return login;
	}

}
