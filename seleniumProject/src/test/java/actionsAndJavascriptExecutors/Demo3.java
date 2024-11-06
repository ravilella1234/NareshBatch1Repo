package actionsAndJavascriptExecutors;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		 driver.findElements(By.xpath("//div[@id='nav-xshop']/a")).get(3).click();
		
		
		/*for(WebElement link:links)
		{
			if(link.getText().equals("Best Sellers"))
				link.click();
		}*/
	}

}
