package miscellaneousProgrames;

import java.util.Base64;
import java.util.Base64.Decoder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasewithEncriptedPassword 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("ravilella.1981@gmail.com");
		
		String val = decodString("dGVzdDEyMzQ=");
		System.out.println(val);
		driver.findElement(By.id("Password")).sendKeys(val);

	}
	
	public static String decodString(String password)
	{
		//byte[] decodeString = Base64.decodeBase64(password);
		byte[] encodedBytes = Base64.
		//Decoder c = Base64.getDecoder();
		return encodedBytes;	
		
	}

}
