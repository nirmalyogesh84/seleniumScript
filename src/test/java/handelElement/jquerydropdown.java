package handelElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jquerydropdown {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		 driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
         driver.findElement(By.xpath("//div[@class='comboTreeInputWrapper']/button")).click();
         selectchoicevalue(driver, "choice 2");
        // selectchoicevalue(driver, "choice 1", "choice 2", "choice 3");
        // selectchoicevalue(driver, "all");
	}
	public static void selectchoicevalue(WebDriver driver,String...value)
	{
       List<WebElement> option=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
			if(!value[0].equalsIgnoreCase("all"))
			{
				for(WebElement choice:option)
				{
					String cho=choice.getText();
					for(String val:value)
					{
						if(cho.equals(val))
						{
							choice.click();
							break;
						}
					}
				}
			}
			else
			{
				for(WebElement item:option)
				{
					item.click();
				}
			}
	}
	

}
