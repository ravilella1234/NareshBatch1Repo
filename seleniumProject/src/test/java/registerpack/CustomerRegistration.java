package registerpack;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;
import testNGlistener.MyListener;
import testNGlistener.RetryAnalyzer;


//@Listeners(MyListener.class)
public class CustomerRegistration 
{
	
  @Test(priority = 1,  groups = {"smoke","Regression","Register","All"})
  public void registerwithMandatfields() 
  {
	  System.out.println("CustomerRegistration - registerwithMandatfields : " + Thread.currentThread().getId());
  }
  
  @Test(priority = 2, groups = {"smoke","Regresion","Register","All"}) //retryAnalyzer = RetryAnalyzer.class
  public void registerwithallfields() 
  {
	  System.out.println("CustomerRegistration - registerwithallfields : "+ Thread.currentThread().getId());
	  Assert.fail("registerwithallfields has failed");
  }
  
  @Test(priority = 3 ,groups = {"sanity","Register","All"},timeOut = 1000)
  public void registerwithDuplicateEmail() throws Exception 
  {
	  Thread.sleep(2000);
	  System.out.println("CustomerRegistration - registerwithDuplicateEmail : "+ Thread.currentThread().getId());
  }
  
  @Test(priority = 4 , groups = {"Regression","Register","All"},dependsOnMethods = {"registerwithallfields"})
  public void registerwithValidEmail() 
  {
	  System.out.println("CustomerRegistration - registerwithValidEmail : "+ Thread.currentThread().getId());
  }
  
  @AfterMethod
  public void endProcess(ITestResult result)
  {
	 // if(result.getStatus() == result.FAILURE)
		  //call the takesScreenshot function
  }
  
}
