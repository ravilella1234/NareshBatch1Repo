package miscellaneousProgrames;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PasswordDecrypy 
{
	private static final String SECRET_KEY = "ravikanthlella";

	public static void main(String[] args) 
	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demo.nopcommerce.com/login");
		
		String encryptpwd = encrypt(SECRET_KEY);
		System.out.println(encryptpwd);
	}
	
	

	public static String encrypt(String strToEncrypt) 
	{
		try 
		{
			SecretKeySpec secretkey= new SecretKeySpec(SECRET_KEY.getBytes(), "AES"); 
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding"); 
			cipher.init(Cipher.ENCRYPT_MODE, secretkey); 
			return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes()));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}

		public static String decrypt(String strToDecrypt) 
		{ 
			try 
			{
				SecretKeySpec secretkey= new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
				Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");  // CBC ECB
				cipher.init(Cipher.DECRYPT_MODE, secretkey);
		
				return new String(cipher.doFinal (Base64.getDecoder().decode(strToDecrypt)));
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
				return null;
			}
		}
}
