package miscellaneousProgrames;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoImage 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vmware.com/in.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.querySelector(\"a[class='navbar-brand active'] img[alt='vmware-logo-grey.svg']\")");
		
		WebElement logoImageElement = driver.findElement(By.xpath("//a[@class='navbar-brand active']//img[@alt='vmware-logo-grey.svg']"));
		
		Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoImageElement);
		ImageIO.write(logoImageScreenshot.getImage(), "png", new File("C:\\Users\\DELL\\Desktop\\logos\\vmwarelogo.png"));
		
		File f = new File("C:\\Users\\DELL\\Desktop\\logos\\vmwarelogo.png");
		
		if(f.exists())
			System.out.println("image File Captured");
		else
			System.out.println("image File not Captured");
	}

}
