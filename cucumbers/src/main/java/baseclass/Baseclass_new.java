package baseclass;

import java.awt.Desktop.Action;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass_new {
	
	public WebDriver driver;
	public WebDriver Browserlaunch(String Type) {

		if(Type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\cucumbers\\driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (Type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir"+"//driver//geckodriver.exe"));
			driver = new FirefoxDriver();
			
		}
		return driver;
		
	}
	
	public void Close() {
		
		driver.close();
	}
	public void Quit() {
		
		driver.quit();
	}
	
	public void Navigateto(String URL) {
		
		driver.navigate().to(URL);
	}
	
	public void Navigateback() {
		
		driver.navigate().back();
	}
	public void Navigateforward() {
		
		driver.navigate().forward();
	}
	public void Navigaterefresh() {

		driver.navigate().refresh();
		
	}
	public void GetURL(String URL) {
		
		driver.get( URL);
	}
	public void Alert(String Type,String keys) {

		Alert alert = driver.switchTo().alert();
		
		if (Type.equalsIgnoreCase("accept")) {
			alert.accept();
		}
		else if (Type.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}
		else if (Type.equalsIgnoreCase("sendkeys")) {
			alert.sendKeys(keys);
			
		}
		
	}
	public void Actionz(WebElement element,String Type) {

		Actions a = new Actions(driver);
		
		
		if (Type.equalsIgnoreCase("click")) {
			
			a.click(element).build().perform();
			
		}
		
		else if (Type.equalsIgnoreCase("Contextclick")) {
			
			a.contextClick(element).build().perform();
		}
		
		else if (Type.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(element).build().perform();
			
		}
		else if (Type.equalsIgnoreCase("Movetoelement")) {
			a.moveToElement(element).build().perform();
		}
		
	}
	public void Iframe(String type) {
		
		
		if (type.equalsIgnoreCase("name")) {
			driver.switchTo().frame(type);
		}
		else if (type.equalsIgnoreCase(type)) {
			int i=Integer.parseInt(type); 
			driver.switchTo().frame(i);
		}
		else if (type.equalsIgnoreCase("default")) {
			driver.switchTo().defaultContent();
			
		}
		else if (type.equalsIgnoreCase("parent")) {
			driver.switchTo().parentFrame();
			
		}
		
	}
	public void Winndowshandle() {

		String windowHandle = driver.getWindowHandle();
		
		System.out.println(windowHandle);
	}
	public void Winndowshandles() {
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String str : windowHandles) {
			String title = driver.switchTo().window(str).getTitle();
			System.out.println(title);
			
		}
		
		
	}
	
	public void Dropdown(WebElement element) {
		
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
	}
	public void singledrop(WebElement element,String type,String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
			
		}
		else if (type.equalsIgnoreCase("index")) {
			int index =Integer.parseInt(value);
			s.selectByIndex(index);
			
		}
	}
	
	public void Multidrop(WebElement element) {
		
		Select s = new Select(element);
		
		boolean multiple = s.isMultiple();
		
		System.out.println(multiple);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement data : allSelectedOptions) {
			System.out.println(data.getText());
	
		}
		
	}
	public void Gettitle() {
		
		String title = driver.getTitle();
		
		System.out.println(title);
	}
	
	public void GetcurrentURL() {
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
	}
	
	public void wait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		
	}
	public void Takescreenshot(String Dec) {

		TakesScreenshot TS = (TakesScreenshot)driver;
		File Source = TS.getScreenshotAs(OutputType.FILE);
		File Destination = new File(Dec);
		//FileHandler.copy(Source, Destination);
		
	}
	
	public static void inputsend(WebElement element, String value) {
		
		element.sendKeys(value);

	}
	public void CLick(WebElement element) {
		element.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
