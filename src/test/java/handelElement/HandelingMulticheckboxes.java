package handelElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingMulticheckboxes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
       driver.get("https://itera-qa.azurewebsites.net/home/automation");
	  List <WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
	  int size= checkbox.size();
	  System.out.println(size);
	  //select all
	  
	  for(int i=0;i<=size;i++)
	  {
		  checkbox.get(i).click();
	  }
	  //multiple by choice
	  
	  for(WebElement choice:checkbox)
	  {
		 String checkboxname=choice.getAttribute("id");
		 if(checkboxname.equals("monday")||checkboxname.equals("sunday"))
		 {
			 choice.click();
		 }
	  }
	  //select last 2 checkboxes
	  
	  for(int i=size-2;i<size;i++) //start from 5th index
	  {
		  checkbox.get(i).click();
	  }
	  for(int i=0;i<size;i++)
	  {
		  if(i<2)
		  {
			  checkbox.get(i).click();
		  }
	  }
	}

}
