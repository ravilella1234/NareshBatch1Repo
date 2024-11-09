package registerpack;

import org.testng.annotations.Test;

public class SearchOperarions 
{
	
  @Test
  public void searchforaValidProduct() 
  {
	  System.out.println("SearchOperarions - searchforaValidProduct : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void searchwithNoProduct() 
  {
	  System.out.println("SearchOperarions - searchwithNoProduct : "+ Thread.currentThread().getId());
  }
}
