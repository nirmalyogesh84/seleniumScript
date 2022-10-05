package handelElement;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestivedropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bing.com/");
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys("selenium");
		List<WebElement> list=driver.findElements(By.xpath("//div[@id='sw_as']/div[2]/ul//li[@class='sa_sg']/div[2]/span"));

		System.out.println(list.size());
		for(WebElement list1:list)
		{
			if(list1.getText().contains("download"))
			{
				list1.click(); 
				break;
			}
		}
	}

}
