package handelElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindow {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
         WebDriver driver =new ChromeDriver();
         driver.get("https://demo.nopcommerce.com/");
      driver.switchTo().newWindow(WindowType.TAB);
       // driver.switchTo().newWindow(WindowType.WINDOW);
      ///driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");

	}

}
