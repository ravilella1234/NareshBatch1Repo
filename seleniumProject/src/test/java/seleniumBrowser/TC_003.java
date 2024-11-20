package seleniumBrowser;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_003.class.getName());

	public static void main(String[] args) throws Exception 
	{
		BaseTest obj = new BaseTest();
		obj.init("chromebrowser");
		
		log.info("Launced the browser :  " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url : "+ childProp.getProperty("amazonurl"));
		
		selectDropDown("amazondropbox_id","Books");
		log.info("Selected the option from dropbox By uSing the locator : " + "amazondropbox_id");
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		log.info("Entered the text by using locator : " + "amazonsearchtextbox_name");
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on ELement Byusing locator : "+ "amazonsearchbutton_xpath");
		
		
		
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		/*WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		drop.sendKeys("Books");
		
		driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();*/
		
	}

	
}
