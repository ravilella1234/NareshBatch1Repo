package seleniumBrowser;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example4 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		int rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		System.out.println("rows : " +  rows);
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i=1;i<=rows;i++)
		{
			
			String loc = "//table[@class='dataTable']/tbody/tr["+i+"]/td[4]";
			String cPrice = driver.findElement(By.xpath(loc)).getText();
			NumberFormat nf = NumberFormat.getIntegerInstance();
			Number n = nf.parse(cPrice);
			String price = n.toString();
			Double dPrice = Double.parseDouble(price);
			int iPrice = dPrice.intValue();
			a.add(iPrice);
			
			//a.add(dPrice);
			//System.out.println("loc :"+ loc);
			System.out.println(iPrice);
			//System.out.println(a);
		}
		
		Collections.sort(a);
		System.out.println(a);
		System.out.println("Min Value : " + a.get(0));
		System.out.println("Max Value : " + a.get(a.size()-1));
		
	}

}
