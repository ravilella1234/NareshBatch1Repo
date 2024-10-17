package seleniumBrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;
	public static File f;
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	
	public static void init() throws Exception
	{
		f = new File(".\\src\\test\\resources\\data.properties");
		fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		//String e = p.getProperty("amazonurl");
		//System.out.println(e);
		
		f = new File(".\\src\\test\\resources\\environment.properties");
		fis = new FileInputStream(f);
		mainProp = new Properties();
		mainProp.load(fis);
		String e = mainProp.getProperty("env");
		System.out.println(e);
		
		f = new File(".\\src\\test\\resources\\"+e+".properties");
		fis = new FileInputStream(f);
		childProp = new Properties();
		childProp.load(fis);
		String val = childProp.getProperty("amazonurl");
		System.out.println(val);
	}
	
	public static void launch(String browserType)
	{
		if(p.getProperty(browserType).equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(p.getProperty(browserType).equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if(p.getProperty(browserType).equals("edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(url);
		driver.navigate().to(childProp.getProperty(url));
	}

}
