package miscellaneousProgrames;

import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BarCodeReader 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://barcode.tec-it.com/en");
		driver.manage().window().maximize();
		String barcodeurl = driver.findElement(By.xpath("//*[@id=\"infoTarget\"]/div[1]/img")).getAttribute("src");
		System.out.println(barcodeurl);
		
		URL url = new URL(barcodeurl);
		BufferedImage bufferedImage = ImageIO.read(url);
		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedImage);
		BinaryBitmap  binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));
		Result valueResult = new MultiFormatReader().decode(binaryBitmap);
		System.out.println(valueResult.getText());	  
	}

}
