package handelElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksAll {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> links=driver.findElements(By.tagName("a"));//all links of webpage return
		System.out.println("number of links present"+links.size());
		for (int i=0;i<=links.size();i++)
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
		}

	}

}
