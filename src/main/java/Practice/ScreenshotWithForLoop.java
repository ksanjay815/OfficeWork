package Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotWithForLoop {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.name("q")).sendKeys("hp laptop", Keys.ENTER);

		for (int i = 1; i <= 5; i++) {

			File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			Thread.sleep(1500);
			File path = new File("./Screenshot/" + System.currentTimeMillis()+i+"img.png");
			FileUtils.copyFile(file, path);
		}

		driver.close();

	}
}
