package excelDataDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataByName 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\testdata1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = null;
		
		int cellindex= -1;
		for(int c=0;c<row.getLastCellNum();c++)
		{
			if(row.getCell(c).getStringCellValue().trim().equals("Password"))
			{
				cellindex = c;
			}
		}
		
		row = sheet.getRow(1);
		cell = row.getCell(cellindex);
		String val = cell.getStringCellValue();
		System.out.println(val);
		wb.close();
		fis.close();
	}
}
