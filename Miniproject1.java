package Mavenproject.Automation;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.properties.File_Reader_Manager;

public class Miniproject1 extends Base_class {
	public static WebDriver driver= Browserlaunch("chrome");;
	
	public static Pageobjectmanager_project1 POM = new Pageobjectmanager_project1(driver);
	
	
//	public static Loginpage_POM Lin = new Loginpage_POM(driver);
//	
//	public static Address_POM Add = new Address_POM(driver);
//	
//	public static Bookingdetails_POM Book = new Bookingdetails_POM(driver);
	
	public static void main(String[] args) throws Throwable {
		
		URL("https://adactinhotelapp.com/index.php");
		
		maximize();
		
		
		
//		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		inputsend(POM.getinstanceLin().getUser(),"Rajarajanv");
		
		//WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
				inputsend(POM.getinstanceLin().getPass(), "2I6Y7I");
				
//				WebElement click = driver.findElement(By.xpath("//input[@class='login_button']"));
				click(POM.getinstanceLin().getClick());
				
				
				
				Thread.sleep(5000);
				
//				WebElement Location = driver.findElement(By.xpath("//select[@name='location']"));
				Select(POM.getinstanceAdd().getLocation(),"Text", "New York");
//				Select S1 = new Select(Location);
//				S1.selectByValue("New York");
				
//				WebElement Hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
				Select(POM.getinstanceAdd().getHotel(),"Text" ,"Hotel Sunshine");
//				Select S2 = new Select(Hotel);
//				S2.selectByVisibleText("Hotel Sunshine");
				
				//WebElement Roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
				Select(POM.getinstanceAdd().getRoomtype(), "Text", "Standard");
//				Select S3=new Select(Roomtype);
//				S3.selectByVisibleText("Standard");
				
//				WebElement Roomnumber = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
				Select(POM.getinstanceAdd().getRoomnumber(), "Value", "2");
//				Select S4 = new Select(Roomnumber);
//				S4.selectByValue("2");
				
//				WebElement Date = driver.findElement(By.xpath("//input[@name='datepick_in']"));
				inputsend(POM.getinstanceAdd().getDate(), "07/12/2022");
				
//				WebElement number = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
				Select(POM.getinstanceAdd().getNumber(), "value", "2");
//				Select S5 =new Select(number);
//				S5.selectByValue("2");
				
//				WebElement children = driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
				Select(POM.getinstanceAdd().getChildren(), "Value", "2");
//				Select S6 =new Select(children);
//				S6.selectByValue("2");
				
				
			//	WebElement click1 = driver.findElement(By.xpath("//input[@id='Submit']"));
				click(POM.getinstanceAdd().getClick1());
				
			//	WebElement click2 = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
				click(POM.getinstanceAdd().getClick2());
				
			//	WebElement click3 = driver.findElement(By.xpath("//input[@name='continue']"));
				click(POM.getinstanceAdd().getClick3());
				
			//	WebElement raja = driver.findElement(By.xpath("//input[@name='first_name']"));
				inputsend(POM.getinstanceBook().getRaja(), "Raja");
				
			//	WebElement Rajan = driver.findElement(By.xpath("//input[@name='last_name']"));
				inputsend(POM.getinstanceBook().getRajan(), "Rajan");
				
			//	WebElement Address = driver.findElement(By.xpath(" //textarea[@id='address']"));
				inputsend(POM.getinstanceBook().getAddress(),"No:1132 Attumanthai Street %n thanjavur" );
				
			//	WebElement Number = driver.findElement(By.xpath("//input[@id='cc_num']"));
				inputsend(POM.getinstanceBook().getNumber(), "9791843496123456");
				
			//	WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
				Select(POM.getinstanceBook().getCardtype(), "Text","VISA");
//				Select S7 = new Select(cardtype);
//				S7.selectByVisibleText("VISA");
				
			//	WebElement Expdate = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
				Select(POM.getinstanceBook().getExpdate(), "value", "10");
//				Select S8 = new Select(Expdate);
//				S8.selectByValue("10");;
				
			//	WebElement Expmonth = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
				Select(POM.getinstanceBook().getExpmonth(), "Text", "2022");
//				Select S9 = new Select(Expmonth);
//				S9.selectByVisibleText("2022");
				
			//	WebElement pin = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
				inputsend(POM.getinstanceBook().getPin(), "2410");
				
			//	WebElement click4 = driver.findElement(By.xpath("//input[@id='book_now']"));
				click(POM.getinstanceBook().getClick4());
				
				screenshot("C:\\Users\\Raja\\eclipse-workspace\\Automation\\Screenshots\\raja.png");
		
		
		
	}

}
