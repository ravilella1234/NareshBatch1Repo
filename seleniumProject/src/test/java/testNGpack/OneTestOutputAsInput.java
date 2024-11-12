package testNGpack;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class OneTestOutputAsInput 
{
	
  @Test(priority = 1)
  public void a(ITestContext x) 
  {
	  String bookingID = "RRR1234";
	  System.out.println("In A Test : " + bookingID);
	  x.setAttribute("bID", bookingID); 
  }
  
  @Test(priority = 2)
  public void b(ITestContext x) 
  {
	  System.out.println("In B Test : " + x.getAttribute("bID"));
  }
}
