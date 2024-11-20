package seleniumBrowser;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		BaseTest obj = new BaseTest();
		obj.init("chromebrowser");
		
		launch("firefoxbrowser");
		
		navigateUrl("amazonurl");
	}

}
