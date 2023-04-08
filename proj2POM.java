package Mavenproject.Automation;

import org.openqa.selenium.WebDriver;

public class proj2POM {

	public static proj2Login login;
	
	public static proj2sendpage page2 ;
	 public static WebDriver driver;
	
	public proj2POM(WebDriver driver2) {
		this.driver = driver2;
	}

	public static proj2Login getnstanceLogin() {
		if (login== null) {
			login= new proj2Login(driver);
		}
		return login;
	}

	public static proj2sendpage getnstancePage2() {
		if (page2== null) {
			page2 = new proj2sendpage(driver);
		}
		return page2;
	}

	
}
