package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils 
{
	private WebDriver driver;
    private WebDriverWait wait;
	
	public WaitUtils(WebDriver driver,int timeoutInSeconds) {
		
		this.driver = driver;
		wait =  new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	}
    
	// Method to wait for page title to be exact
    public void waitForTitleToBe(String expectedTitle) {
        wait.until(ExpectedConditions.titleIs(expectedTitle));
    }

    
    // Method to wait for page title to contain a specific keyword
    public void waitForTitleToContain(String keyword) {
        wait.until(ExpectedConditions.titleContains(keyword));
    }
    
    
    // Method to wait for a specific element to be visible
    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    
    
    // Method to wait for a specific element to be clickable
    public WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
    
    
    // Method to wait for the page to load completely
    public void waitForPageToLoad() {
        wait.until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
    }
   
    
    // Method to wait for the URL to change to the expected one
    public void waitForUrlToBe(String expectedUrl) {
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
    }
    
}
