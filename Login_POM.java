package Mavenproject.Automation;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_POM {

	public WebDriver driver;
	@FindBy(name ="email")
	private WebElement  user;
	
	@FindBy(name ="pass")
	private WebElement pass;
	
	@FindBy(name="login")
	private WebElement login;
	
	
	public Login_POM(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
}
