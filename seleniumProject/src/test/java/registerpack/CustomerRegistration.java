package registerpack;

import org.testng.annotations.Test;

public class CustomerRegistration 
{
	
  @Test(groups = {"smoke","Regression","Register","All"})
  public void registerwithMandatfields() 
  {
	  System.out.println("CustomerRegistration - registerwithMandatfields : " + Thread.currentThread().getId());
  }
  
  @Test(groups = {"smoke","Regresion","Register","All"})
  public void registerwithallfields() 
  {
	  System.out.println("CustomerRegistration - registerwithallfields : "+ Thread.currentThread().getId());
  }
  
  @Test(groups = {"sanity","Register","All"})
  public void registerwithDuplicateEmail() 
  {
	  System.out.println("CustomerRegistration - registerwithDuplicateEmail : "+ Thread.currentThread().getId());
  }
  
  @Test(groups = {"Regression","Register","All"})
  public void registerwithValidEmail() 
  {
	  System.out.println("CustomerRegistration - registerwithValidEmail : "+ Thread.currentThread().getId());
  }
  
  
}
