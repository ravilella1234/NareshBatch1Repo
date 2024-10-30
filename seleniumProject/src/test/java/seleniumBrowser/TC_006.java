package seleniumBrowser;

import org.openqa.selenium.By;

import com.aventstack.extentreports.Status;

public class TC_006 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init("chromebrowser");
		test = report.createTest("TC_006");
		test.log(Status.INFO, "init the properties files");
		
		test.log(Status.INFO, "Launced the browser :  " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigated to url : "+ childProp.getProperty("amazonurl"));
		
		String actualLink = driver.findElement(By.linkText("Best Sellers")).getText();
		String expectedLink = "Best Seller";
		
		if(!actualLink.equals(expectedLink))
			reportFailure("Both links are not equal...");
		else
			reportSuccess("Both links are equal...");
		
		report.flush();
	}
}
