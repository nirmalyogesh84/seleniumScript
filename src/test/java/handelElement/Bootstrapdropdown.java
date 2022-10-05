package handelElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrapdropdown {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.opencart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href=\"#\"]")).click();
	List<WebElement> product =driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li"));
             System.out.println(product.size());
             int size=product.size();
             for(WebElement el:product)
             {
            	 String list=el.getText();
            	 System.out.println(list);
            	 if(list.equals("SHOWCASE"))
            	 {
            		el.click(); 
            	 }
            	 
             }
	}

}
