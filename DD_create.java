package Mavenproject.Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DD_create {
	
	
	public static void create() throws Throwable {
		

		
		File F = new File("C:\\Users\\Raja\\OneDrive\\Desktop\\DD.xlsx");
		
		FileInputStream FIS = new FileInputStream(F);
		
		Workbook WB = new XSSFWorkbook(FIS);
		
		WB.createSheet("write").createRow(0).createCell(0).setCellValue("Rajarajan");
		
		WB.getSheet("write").getRow(0).createCell(1).setCellValue("Thanjavur");
		
		FileOutputStream FOS = new FileOutputStream(F);
		
		WB.write(FOS);
		
		
	}

	public static void main(String[] args) throws Throwable {
		
		
		create();

	}

}
