package handelElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Status_of_webelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		WebElement ele=driver.findElement(By.xpath("//input[contains(@id,'txtUsername')]"));
//		System.out.println("display status"+" ="+ele.isDisplayed());
//		System.out.println("display status"+" ="+ele.isEnabled());
		driver.get("https://www.spicejet.com/");
Thread.sleep(1000);
	WebElement fe=driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/div[6]/div/div[2]/div[2]/div/div[4]/div"));
		 fe.click();
		System.out.println(fe.isSelected());

	}

}
