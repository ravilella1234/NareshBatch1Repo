package seleniumBrowser;

import java.util.Set;

import org.apache.hc.core5.http.io.HttpServerRequestHandler;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BroName extends BaseTest
{
	
	public static void main(String[] args) throws Exception 
	{
			init("chromebrowser");
			
			
		
		   Set<String> cap = ((RemoteWebDriver)driver).getCapabilities().getCapabilityNames();
		   
		   for(String c:cap)
		   {
			   System.out.println(((RemoteWebDriver)driver).getCapabilities().getCapability(c));
		   }
			
		   
		   Capabilities cap1 = ((RemoteWebDriver)driver).getCapabilities();
		   System.out.println(cap1.getBrowserName());
		   System.out.println(cap1.getBrowserVersion());
		   
		   
	}

}
