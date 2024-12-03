package testcases;

import io.cucumber.java.en.*;

public class Login 
{
	
	@Given("The user navigates to the login page")
	public void the_user_navigates_to_the_login_page() {
	    System.out.println("--> user has navigated to the login page");
	}

	@When("The user enters valid email {string}")
	public void the_user_enters_valid_email(String userName) {
	    System.out.println("---> user has entered valid email :" + userName);
	}

	@And("Enter valid password {string}")
	public void enter_valid_password(String userPassword) {
	    System.out.println("---> User has Entered valid password :" + userPassword);
	}

	@And("Clicks the login button")
	public void clicks_the_login_button() {
	   System.out.println("---> User has Clicked the login button");
	}

	@Then("The user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
	   System.out.println("---> User has redirected to the dashboard");
	}

	@When("The user enters invalid email {string}")
	public void the_user_enters_invalid_email(String userName) {
	    System.out.println("---> user has entered invalid email : " + userName);
	}

	@And("Enter invalid password {string}")
	public void enter_invalid_password(String userPassword) {
		System.out.println("---> user has entered invalid password : " + userPassword);
	}

	@Then("An error message Invalid username or password should be displayed")
	public void an_error_message_invalid_username_or_password_should_be_displayed() {
	   System.out.println("---> error message has displayed for Invalid username or password ");
	}

	@Then("user should get proper warning message")
	public void user_should_get_proper_warning_message() {
	    System.out.println("---> user has got proper warning message");
//	    int x = 7/0;
//	    System.out.println(x);
	}
		
	
}
