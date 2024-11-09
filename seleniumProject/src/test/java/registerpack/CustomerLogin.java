package registerpack;

import org.testng.annotations.Test;

public class CustomerLogin 
{
	
  @Test
  public void loginwithValidCredientials() 
  {
	  System.out.println("CustomerLogin - loginwithValidCredientials : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void loginwithInvalidValidUser() 
  {
	  System.out.println("CustomerLogin - loginwithInvalidValidUser : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void loginwithInvalidPassword() 
  {
	  System.out.println("CustomerLogin - loginwithInvalidPassword : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void loginwithBlankCredientials() 
  {
	  System.out.println("CustomerLogin - loginwithBlankCredientials : "+ Thread.currentThread().getId());
  }
  
  
}
