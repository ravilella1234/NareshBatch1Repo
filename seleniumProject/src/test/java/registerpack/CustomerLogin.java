package registerpack;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testNGlistener.MyListener;


public class CustomerLogin 
{
	
  @Test(groups = {"smoke","Regression","Login","All"})
  public void loginwithValidCredientials() 
  {
	  System.out.println("CustomerLogin - loginwithValidCredientials : "+ Thread.currentThread().getId());
  }
  
  @Test(groups = {"smoke","Login","All"})
  public void loginwithInvalidValidUser() 
  {
	  System.out.println("CustomerLogin - loginwithInvalidValidUser : "+ Thread.currentThread().getId());
  }
  
  @Test(groups = {"Login","Regression","All"})
  public void loginwithInvalidPassword() 
  {
	  System.out.println("CustomerLogin - loginwithInvalidPassword : "+ Thread.currentThread().getId());
  }
  
  @Test(groups = {"sanity","Login","All"})
  public void loginwithBlankCredientials() 
  {
	  System.out.println("CustomerLogin - loginwithBlankCredientials : "+ Thread.currentThread().getId());
  }
  
  
}
