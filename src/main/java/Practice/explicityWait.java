package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicityWait {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(300));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		wait.until(ExpectedConditions.visibilityOfAllElements(allLinks));
		System.out.println(allLinks.size());
		for (WebElement list : allLinks) {
			System.out.println(list.getText());

			if (list.getText().equals("TSRTC")) {
				list.click();
			}
		}
	Actions act = new Actions(driver);

	
	}
}