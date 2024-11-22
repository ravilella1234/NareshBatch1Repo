package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.LoginPage2;
import utilities.BaseTest;

public class LoginTest extends BaseTest
{

  @BeforeMethod
  public void beforeMethod() throws Exception 
  {
	  init("chromebrowser");
	  navigateUrl("facebookurl");
  }
  
  @Test
  public void f() 
  {
	  LoginPage loginPage = new LoginPage(driver);
	 // LoginPage2 loginPage = new LoginPage2(driver);
	  loginPage.enterUsername("ravilella");
	  loginPage.enterPassword("pass");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
  }

}
