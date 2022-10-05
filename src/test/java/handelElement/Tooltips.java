package handelElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltips {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
         WebDriver driver =new ChromeDriver();
         driver.get("https://jqueryui.com/tooltip/");
               driver.switchTo().frame(0);
              WebElement ele= driver.findElement(By.xpath("//input[@id='age']"));
              String tooltips= ele.getAttribute("title");
	        System.out.println(tooltips);
	}

}
