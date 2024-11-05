package icici.loan.carloan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DOMElementTypes 
{
	public static WebDriver driver;
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.get("https://www.amazon.in/");

        // 1. Document and Root Element
        WebElement htmlElement = driver.findElement(By.tagName("html"));
        
        // 2. Metadata Elements
        WebElement titleElement = driver.findElement(By.tagName("title"));
        WebElement metaElement = driver.findElement(By.xpath("//meta[@charset='utf-8']"));
        
        // 3. Sectioning Elements
        WebElement headerElement = driver.findElement(By.tagName("header"));
        WebElement sectionElement = driver.findElement(By.tagName("section"));
        WebElement articleElement = driver.findElement(By.tagName("article"));
        WebElement footerElement = driver.findElement(By.tagName("footer"));
        
        // 4. Content Elements
        WebElement headingElement = driver.findElement(By.tagName("h1"));
        WebElement paragraphElement = driver.findElement(By.tagName("p"));
        
        // 5. Form Elements
        WebElement formElement = driver.findElement(By.tagName("form"));
        WebElement inputElement = driver.findElement(By.name("name"));
        WebElement buttonElement = driver.findElement(By.tagName("button"));
        
        // 6. Interactive Elements
        WebElement linkElement = driver.findElement(By.linkText("Learn more"));
        WebElement detailsElement = driver.findElement(By.tagName("details"));
        WebElement summaryElement = driver.findElement(By.tagName("summary"));
        
        // 7. Inline Text Elements
        WebElement boldText = driver.findElement(By.tagName("strong"));
        WebElement italicText = driver.findElement(By.tagName("em"));
        
        // 8. Media Elements
        WebElement imageElement = driver.findElement(By.tagName("img"));
        WebElement videoElement = driver.findElement(By.tagName("video"));
        
        // 9. Table Elements
        WebElement tableElement = driver.findElement(By.tagName("table"));
        WebElement tableRow = driver.findElement(By.tagName("tr"));
        WebElement tableData = driver.findElement(By.tagName("td"));
        
        // 10. Script Elements
        WebElement scriptElement = driver.findElement(By.tagName("script"));
        
        // 11. Shadow DOM Elements
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement shadowHost = driver.findElement(By.cssSelector("shadow-host-selector"));
        WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
        WebElement shadowButton = shadowRoot.findElement(By.cssSelector("button"));

        // Examples of interacting with elements
        paragraphElement.getText();                     // Get text from a paragraph
        inputElement.sendKeys("John Doe");              // Input text into a form
        buttonElement.click();                          // Click on a button
        linkElement.click();                            // Click on a link
        imageElement.getAttribute("src");               // Get image source
        videoElement.click();                           // Click to play/pause video
        shadowButton.click();                           // Interact with shadow DOM button

        driver.quit();
	}
}
