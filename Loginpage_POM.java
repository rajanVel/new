package Mavenproject.Automation;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_POM extends Base_class

{
	
	public WebDriver driver;


	@FindBy(xpath = "//input[@id='username']")
	private WebElement user;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@class='login_button']")
	private WebElement click;


	public Loginpage_POM(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getUser() {
		return user;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getClick() {
		return click;
	}

		
		
		
	

	
	
}
