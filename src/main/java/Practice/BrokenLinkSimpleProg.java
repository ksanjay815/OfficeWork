package Practice;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.List;

	public class BrokenLinkSimpleProg {
	    public static void main(String[] args) {
	     
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.in/");

	        List<WebElement> links = driver.findElements(By.tagName("a"));

	        for (WebElement link : links) {
	            String url = link.getAttribute("href");
	            if (url != null && !url.isEmpty()) {
	                try {
	                    new java.net.URL(url).openStream();
	                    System.out.println(url + " - Link is valid");
	                } catch (Exception e) {
	                    System.out.println(url + " - Link is broken or encountered an error: " + e.getMessage());
	                }
	            } else {
	                System.out.println("Empty or null URL");
	            }
	        }

	        driver.quit();
	    }
	}

