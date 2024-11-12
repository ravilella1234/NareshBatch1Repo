package testNGpack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestMethodDepencency 
{
	
  @Test(priority = 1)
  public void orange() 
  {
	  System.out.println("orange");
  }
  
  @Test(priority = 2,dependsOnMethods = {"orange"})
  public void white() 
  {
	  System.out.println("white");
  }
  
  @Test(priority = 3,dependsOnMethods = {"white"})
  public void blue() 
  {
	  System.out.println("blue");
	  //Assert.fail("blue test is failed...");
	  throw new SkipException("blue test is Skipped...");
  }
  
  @Test(priority = 4,dependsOnMethods = {"blue"},alwaysRun = true)
  public void green() 
  {
	  System.out.println("green");
  }
}
