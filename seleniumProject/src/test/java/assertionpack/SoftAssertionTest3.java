package assertionpack;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertionTest3 
{
	
  @Test
  public void f() throws InterruptedException 
  {
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		SoftAssert obj = new SoftAssert();
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		obj.assertTrue(actualTitle.contains(expectedTitle), "Both Titles are not equal...");
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.amazon.in/abc";
		obj.assertTrue(actualUrl.contains(expectedUrl), "Both urls are not equal...");
		
		//obj.fail( i.getThrowable().getMessage());
		//Reporter.log("Both urls are not equal..."+i.getThrowable().getMessage());
		
		obj.assertTrue(driver.findElement(By.linkText("Best Sellers")).isDisplayed(), "Sign in securely link iS not diSplayed...");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Books", Keys.ENTER);
		
		obj.assertTrue(driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']//span[contains(text(),'The Pursuit of Happiness: A Book of Studies and St')]")).isDisplayed());
		
		
		
		obj.assertAll();
  }
  
}
