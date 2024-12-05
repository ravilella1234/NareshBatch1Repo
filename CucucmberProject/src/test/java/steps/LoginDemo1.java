package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pages.LoginPage;
import io.cucumber.java.en.*;

public class LoginDemo1 
{
	protected WebDriver driver;
	protected LoginPage loginPage;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() 
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginPage = new LoginPage(driver);
	}

	@When("the user enters {string} into the username field")
	public void the_user_enters_into_the_username_field(String userName) 
	{
		loginPage.enterUsername(userName);
	}

	@When("the user enters {string} into the password field")
	public void the_user_enters_into_the_password_field(String userPassword) 
	{
		loginPage.enterPassword(userPassword);
	}

	@When("the user clicks the Submit button")
	public void the_user_clicks_the_submit_button() 
	{
		loginPage.clickSubmit();
	}

	@Then("the new page URL should contain {string}")
	public void the_new_page_url_should_contain(String expectedTitle) 
	{
		Assert.assertEquals(driver.getCurrentUrl(), expectedTitle);
	}

	@Then("the new page should display text containing {string}")
	public void the_new_page_should_display_text_containing(String expectedText) 
	{
		Assert.assertEquals(loginPage.loginSuccessFiled(), expectedText);
	}

	@Then("the Log out button should be visible on the new page")
	public void the_Log_out_button_should_be_visible_on_the_new_page() 
	{
		Assert.assertEquals(loginPage.logOutButton(), true);
	}

	@Then("an error message should be displayed")
	public void an_error_message_should_be_displayed() 
	{
	   Assert.assertEquals(loginPage.loginErorFiled(), true);
	}

	@Then("the error message text should be {string}")
	public void the_error_message_text_should_be(String expectedErrText) 
	{
		Assert.assertEquals(loginPage.loginErorTextFiled(), expectedErrText);
	}
}
