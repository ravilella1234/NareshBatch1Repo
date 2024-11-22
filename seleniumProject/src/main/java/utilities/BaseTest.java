package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	public static WebDriver driver;
	public static File f;
	public static FileInputStream fis;
	public static Properties p;
	public static Properties mainProp;
	public static Properties childProp;
	public static Properties orProp;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
	public  void init(String browserType) throws Exception
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
		
		f = new File(".\\src\\test\\resources\\or.properties");
		fis = new FileInputStream(f);
		orProp = new Properties();
		orProp.load(fis);
		
		f = new File(".\\src\\test\\resources\\log4jconfig.properties");
		fis = new FileInputStream(f);
		PropertyConfigurator.configure(fis);
		
		launch(browserType);
	}
	
	public String cName()
	{
		return this.getClass().getSimpleName();
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
		driver.manage().deleteAllCookies();
		System.out.println(browserType + Thread.currentThread().getId());
	}
	
	public static void navigateUrl(String url)
	{
		//driver.get(url);
		driver.navigate().to(childProp.getProperty(url));
		//test.log(Status.INFO, "Navigated to url : "+ driver.getCurrentUrl());
	}
}
