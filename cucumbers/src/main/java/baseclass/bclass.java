package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class bclass {

	
	public static WebDriver driver;

	public static String value;


		
	public static WebDriver Browserlaunch(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Raja\\eclipse-workspace\\cucumbers\\driver\\chromedriver.exe");

			 driver = new ChromeDriver();

		}
		
		else if(type.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir"+"//driver//geckodriver.exe"));
			
			driver = new FirefoxDriver();
			
		}
		
		return driver;
		 

	}
	public static  String particular_data(String path,int row_index,int cell_index) throws Throwable {

		File F = new File(path);
		
		FileInputStream FIS = new FileInputStream(F);
		
		Workbook WB	= new XSSFWorkbook(FIS);
		
		Sheet sheetAt = WB.getSheetAt(0);
		
		Row row = sheetAt.getRow(row_index);
		
		Cell cell = row.getCell(cell_index);
		
		System.out.println(cell);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			 value = cell.getStringCellValue();
			
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			int val = (int)numericCellValue;
			
			 value = String.valueOf(val);
		}
		return value;
		
		
		}
		
		
	public static void URL(String url) {
		driver.get(url);
	}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void click(WebElement element) {
		
		element.click();

	}
	public static void inputsend(WebElement element, String value) {
		
		element.sendKeys(value);

	}			
			public static void Select(WebElement element,String selecttype,String value ) {
				
				
				Select s = new Select(element);
				if (selecttype.equalsIgnoreCase("value")) {
					s.selectByValue(value);
				}
				
				else if (selecttype.equalsIgnoreCase("Text")) {
					s.selectByVisibleText(value);
					
				}
				else if (selecttype.equalsIgnoreCase("index")) {
					int index =Integer.parseInt(value);
					s.selectByIndex(index);
				}
				

			}
			
			public static void Wait(int sec)
			{
				driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
				
					
			}
			public static void screenshot(String location) {
				try {
			
				{
					TakesScreenshot TS = (TakesScreenshot)driver;
					
					File Source = TS.getScreenshotAs(OutputType.FILE);
					
					File Destination = new File(location);
					
					FileHandler.copy(Source, Destination);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
			
			public static void Frames(String frametype,String value,WebElement element) {
				if (frametype.equalsIgnoreCase("value")) {
					driver.switchTo().frame(value);	
				}
				
				else if(frametype.equalsIgnoreCase("index")){
					int index = Integer.parseInt(value);
					driver.switchTo().frame(index);
				}
				else if(frametype.equalsIgnoreCase("element"))
						{
				driver.switchTo().frame("element");
				}
				else if(frametype.equalsIgnoreCase("parentframe")){
				driver.switchTo().parentFrame();
				}
				else if(frametype.equalsIgnoreCase("defaultcontent")){
				driver.switchTo().defaultContent();

			}
			}
}
