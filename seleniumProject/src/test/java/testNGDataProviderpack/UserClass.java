package testNGDataProviderpack;

import org.testng.annotations.Test;

public class UserClass 
{
	
	@Test(dataProvider = "testData", dataProviderClass = DataProvidersTest.class)
	  public void f(Object[] a) 
	  {
		  System.out.println(a[0]);
	  }
}
