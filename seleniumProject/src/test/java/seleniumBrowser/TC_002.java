package seleniumBrowser;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("firefoxbrowser");
		
		navigateUrl("amazonurl");
	}

}
