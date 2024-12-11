package assertionpack;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionTest 
{
	
  @Test
  public void f() 
  {
	  String a = "ravikanth";
	  String b = "ravikanth";
	  
	  //Assert.assertEquals(a,b);
	  
	  /*Assert.assertTrue(a.equals(b), "both are not equal");
	  
	  Assert.assertEquals(false, false);
	  Assert.assertNotEquals(a, b, a);
	  
	  Assert.assertTrue(false, a);
	  Assert.fail(a, null);
	  
	  Assert.assertNull(b);
	  Assert.assertNotNull(b);*/
	  
	  
	  
	  //assertEquals(a, b);
	  //assertNotEquals(a, b,"both are not equal");
	  
	 // assertTrue(a.equals(b));
	  //assertTrue(a.equals(b),"both are not equal");
	  
	  
	 // String c = "ravi";
	  //assertNull(c);
	  //assertNull(c, "The string C i Not-NULL");
	  
	  
	 // String d = null;
	  //assertNotNull(d);
	 // assertNotNull(d, "The string D is NULL");
	  
	 // fail(a, null);
	  
  }
  
}
