package testcases;

import io.cucumber.java.en.*;

public class Login 
{
	
	@Given("The user navigates to the login page")
	public void the_user_navigates_to_the_login_page() {
	    System.out.println("---> user has navigated to login page...");
	}

	@And("Enter valid password {string}")
	public void enter_valid_password_ravi123456(String userpassword) {
		System.out.println("---> user has entered valid password : " + userpassword);
	}

	@And("Clicks the login button")
	public void clicks_the_login_button() {
		System.out.println("---> user has clicked the login button");
	}

	@Then("The user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
		System.out.println("---> Logedin user has redirected to the dashboard");
	}

	@When("The user enters invalid email  {string}")
	public void the_user_enters_invalid_email_ravilella_gmail_com(String userName) {
		System.out.println("---> user has entered invalid email credentials : " + userName);
	}

	@And("Enter invalid password {string}")
	public void enter_invalid_password_ravi123456(String userpassword) {
		System.out.println("---> user has entered invalid password : " + userpassword);
	}

	@Then("An error message Invalid username or password should be displayed")
	public void an_error_message_invalid_username_or_password_should_be_displayed() {
		System.out.println("---> error message for Invalid username or password is displaying");
	}

	@Then("user should get proper warning message")
	public void user_should_get_proper_warning_message() {
		System.out.println("---> user is getting proper warning message");
	}

	@When("The user enters valid email  {string}")
	public void the_user_enters_valid_email_ravilella_gmail_com(String userName) {
		System.out.println("---> user has entered valid email  : " + userName);
	}

}
