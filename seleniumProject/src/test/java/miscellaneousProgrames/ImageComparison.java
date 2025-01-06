package miscellaneousProgrames;

import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class ImageComparison 
{
	
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Thread.sleep(5000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement logoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='rb_logo']")));

		
		BufferedImage expectedImage = ImageIO.read(new File("C:\\Users\\DELL\\Desktop\\logos\\rdc-redbus-logo.png"));
		
		//WebElement logoElement = driver.findElement(By.xpath("//img[@class='rb_logo']"));
		
		Screenshot logoImageScreenshot = new AShot().takeScreenshot(driver, logoElement);
		BufferedImage actualImage = logoImageScreenshot.getImage();
		
		ImageDiffer imgDiff = new ImageDiffer();
		ImageDiff diff = imgDiff.makeDiff(expectedImage, actualImage);
		if(diff.hasDiff()==true)
			System.out.println("Images are not same.");
		else
			System.out.println("Images are same.");
	}

}
