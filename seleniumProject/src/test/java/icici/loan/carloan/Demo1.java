package icici.loan.carloan;

import java.io.File;
import java.util.Arrays;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebDriverBuilder;

import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import seleniumBrowser.Functionalities;

public class Demo1 
{
	public static WebDriver driver;
	
	public String[] getProjectName(String projectpath)
	{
		File f = new File(projectpath);
		String name1 = f.getName();
		String name2 = f.getParent();
		return new String[]{name1,name2};
	}
	
	public String getCurrentClassName()
	{
		return this.getClass().getSimpleName();
	}
	
	public String getCurrentPackageName()
	{
		return this.getClass().getPackageName();
	}
	
	public String getSplittedPackageName()
	{
		String packName = this.getClass().getPackageName();
		String[] sString = packName.split("\\.");
		if(sString.length>2)
			return sString[2];
		else
			return "The 2nd index does not exist in the string";
				
	}
	
	public static void main(String[] args) 
	{
		
		Demo1 obj = new Demo1();
		System.out.println(System.getProperty("user.dir"));
		
		String[] val = obj.getProjectName(System.getProperty("user.dir"));
		System.out.println(Arrays.toString(val));
		
		System.out.println(obj.getCurrentClassName());
		
		System.out.println(obj.getCurrentPackageName());
		
		System.out.println(obj.getSplittedPackageName());
		
		
		
	}
	

}
