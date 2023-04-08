package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class POM_AD {
	
	
	public POM_AD(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebDriver driver;
	
	public LoginpagePOM LP ;
	
	public SearchpagePOM search;
	
	public LoginpagePOM getinstanceLP() {
		if (LP==null) {
			LP= new LoginpagePOM(driver);
			
		}
		return LP;
	}

	public SearchpagePOM getinstanceSearch() {
		
		if (search==null) {
			search = new SearchpagePOM(driver);
			
		}
		return search;
	}

	
	
}
