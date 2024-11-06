package actionsAndJavascriptExecutors;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo 
{
	public static WebDriver driver;
	public static Actions a;
	
	public static void mouseOverElement(String locator)
	{
		driver.get("https://snapdeal.com/");
		a = new Actions(driver);
		WebElement e = driver.findElement(By.xpath(locator));
		a.moveToElement(e).perform();
		driver.findElement(By.linkText("Your Orders")).click();
	}
	
	public static void dragAndDropElement(String sourcelocator, String targetlocator,String framelocator)
	{
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className(framelocator)));
		a = new Actions(driver);
		WebElement drag = driver.findElement(By.id(sourcelocator));
		WebElement drop = driver.findElement(By.id(targetlocator));
		
		//a.dragAndDrop(drag, drop).perform();
		a.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
	}
	
	public static void slideBarElement(String sourcelocator,String framelocator)
	{
		driver.get("https://jqueryui.com/slider/");
		a = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.className(framelocator)));
		WebElement e = driver.findElement(By.id(sourcelocator));
		//a.dragAndDropBy(e, 100, 0).perform();
		a.clickAndHold(e).moveByOffset(100, 0).release(e).build().perform();
	}
	
	public static void  rightClick(String sourcelocator)
	{
		driver.get("https://jqueryui.com/slider/");
		a = new Actions(driver);
		WebElement e = driver.findElement(By.linkText(sourcelocator));
		a.contextClick(e).perform();
	}
	
	public static void keyEnter(String sourcelocator)
	{
		driver.get("https://www.amazon.in/");
		a = new Actions(driver);
		WebElement e = driver.findElement(By.id(sourcelocator));
		e.sendKeys("baby toys");
		//a.click(e).perform();
		a.sendKeys(e, Keys.ENTER).perform();
	}
	
	public static void keyTab(String sourcelocator)
	{
		driver.get("https://www.facebook.com/");
		a = new Actions(driver);
		WebElement e = driver.findElement(By.id(sourcelocator));
		e.sendKeys("ravilella");
		a.sendKeys(Keys.TAB).perform();
	}
	
	public static void selectAll(String emaillocator,String passwordlocator)
	{
		driver.get("https://www.facebook.com/");
		WebElement loc1 = driver.findElement(By.id(emaillocator));
		WebElement loc2 = driver.findElement(By.id(passwordlocator));
		
		loc1.sendKeys("ravilella");
		loc1.sendKeys(Keys.CONTROL + "a");
		loc1.sendKeys(Keys.CONTROL + "c");
		loc2.sendKeys(Keys.CONTROL + "v");
	}

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//mouseOverElement("//span[text()='Sign In']");
		//dragAndDropElement("draggable", "droppable","demo-frame");
		//slideBarElement("slider", "demo-frame");
		//rightClick("Droppable");
		//keyEnter("twotabsearchtextbox");
		//keyTab("email");
		selectAll("email", "pass");
	}

}
