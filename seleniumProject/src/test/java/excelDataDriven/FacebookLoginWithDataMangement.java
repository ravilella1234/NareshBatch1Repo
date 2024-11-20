package excelDataDriven;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginWithDataMangement 
{
	@Test(dataProvider = "getData")
    public void testcaseData(Hashtable<String, String> str) throws Exception 
	{
        if (str != null) 
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.findElement(By.id("email")).sendKeys(str.get("UserName"));
            driver.findElement(By.id("pass")).sendKeys(str.get("UserPassword"));
            System.out.println("logged in successfully");
        }
    }

    @DataProvider
    public Object[][] getData() throws Exception 
    {
    	  ExcelAPI e = new ExcelAPI("C:\\Users\\Lenovo\\Downloads\\suitex.xlsx");
          String sheetName = "data";
          String testName = "LoginTest";

          // find matching testcase Rownumber
          int teststartrownum = 0;
          while (!e.getCellData(sheetName, 0, teststartrownum).equals(testName)) {
              teststartrownum++;
          }
          System.out.println(testName + " start row num " + teststartrownum);

          int colstartrownum = teststartrownum + 1; // colum name starts so add +1 browser//6
          int datastartrownum = teststartrownum + 2; // for row test case data add+2 eg y//7

          // calculate the rows of data

          int rows = 0;

          while (!e.getCellData(sheetName, 0, datastartrownum + rows).equals("")) {
              rows++;
          }
          System.out.println("total rows are in testcase:" + rows);

          // calculate col of data
          int cols = 0;
          while (!e.getCellData(sheetName, cols, colstartrownum).equals("")) {
              cols++;
          }
          System.out.println(cols); // 2

          // Read the test data
          int dataRow = 0;
          // using hashtable bcz its contain multiple rows but one column name ,its avoid  mismatched columndata output
          Hashtable<String, String> table = null;

          Object[][] data = new Object[rows][1];

          for (int rnum = datastartrownum; rnum < datastartrownum + rows; rnum++) 
          {
              table = new Hashtable<String, String>(); // all row and columns data get in array and stored in table

              for (int cnum = 0; cnum < cols; cnum++) 
              {
                  String key = e.getCellData(sheetName, cnum, colstartrownum); // colstartrownum eg runmode colum data get
                  // as key
                  String value = e.getCellData(sheetName, cnum, rnum); // rum as a value eg y in excel

                  table.put(key, value);
              }
              if (table.containsValue("Y")) {
                  System.out.println(table.get("UserName"));
                  System.out.println(table.get("UserPassword"));
                  data[dataRow][0] = table;      
                  // data rows no are incresing but colm is same 0
              }
              //data[dataRow][0] = table;
              dataRow++;
          }
		return data;
      }
}
