package handelElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNewTab {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
         WebDriver driver =new ChromeDriver();
         driver.get("https://demo.nopcommerce.com/");
         String Tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
         driver.findElement(By.linkText("Register")).sendKeys(Tab);
	     //or
         // driver.switchTo().newWindow(WindowType.TAB);
	     //or
        // driver.switchTo().newWindow(WindowType.WINDOW);
	}

}
