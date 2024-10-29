package seleniumBrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

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
		
		f = new File(".\\src\\test\\resources\\or.properties");
		fis = new FileInputStream(f);
		orProp = new Properties();
		orProp.load(fis);
		
		f = new File(".\\src\\test\\resources\\log4jconfig.properties");
		fis = new FileInputStream(f);
		PropertyConfigurator.configure(fis);
		
		report = ExtentManager.getInstance();
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
	
	public static void clickElement(String locatorKey) 
	{
		getLocator(locatorKey).click();
		//driver.findElement(By.xpath(orProp.getProperty(locatorKey))).click();
	}

	public static void typeText(String locatorKey, String text) 
	{
		getLocator(locatorKey).sendKeys(text);
		//driver.findElement(By.name(orProp.getProperty(locatorKey))).sendKeys(text);
	}

	public static void selectDropDown(String locatorKey, String option)
	{
		getLocator(locatorKey).sendKeys(option);
		//driver.findElement(By.id(orProp.getProperty(locatorKey))).sendKeys(option);
	}

	public static boolean isElementPresent(String locatorKey) 
	{
		
		try 
		{
			WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			Wait.until(ExpectedConditions.presenceOfElementLocated(locator(locatorKey)));
			
			/*if(locatorKey.endsWith("_id")) {
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.id(orProp.getProperty(locatorKey))));
			}else if (locatorKey.endsWith("_name")) {
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.name(orProp.getProperty(locatorKey))));
			}else if (locatorKey.endsWith("_classname")) {
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.className(orProp.getProperty(locatorKey))));
			}else if (locatorKey.endsWith("_xpath")) {
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(orProp.getProperty(locatorKey))));
			}else if (locatorKey.endsWith("_css")) {
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(orProp.getProperty(locatorKey))));
			}else if (locatorKey.endsWith("_linktext")) {
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(orProp.getProperty(locatorKey))));
			}else if (locatorKey.endsWith("_partiallinktext")) {
				Wait.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText(orProp.getProperty(locatorKey))));
			}*/
			return true;
		} 
		catch (Exception e) 
		{
			return false;
		}
		
		
	}

	
	public static WebElement getLocator(String locatorKey) 
	{
		WebElement element = null;
		
		if(!isElementPresent(locatorKey))
			System.out.println("Element is not present :  "+ locatorKey);
		
		element = driver.findElement(locator(locatorKey));
		
		/*if(locatorKey.endsWith("_id")) {
			element = driver.findElement(By.id(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_name")) {
			element = driver.findElement(By.name(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_classname")) {
			element = driver.findElement(By.className(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_xpath")) {
			element = driver.findElement(By.xpath(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_css")) {
			element = driver.findElement(By.cssSelector(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_linktext")) {
			element = driver.findElement(By.linkText(orProp.getProperty(locatorKey)));
		}else if (locatorKey.endsWith("_partiallinktext")) {
			element = driver.findElement(By.partialLinkText(orProp.getProperty(locatorKey)));
		}*/
		return element;
	}

	public static By locator(String locatorKey)
	{
		By by = null;
		
		if(locatorKey.endsWith("_id")) {
			by = By.id(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_name")) {
			by = By.name(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_classname")) {
			by = By.className(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_xpath")) {
			by = By.xpath(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_css")) {
			by = By.cssSelector(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_linktext")) {
			by = By.linkText(orProp.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_partiallinktext")) {
			by = By.partialLinkText(orProp.getProperty(locatorKey));
		}
		
		return by;
		
	}
	
	
}
