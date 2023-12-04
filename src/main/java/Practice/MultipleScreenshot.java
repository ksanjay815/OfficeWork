package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleScreenshot {
	public static WebDriver driver;

		public static void ScreenshotMethod() throws IOException {
		
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File path= new File("./MultipleScreenshot/"+System.currentTimeMillis()+".png");
			FileUtils.copyFile(file, path);
		}
		public static void main(String[] args) throws IOException, InterruptedException {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//span[@role='button']")).click();
			ScreenshotMethod();
			driver.findElement(By.name("q")).sendKeys("hp laptop", Keys.ENTER);
			ScreenshotMethod();
			driver.close();
			
		}
	}
