package icici.loan.carloan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameSwitch 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
		driver.findElement(By.linkText("java.applet")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("packageFrame")));
		driver.findElement(By.linkText("AppletContext")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.findElement(By.linkText("Applet")).click();
	}

}
