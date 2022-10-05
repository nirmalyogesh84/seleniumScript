package handelElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brokenlinks 
{
	public static void main(String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement>links=  driver.findElements(By.tagName("a"));
		int brokenlinks=0;
		for(WebElement element:links)
		{
			String url=element.getAttribute("href");
			if(url==null||url.isEmpty())
			{
				System.out.println("url is empty");
				continue;
			}
			try {
				URL link =new URL(url);
				HttpURLConnection httpconn =(HttpURLConnection)link.openConnection();
				httpconn.connect();
				if(httpconn.getResponseCode()>=400)
				{
					System.out.println(httpconn.getResponseCode()+url+"is broken link");
					brokenlinks++;

				}
				else
				{
					//System.out.println(httpconn.getResponseCode()+url+"is broken link");
					System.out.println(httpconn.getResponseCode()+url+"valid link"); 
				}
			} catch (Exception e) {

			}

		}
		System.out.println("number of broken links="+brokenlinks);
	}

}
