package assertionpack;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAssertionTest2 
{
	
  @Test
  public void f() 
  {
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		assertTrue(actualTitle.contains(expectedTitle), "Both Titles are not equal...");
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.amazon.in/abc";
		assertTrue(actualUrl.contains(expectedUrl), "Both urls are not equal...");
		
		assertTrue(driver.findElement(By.linkText("Sign in securely")).isDisplayed(), "Sign in securely link iS not diSplayed...");
  }
  
}
