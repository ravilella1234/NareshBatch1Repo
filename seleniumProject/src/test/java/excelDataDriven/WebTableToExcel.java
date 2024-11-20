package excelDataDriven;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableToExcel 
{

	public static void main(String[] args) throws IOException 
	{
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers");
		
		String path=".\\datafiles\\sharemarket.xlsx";
		XLUtility xlutil=new XLUtility(path);
		
		//Write headers in excel sheet
		xlutil.setCellData("Sheet1", 0,0, "Company");
		xlutil.setCellData("Sheet1", 0,1, "Prev Close");
		xlutil.setCellData("Sheet1", 0,2, "Current Price");
		xlutil.setCellData("Sheet1", 0,3, "Change");
		
		
		//capture table rows
		
		WebElement table=driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr"));
		int rows=table.findElements(By.xpath("th")).size(); // rows present in web table
		
		for(int thead=1;thead<=rows;thead++)
		{
			//read data from web table
			
			String Company=table.findElement(By.xpath("th[1]")).getText();
			String PrePrice=table.findElement(By.xpath("th[3]")).getText();
			String ClosePrice=table.findElement(By.xpath("th[4]")).getText();
			String Change=table.findElement(By.xpath("th[5]")).getText();
			
			System.out.println(Company + PrePrice + ClosePrice + Change);
			
			//writing the data in excel sheet
			xlutil.setCellData("Sheet1", 0, 0, Company);
			xlutil.setCellData("Sheet1", 0, 1, PrePrice);
			xlutil.setCellData("Sheet1", 0, 2, ClosePrice);
			xlutil.setCellData("Sheet1", 0, 3, Change);			
		}
		
		System.out.println("Web scrapping is done succesfully.....");
		driver.close();
		
	}

}
