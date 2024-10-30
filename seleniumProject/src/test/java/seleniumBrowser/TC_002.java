package seleniumBrowser;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init("chromebrowser");
		
		launch("firefoxbrowser");
		
		navigateUrl("amazonurl");
	}

}
