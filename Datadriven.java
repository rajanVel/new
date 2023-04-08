package Mavenproject.Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Datadriven {
	
	
	
	
	public static void particular_data() throws Throwable {

		File F = new File("C:\\Users\\Raja\\OneDrive\\Desktop\\DD.xlsx");
		
		FileInputStream FIS = new FileInputStream(F);
		
		Workbook WB	= new XSSFWorkbook(FIS);
		
		Sheet sheetAt = WB.getSheetAt(0);
		
		Row row = sheetAt.getRow(1);
		
		Cell cell = row.getCell(1);
		
		System.out.println(cell);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			int value = (int)numericCellValue;
			
			System.out.println(value);
			
		}
		
	}
	
	public static void all_data() throws Throwable {

		File f1 = new File("C:\\Users\\Raja\\OneDrive\\Desktop\\DD.xlsx");
		
		FileInputStream fs = new FileInputStream(f1);
		
		Workbook wb = new XSSFWorkbook(fs);
		
		Sheet sheetAt = wb.getSheet("sheet1");
		
		int numbOfRows = sheetAt.getPhysicalNumberOfRows();
		
		System.out.println(numbOfRows);
		
		for (int i=0; i<numbOfRows;i++) {
			
			Row row = sheetAt.getRow(i);
			
			int numOfrows = row.getPhysicalNumberOfCells();
		
			for (int j = 0; j < numOfrows; j++) {
				
			Cell cell = row.getCell(j);
			
			CellType cellType = cell.getCellType();
			
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
			}
			else if (cellType.equals(cellType.NUMERIC)) {
				
				double numericCellValue = cell.getNumericCellValue();
				
				int value = (int)numericCellValue;
				
				System.out.println(value);
				
			}
				
			}
			
		}
		
		
	}

	public static void main(String[] args) throws Throwable {
		
		particular_data();
		all_data();
	}

}
