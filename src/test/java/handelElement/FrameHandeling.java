package handelElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandeling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).click();
	  	driver.switchTo().defaultContent();//before Switching to next frame we have 
	  	                                   //to switch to default window
	  	
	  	Thread.sleep(2000);
        driver.switchTo().frame("classFrame");
        driver.findElement(By.xpath("//div[@class='topNav']/ul/li[5]/a")).click();
        driver.switchTo().defaultContent();
        
        Thread.sleep(2000);
        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.xpath("//a[text()='org.openqa.selenium' and contains(@target,'packageFrame')]")).click();
        driver.switchTo().defaultContent();
	}

}
