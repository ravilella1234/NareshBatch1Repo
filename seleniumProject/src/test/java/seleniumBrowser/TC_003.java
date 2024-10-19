package seleniumBrowser;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectDropDown("amazondropbox_id","Books");
		
		typeText("amazonsearchtextbox_id","Harry Potter");
		
		clickElement("amazonsearchbutton_xpath");
		
		
		
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		/*WebElement drop = driver.findElement(By.id("searchDropdownBox"));
		drop.sendKeys("Books");
		
		driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();*/
		
	}

	
}
