package excelDataDriven;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataManagementFinalVersion 
{
	
	@Test(dataProvider = "getData")
	  public void f(Hashtable<String, String> str) 
	  {
		  System.out.println(str.get("UserName"));
		  System.out.println(str.get("UserPassword"));
	  }

	 @DataProvider
	  public Object[][] getData() throws Exception 
	  {
		 	ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\suitex.xlsx");
			String sheetName = "data";
			String testName = "LoginTest";
			return DataUtil.getTableData(e, sheetName, testName);
	  }

}
