package testNGDataProviderpack;

import org.testng.annotations.DataProvider;

public class DataProvidersTest 
{
	
 
  @DataProvider(name = "ravi")
  public Object[][] dp() 
  {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
      new Object[] { 3, "c" }
    };
  }
  
  @DataProvider(name = "testData")
  public Object[][] createData() 
  {
      return new Object[][] {
          {25, "Alice",false},
          {30, "Bob",false},
          {35, "Charlie", false}
      };
  }

  
  
}
