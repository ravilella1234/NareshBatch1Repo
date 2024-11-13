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
  public void f() 
  {
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
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
		
		obj.assertTrue(driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).isDisplayed());
		
		
		
		obj.assertAll();
  }
  
}
