package excelDataDriven;

import java.util.Hashtable;

public class DataUtil 
{
	public static Object[][] getTableData(ExcelAPI e,String sheetName, String testName)
	{
		//To find the matching Tetcase RowNumber
		int teststartrownum = 0;
		while(!e.getCellData(sheetName, 0, teststartrownum).equals(testName))
		{
			teststartrownum++;
		}
		System.out.println(testName +" start row number :" + teststartrownum);
		
		int colstartrownum = teststartrownum+1;
		int datastartrownum = teststartrownum+2;
		
		//calculate the rows of data
		int rows=0;
		while(!e.getCellData(sheetName, 0, datastartrownum+rows).equals(""))
		{
			rows++;
		}
		System.out.println("Total rows are  :" + rows);
		
		//calculate the cols of data
		int cols = 0;
		while(!e.getCellData(sheetName, cols, colstartrownum).equals(""))
		{
			cols++;
		}
		System.out.println("Total cols are : "+ cols);
		
		//Read the test data
		int dataRow = 0;
		Hashtable<String, String> table = null;
		Object[][] data = new Object[rows][1];
		for(int rnum=datastartrownum;rnum<datastartrownum+rows;rnum++)
		{
			table = new Hashtable<String, String>();
			for(int cnum=0;cnum<cols;cnum++)
			{
				//System.out.println(e.getCellData(sheetName, cnum, rnum));
				//data[dataRow][cnum] = e.getCellData(sheetName, cnum, rnum);
				String key = e.getCellData(sheetName, cnum, colstartrownum);
				String value = e.getCellData(sheetName, cnum, rnum);
				table.put(key, value);
			}
			data[dataRow][0] = table;
			dataRow++;
		}
		return data;
	}

}
