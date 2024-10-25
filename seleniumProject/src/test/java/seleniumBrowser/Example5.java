package seleniumBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example5 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//String link = driver.findElement(By.linkText("Best Sellers")).getText();
		String link = driver.findElement(By.linkText("Best Sellers")).getAttribute("innerHTML");
		System.out.println(link);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LG");
		//String ele = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");
		String ele = driver.findElement(By.id("twotabsearchtextbox")).getText();
		System.out.println(ele);
		
	}

}
