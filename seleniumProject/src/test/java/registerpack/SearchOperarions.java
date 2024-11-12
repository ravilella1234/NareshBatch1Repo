package registerpack;

import org.testng.annotations.Test;

public class SearchOperarions 
{
	
  @Test(groups = {"smoke","Regression","Search","All"})
  public void searchforaValidProduct() 
  {
	  System.out.println("SearchOperarions - searchforaValidProduct : "+ Thread.currentThread().getId());
  }
  
  @Test(groups = {"sanity","Search","All"})
  public void searchwithNoProduct() 
  {
	  System.out.println("SearchOperarions - searchwithNoProduct : "+ Thread.currentThread().getId());
  }
}
