package seleniumBrowser;

import com.aventstack.extentreports.Status;

public class TC_005 extends BaseTest
{
	
	public static void main(String[] args) throws Exception 
	{
		BaseTest obj = new BaseTest();
		obj.init("chromebrowser");
		test = report.createTest("TC_005");
		test.log(Status.INFO, "init the properties files");
		
		test.log(Status.INFO, "Launced the browser :  " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		//test.log(Status.PASS, "Navigated to url : "+ childProp.getProperty("amazonurl"));
		
		selectDropDown("amazondropbox_id","Books");
		test.log(Status.FAIL, "Selected the option from dropbox By uSing the locator : " + "amazondropbox_id");
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		test.log(Status.PASS, "Entered the text by using locator : " + "amazonsearchtextbox_name");
		
		clickElement("amazonsearchbutton_xpath");
		test.log(Status.PASS, "Clicked on ELement Byusing locator : "+ "amazonsearchbutton_xpath");
		
		report.flush();
	}
}
