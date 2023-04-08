package Mavenproject.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_p2 {
	public WebDriver driver;
	
	
	@FindBy(xpath ="//input[@id='username']")
	private WebElement user;
	
	@FindBy(xpath ="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath ="//input[@class='login_button']")
	private WebElement click;
	

	public Login_p2(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getinstanceUser() {
		
		return user;
	}

	public WebElement getinstancePass() {
		return pass;
	}

	public WebElement getinstanceclick(){
		return click;
	}

	

}
