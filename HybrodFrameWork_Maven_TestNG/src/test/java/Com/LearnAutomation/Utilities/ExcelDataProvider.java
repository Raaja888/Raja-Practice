package Com.LearnAutomation.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider(WebDriver driver)
	{
		File src = new File("./Exceldata/Exceldata.xlsx");
		
		try {
			
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);
		} 
		
		catch (IOException e) 
		{
		   System.out.println("please check the data" + e.getMessage());
		}	
	}
	
	
	public  String GetStringDataExcel(String sheetname,int row,int column)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
	public  String GetStringDataExcel(int sheetindex,int row,int column)
	{
		return wb.getSheetAt(sheetindex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public  double GetNumericDataExcel(String sheetname,int row,int column)
	{
		return wb.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
	}
	

}
