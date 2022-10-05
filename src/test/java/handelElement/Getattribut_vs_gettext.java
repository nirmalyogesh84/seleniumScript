package handelElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Getattribut_vs_gettext {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=epVhToy176w&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=7");
        WebElement d= driver.findElement(By.xpath("//input[@id='search']"));
        d.sendKeys("yogesh"); 
        d.clear(); 
        System.out.println(d.getAttribute("id"));//value of attribute id will be return
        System.out.println(d.getText());//innner text will be return
	}

}
