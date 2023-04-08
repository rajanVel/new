package Mavenproject.Automation;

import org.openqa.selenium.WebDriver;

public class Project2_POM {
	
	public WebDriver driver;

	public Project2_POM(WebDriver driver2) {
		
		this.driver=driver2;
	}
	
	private Login_p2 Login;

	
	public Login_p2 getLogin() {
		
		if (Login== null) {
			
			Login = new Login_p2(driver);
			
		}
		return Login;
	}

}
