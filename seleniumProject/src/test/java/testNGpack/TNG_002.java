package testNGpack;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import seleniumBrowser.BaseTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_002 extends BaseTest
{

  @BeforeMethod
  @Parameters("browser")
  public void startProcess(String bType) throws Exception 
  {
	  System.out.println("startProcess");
	  //init("chromebrowser");
	  init(bType);
	  navigateUrl("amazonurl"); 
  }
  
  @Test
  public void amazonTest() 
  {
	  System.out.println("amazonTest");
	  selectDropDown("amazondropbox_id","Books");
	  test.log(Status.PASS, "Selected the option from dropbox By uSing the locator : " + "amazondropbox_id");
		
	  typeText("amazonsearchtextbox_name","Harry Potter");
	  test.log(Status.PASS, "Entered the text by using locator : " + "amazonsearchtextbox_name");
		
	  clickElement("amazonsearchbutton_xpath");
	  test.log(Status.PASS, "Clicked on ELement Byusing locator : "+ "amazonsearchbutton_xpath");
  }
  
  @Test
  public void amazonTest1()
  {
	  System.out.println("amazonTest1");
  }
  
  @Test
  public void amazonTest2()
  {
	  System.out.println("amazonTest2");
  }

  @AfterMethod
  public void endProcess() 
  {
	  System.out.println("endProcess");
	  report.flush();
	  driver.quit();
  }

}
