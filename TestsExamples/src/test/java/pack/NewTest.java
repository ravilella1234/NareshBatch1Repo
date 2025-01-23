package pack;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class NewTest 
{
	
  @Test
  public void f() 
  {
	  Response response = RestAssured.get("https://reqres.in/api/unknown/23");
	  System.out.println(response.getStatusCode());
	  System.out.println(response.getTime());
	  System.out.println(response.getBody().asString());
	  System.out.println(response.getStatusLine());
	  System.out.println(response.getHeader("content-type"));

	  int statusCode = response.getStatusCode();
	  Assert.assertEquals(statusCode, 404);

  }
  
}
