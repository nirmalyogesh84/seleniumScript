package handelElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete_gp_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='autocomplete']"));
	
		searchbox.clear();
		searchbox.sendKeys("Toronto");
		String text =" ";
		do
		{
		searchbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		text=searchbox.getAttribute("value");
		if(text.equals("Toronto, OH, USA")) 
		{
			searchbox.sendKeys(Keys.ENTER);
			break;
		}
		Thread.sleep(3000);
		}while(! text.isEmpty()); 
		
		
		
	}

}
