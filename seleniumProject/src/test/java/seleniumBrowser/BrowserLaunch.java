package seleniumBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		WebDriver driver = null;
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		driver.get("https://www.bestbuy.com/");
		
		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");

	}

}
