package seleniumBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_004 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		
		BaseTest obj = new BaseTest();
		obj.init("chromebrowser");
		
		navigateUrl("amazonurl");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.className("nav-input nav-progressive-attribute")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		//driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
		//driver.findElement(By.linkText("Best Sellers")).click();
		
		//driver.findElement(By.partialLinkText("Best Seller")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			//if(!links.get(i).getText().isEmpty())
			//{
				System.out.println(links.get(i).getText());
			//}
		}
	}

}
