package miscellaneousProgrames;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCasewithEncriptedPassword 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login");
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		Properties p = new Properties();
		p.load(fis);
		
		System.out.println(p.getProperty("user"));
		String userdecryptvalue = decodeString(p.getProperty("user"));
		System.out.println(userdecryptvalue);
		driver.findElement(By.id("Email")).sendKeys(userdecryptvalue);
		
		
		System.out.println(p.getProperty("password"));
		String passworddecryptvalue = decodeString(p.getProperty("password"));
		System.out.println(passworddecryptvalue);
		driver.findElement(By.id("Password")).sendKeys(passworddecryptvalue);
		
	}
	
	
	public static String decodeString(String encodedInput) 
	{
        try 
        {
            // Decode the Base64-encoded string into a byte array
            byte[] decodedBytes = Base64.getDecoder().decode(encodedInput);

            // Convert the byte array to a string using UTF-8
            return new String(decodedBytes, StandardCharsets.UTF_8);
        } 
        catch (IllegalArgumentException e) 
        {
            // Handle invalid Base64 input
            System.err.println("Invalid Base64 input: " + e.getMessage());
            return null;
        }
    }
	
	
	
	public static String encodeString(String input) 
	{
        try 
        {
            // Convert the input string to a byte array using UTF-8 encoding
            byte[] inputBytes = input.getBytes(StandardCharsets.UTF_8);

            // Encode the byte array to a Base64 string
            return Base64.getEncoder().encodeToString(inputBytes);
        } 
        catch (Exception e) 
        {
            // Handle unexpected errors
            System.err.println("Error during encoding: " + e.getMessage());
            return null;
        }
	}
}
