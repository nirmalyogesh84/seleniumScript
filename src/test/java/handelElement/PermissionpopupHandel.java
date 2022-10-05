package handelElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PermissionpopupHandel 
{

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options= new  ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.redbus.in/");
		Thread.sleep(200);

	}

}
