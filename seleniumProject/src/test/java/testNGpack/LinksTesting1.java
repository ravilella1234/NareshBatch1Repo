package testNGpack;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import seleniumBrowser.BaseTest;

public class LinksTesting1 extends BaseTest
{
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String bType) throws Exception
	{
		//init("chromebrowser");
		init(bType);
		navigateUrl("googleurl");
	}
	
	
	@Test
	public void linktesting1()
	
	 {
		String expval="Google Images";
		
		driver.findElement(By.linkText("Images")).click();	
		Reporter.log("Clicked on Image Link");
		String actval=driver.getTitle();
		
		Assert.assertEquals(actval, expval);
		
	 }
	
	@AfterMethod
	public void tearDown()
	{
		 report.flush();
		 driver.quit();
	}

}
