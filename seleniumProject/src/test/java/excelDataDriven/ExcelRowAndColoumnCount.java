package excelDataDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRowAndColoumnCount 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("people");
		
		int rowCount = sheet.getLastRowNum()+1;
		System.out.println("Row Count is : " + rowCount);
		
		short colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Column Count is : " + colCount);
	}

}
