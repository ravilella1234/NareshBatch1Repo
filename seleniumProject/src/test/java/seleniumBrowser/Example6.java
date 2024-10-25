package seleniumBrowser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example6 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("APjFqb")).sendKeys("Hadoop");
		//Thread.sleep(2000);
		  List<WebElement> items = driver.findElements(By.xpath("//div[@jsname='erkvQe']//ul/li//descendant::div[@class='wM6W7d']/span"));
		  
		  System.out.println(items.size());
		  
		  for(int i=0;i<items.size();i++)
		  {
			  if(items.get(i).getText().contains("hadoop tutorial"))
			  {
				  items.get(i).click();
				  break;
			  }
		  }
	}

}
