package handelElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigatecommand {

	public static void main(String[] args) {
         WebDriverManager.chromedriver().setup();
         WebDriver driver =new ChromeDriver();
         driver.get("https://www.spicejet.com/");
         driver.get("https://opensource-demo.orangehrmlive.com/");
         driver.navigate().back() ;
         driver.navigate().forward();     
         driver.navigate().refresh();
         driver.navigate().to("https://web.whatsapp.com/");
              
          
         
	}

}
