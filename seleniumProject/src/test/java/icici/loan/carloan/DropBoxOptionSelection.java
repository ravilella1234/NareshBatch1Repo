package icici.loan.carloan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropBoxOptionSelection 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement loc = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select obj = new Select(loc);
		//obj.selectByIndex(1);
		//obj.selectByVisibleText("Alexa Skills");
		obj.selectByValue("search-alias=alexa-skills");
		
		Thread.sleep(2000);
		
		//obj.deselectByValue("search-alias=alexa-skills");
		WebElement ele = obj.getFirstSelectedOption();
		System.out.println(ele.getText());
		
		List<WebElement> options = obj.getOptions();
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
	}

}
