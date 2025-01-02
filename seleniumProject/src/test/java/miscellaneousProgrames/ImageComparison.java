package miscellaneousProgrames;

import java.awt.image.BufferedImage;
import java.io.File;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		driver.get("https://www.vmware.com/in.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		BufferedImage expectedImage = ImageIO.read(new File("C:\\Users\\DELL\\Desktop\\logos\\vmwarelogo.png"));
		
		WebElement logoElement = driver.findElement(By.xpath("//*[@id=\"header-explore\"]/div[3]/div/div/nav/div[1]/div/div[1]/a[1]/img"));
		
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
