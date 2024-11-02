package optionDemo;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxOptionDemo 
{

	public static void main(String[] args) 
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions option = new FirefoxOptions();
		//option.addArguments("--private");
		//option.addArguments("--headless");
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		
		ProfilesIni p = new ProfilesIni();
		FirefoxProfile pf = p.getProfile("firefoxpf");
		
		pf.setPreference("dom.webnotifications.enabled", false);
		
		pf.setAcceptUntrustedCertificates(true);
		pf.setAssumeUntrustedCertificateIssuer(false);
		
		pf.setPreference("network.proxy.type", 1);
		pf.setPreference("network.proxy.scoks", "192.168.10.1");
		pf.setPreference("network.proxy.scoks_port", 1744);
		
		
		option.setProfile(pf);
		
		WebDriver driver = new FirefoxDriver(option);
		//driver.get("https://www.axisbank.com/");
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
