package optionDemo;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionDemo 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.setBinary("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
		option.addArguments("--user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		//option.addArguments("--start-maximized");
		//option.addArguments("--headless");
		//option.addArguments("--incognito");
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		System.out.println(option.getBrowserName());
		System.out.println(option.getBrowserVersion());
		option.addArguments("--disable-notifications");
		
		//option.addArguments("--proxy-server=https://192.168.10.1:1744");
		option.addArguments("--ignore-certificate-errors");
		
		WebDriver driver = new ChromeDriver(option);
		//driver.get("https://www.axisbank.com/");
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
