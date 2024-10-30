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

public class Selfy2 
{
  public String getTestCaseName()
  {
	return this.getClass().getSimpleName();  
  }
  
	
	public static void main(String[] args) throws Exception 
	{
		Selfy2 obj = new Selfy2();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.linkText("Rajinikanth"));
		Date d = new Date();
		String dt = d.toString().replace(" ", "_").replace(":", "_");
		
		if(links.size() == 0)
		{
			File scrshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//FileHandler.copy(scrshot, new File("C:\\Users\\DELL\\Desktop\\screenshots\\goolge.jpeg"));
			//FileHandler.copy(scrshot, new File("C:\\Users\\DELL\\Desktop\\screenshots\\"+driver.getTitle()+"_"+dt+".jpeg"));
			FileHandler.copy(scrshot, new File("C:\\Users\\DELL\\Desktop\\screenshots\\"+obj.getTestCaseName()+"_"+dt+".jpeg"));
		}
		
		
	}

}
