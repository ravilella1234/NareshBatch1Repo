package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	private  WebDriver driver;	
	
    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("submit");
    private By logOutButton = By.xpath("//a[normalize-space()='Log out']");
    private By loginSuccessFiled = By.xpath("//strong[contains(text(),'Congratulations student. You successfully logged i')]");
    private By loginErorFiled = By.xpath("//div[@id='error']");
   
    
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}
    
	public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSubmit() {
        driver.findElement(loginButton).click();
    }

    public boolean logOutButton() {
    	return driver.findElement(logOutButton).isDisplayed();
    }
    
    public String loginSuccessFiled()
    {
    	return driver.findElement(loginSuccessFiled).getText();
    }
    
    public Boolean loginErorFiled()
    {
    	return driver.findElement(loginErorFiled).isDisplayed();
    }
    
    public String loginErorTextFiled()
    {
    	return driver.findElement(loginErorFiled).getText();
    }

    public String getCurrentUrl()
    {
    	return driver.getCurrentUrl();
    }
}
