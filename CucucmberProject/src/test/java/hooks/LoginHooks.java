package hooks;

import java.util.Properties;

import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import browsersfactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class LoginHooks 
{
	private DriverFactory driverFactory;
	private ConfigReader configReader;
	Properties prop;
    
	
	@Before(value="@skip",order=0)
	public void skipScenario(Scenario scenario)
	{
		System.out.println("skipped Scenario is : "+ scenario.getName());
		Assume.assumeTrue(false);
	}
	
	@Before(order=1)
    public void getproperty() 
    {
		configReader = new ConfigReader();
		prop = configReader.init_prop();
    }

	@Before(order=2)
    public void launchBrowser() 
    {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		driverFactory.init_driver(browserName);
    }
	
	@After(order=0)
	public void quitBrowser()
	{
		DriverFactory.getDriver().quit();
	}
	
	@After(order=1)
	public void teraDown(Scenario scenario)
	{
		String screenshotName = null;
		if(scenario.isFailed())
			//take screenshot
			
			screenshotName = scenario.getName().replace(" ", "_");
		byte[] sourcePath = ((TakesScreenshot)DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screenshotName);
	}
	
}
