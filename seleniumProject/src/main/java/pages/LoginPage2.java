package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	WebDriver driver;

    // Locators
	@FindBy(id="email")private WebElement usernameField;
	@FindBy(id="pass")private WebElement passwordField;
    //private By loginButton = By.id("loginBtn");

    // Constructor
    public LoginPage2(WebDriver driver) {
        this.driver = driver;
       PageFactory.initElements(driver, this);
    }

    // Methods
    public void enterUsername(String username) {
    	usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
    	passwordField.sendKeys(password);
    }

   /* public void clickLogin() {
        driver.findElement(loginButton).click();
    }*/

}
