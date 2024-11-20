package seleniumBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class TC_006 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		BaseTest obj = new BaseTest();
		obj.init("chromebrowser");
		
		
		test.log(Status.INFO, "Launced the browser :  " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		test.log(Status.PASS, "Navigated to url : "+ childProp.getProperty("amazonurl"));
		
		WebElement ele = driver.findElement(By.linkText("Best Sellers"));
		String actualLink = ele.getText();
		String expectedLink = "Best Seller";
		
		if(!actualLink.equals(expectedLink))
			reportFailure("Both links are not equal...",ele);
		else
			reportSuccess("Both links are equal...");
		
		report.flush();
	}
}
