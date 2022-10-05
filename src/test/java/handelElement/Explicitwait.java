package handelElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {

	public static void main(String[] args) 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
		
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("selenium");
	By elelocator= By.xpath("//h3[text()='Selenium WebDriver']");
		waitForElementPresent(driver,elelocator , 10).click();
	}
	public static WebElement waitForElementPresent(WebDriver driver,By locator,int timeout)
	{
     WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	return driver.findElement(locator);
	}
			
}


