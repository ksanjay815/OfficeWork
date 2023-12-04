package Practice;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.net.HttpURLConnection;
	import java.net.URL;
	import java.util.List;

	public class CheckBrokenLinks {
		
	    public static void main(String[] args) {
	     
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the webpage
	        driver.get("https://www.amazon.in/"); // Replace with your desired URL

	        // Get all the links on the webpage
	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        // Iterate through each link
	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            if (url != null && !url.isEmpty()) {
	                try {
	                    // Create a URL object
	                    URL linkURL = new URL(url);

	                    // Open a connection to the URL
	                    HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection();
	                    connection.setRequestMethod("GET");
	                    
	                    // Get the HTTP response code
	                    int responseCode = connection.getResponseCode();

	                    // Check if the response code is a success code
	                    if (responseCode >= 200 && responseCode < 400) {
	                        System.out.println(url + " - " + "Link is valid");
	                    } else {
	                        System.out.println(url + " - " + "Link is broken (Response Code: " + responseCode + ")");
	                    }
	                } catch (Exception e) {
	                    System.out.println(url + " - " + "Error occurred: " + e.getMessage());
	                }
	            } else {
	                System.out.println("Empty or null URL");
	            }
	        }

	        // Close the browser
	        driver.quit();
	    }
	}
