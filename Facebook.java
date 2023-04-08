package Mavenproject.Automation;

import org.openqa.selenium.WebDriver;
import org.properties.File_Reader_Manager;




public class Facebook extends Base_class {
	
//
public static WebDriver driver= Browserlaunch("chrome");
//	public static Login_POM Lp = new Login_POM(driver);
	
	public static void main(String[] args) throws Throwable {
		
		maximize();
		
		String geturl = File_Reader_Manager.getinstanceFRM().getinstanceCR().geturl();
		
		URL(geturl);
		
//		URL("https://www.facebook.com/");
//		
//		Wait(30);
//		
//		maximize();
//	
//		Wait(20);
//		
//		inputsend(Lp.getUser(), "rajanbhai246@gmail.com");
//		
//		inputsend(Lp.getPass(), "Nokia!26");
//		
//		click(Lp.getLogin());
		
	}

}
