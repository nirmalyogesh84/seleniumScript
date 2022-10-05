package handelElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sorteddropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		WebElement element= driver.findElement(By.xpath("//select[@name=\"category_id\"]"));
	    Select sel=new Select(element);
	      List<WebElement> list= sel.getOptions();
	      ArrayList original=new ArrayList();
	      ArrayList temp=new ArrayList();
	      for(WebElement option:list)
	      {
	    	  original.add(option.getText());
	    	  temp.add(option.getText());
	      }
	      System.out.println(original);
	      System.out.println("****************************");
	      System.out.println(temp);
	       
	      Collections.sort(temp);
	      if(original.equals(temp))
	      {
	    	  System.out.println("dropdown is sorted");
	      }
	      else
	      {
	    	  System.out.println("dropdown not sorted");
	      }
	}

}
