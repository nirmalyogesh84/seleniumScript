package handelElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SizeAndLocationOfElement {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
         WebDriver driver =new ChromeDriver();
         driver.get("https://opensource-demo.orangehrmlive.com/");
         //LOcation-method 1
         WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']/img"));
	      System.out.println("Location logo"+logo.getLocation());
	      //Location-method 2
	      System.out.println(logo.getRect().getX());
	      System.out.println(logo.getRect().getY());
	      //size-method 1
	      System.out.println("size(Width,Height)"+logo.getSize());
	      //size-method2
	      System.out.println(logo.getRect().getDimension());
	      System.out.println(logo.getRect().getDimension().getHeight());
	      System.out.println(logo.getRect().getDimension().getWidth());
	
	}

}
