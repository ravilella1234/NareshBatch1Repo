package webDriverscreenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selfy3 
{
	  public String getTestCaseName()
	  {
		return this.getClass().getSimpleName();  
	  }
  
	
	public static void main(String[] args) throws Exception 
	{
		Selfy3 obj = new Selfy3();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		for(int i=0;i<links.size();i++)
		{
			String linkName = links.get(i).getText();
			links.get(i).click();
			
			File scrshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scrshot, new File("C:\\Users\\DELL\\Desktop\\screenshots\\"+linkName+".png"));
			links = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		}	
	}

}
