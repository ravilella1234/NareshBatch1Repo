package registerpack;

import org.testng.annotations.Test;

public class CustomerRegistration 
{
	
  @Test
  public void registerwithMandatfields() 
  {
	  System.out.println("CustomerRegistration - registerwithMandatfields : " + Thread.currentThread().getId());
  }
  
  @Test
  public void registerwithallfields() 
  {
	  System.out.println("CustomerRegistration - registerwithallfields : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void registerwithDuplicateEmail() 
  {
	  System.out.println("CustomerRegistration - registerwithDuplicateEmail : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void registerwithValidEmail() 
  {
	  System.out.println("CustomerRegistration - registerwithValidEmail : "+ Thread.currentThread().getId());
  }
  
  
}
