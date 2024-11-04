package icici.loan.carloan;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkChecker 
{
	public static WebDriver driver;
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

        try 
        {
            // Open the target page
            driver.get("https://www.google.com/"); 

            // Find all links on the page
            List<WebElement> links = driver.findElements(By.tagName("a"));
            System.out.println("Total links found: " + links.size());

            // Check for broken links
            for (WebElement link : links) 
            {
                String url = link.getAttribute("href");
                if (url != null && !url.isEmpty()) 
                {
                    int responseCode = getResponseCode(url);
                    if (responseCode >= 400) 
                    {
                        System.out.println("Broken link: " + url + " (Response code: " + responseCode + ")");
                    } 
                    else 
                    {
                        System.out.println("Working link: " + url + " (Response code: " + responseCode + ")");
                    }
                }
            }

            // Find hidden links
            System.out.println("\nHidden links:");
            for (WebElement link : links) 
            {
                if (!link.isDisplayed()) 
                {
                	 System.out.println("Link Name: " + link.getText());
                    System.out.println("Hidden link: " +  link.getAttribute("href"));
                }
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            // Close the browser after the test
            driver.quit();
        }
    }

    // Method to check HTTP response code
    private static int getResponseCode(String urlString) 
    {
        int responseCode = 200; // Assume OK by default
        try 
        {
            URL url = new URL(urlString);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.connect();
            responseCode = httpURLConnection.getResponseCode();
        } 
        catch (Exception e) 
        {
            System.out.println("Error checking URL: " + urlString + " - " + e.getMessage());
        }
        return responseCode;
    }

}
