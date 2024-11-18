package excelDataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData 
{

	public static void main(String[] args) throws Exception 
	{
		File f = new File("C:\\Users\\DELL\\Desktop\\data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("people");
		
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		
		/*for(int r=0;r<rows;r++)
		{
			XSSFRow row = sheet.getRow(r);
			for(int c=0;c<cols;c++ )
			{
				XSSFCell cell = row.getCell(c);
				
				switch (cell.getCellType()) 
				{
					case STRING : System.out.print(cell.getStringCellValue()); break;
					case NUMERIC : System.out.print(cell.getNumericCellValue()); break;
					case BOOLEAN : System.out.print(cell.getBooleanCellValue()); break;
					case FORMULA : System.out.print(cell.getCellFormula()); break;
				default: System.out.print("Cell is empty"); break;
				}
				System.out.print(" | ");
			}
			System.out.println();
		}*/
		
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext())
		{
			 XSSFRow row = (XSSFRow)rowIterator.next();
			 Iterator<Cell> cellIterator = row.cellIterator();
			 while(cellIterator.hasNext())
			 {
				 XSSFCell cell = (XSSFCell)cellIterator.next();
				 switch (cell.getCellType()) 
					{
						case STRING  : System.out.print(cell.getStringCellValue()); break;
						case NUMERIC : System.out.print(cell.getNumericCellValue()); break;
						case BOOLEAN : System.out.print(cell.getBooleanCellValue()); break;
						case FORMULA : System.out.print(cell.getCellFormula()); break;
					default: System.out.print("Cell is empty"); break;
					}
					System.out.print(" | ");
				}
				System.out.println();
			}	
	}	
}
