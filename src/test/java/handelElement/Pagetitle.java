//how to lonch browser in Webdriver?
//how to open url?
//how to capture title of the page?
//how to capture url of the page?
//how to capture pagesource of the page?
//how to validate the title of page?
package handelElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagetitle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String expectedtitle="OrangeHRM";
		String Actualtitle=driver.getTitle();
		System.out.println(Actualtitle);
		Assert.assertEquals(Actualtitle, expectedtitle);
		System.out.println("it is equal");
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getPageSource());
	}

}
