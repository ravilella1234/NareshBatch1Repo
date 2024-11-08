package testNGpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import seleniumBrowser.BaseTest;

public class CheckBox1  extends BaseTest
{
	
	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String bType) throws Exception 
	{
		//init("chromebrowser");		
		init(bType);
		navigateUrl("chekboxurl");
	}
	   
	@Test
	public void checkboxTest()
	{
		List<WebElement> check=driver.findElements(By.xpath("//td[@class='table5']/input[@type='checkbox']"));
		for(int i=0;i<check.size();i++)
		{
			System.out.println(check.get(i).getAttribute("value")+"--"+check.get(i).getAttribute("checked"));
			//System.out.println(check.get(i).isSelected());
		}
	}
 

  @AfterMethod
  public void afterMethod() 
  {
	 report.flush();
	 driver.quit();
  }

}
