package seleniumBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example2 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
		
		/*List<WebElement> loc = driver.findElements(By.cssSelector("div.dt-paging>nav>button"));
		int pagesize = loc.size();*/
		
		int pagesize = driver.findElements(By.cssSelector("div.dt-paging>nav>button")).size();
		System.out.println(pagesize);
		
		for(int i=3;i<=pagesize-2;i++)
		{
			String loc = "div.dt-paging>nav>button:nth-child("+i+")";
			driver.findElement(By.cssSelector(loc)).click();
			//Thread.sleep(2000);
			
			List<WebElement> names = driver.findElements(By.cssSelector("table#example>tbody>tr>td:nth-child(1)"));
			for(WebElement n:names)
			{
				System.out.println(n.getText());
			}
			System.out.println(" -------- End of page :" + (i-2) + "-----------");
		}
		
	}

}
