package handelElement;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handelingcoockies {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Set<Cookie> coockies=driver.manage().getCookies();
	System.out.println("number of coockies"+coockies.size());
    //print coockies from browser	
	for(Cookie coockie:coockies)
	{
		System.out.println(coockie.getName()+":"+coockie.getValue());
	}
	// add coockies  
	Cookie coockiesobj =new Cookie("my123","12345");
	driver.manage().addCookie(coockiesobj);
	
	Set<Cookie> coockies2=driver.manage().getCookies();
	System.out.println("number of after adding coockies"+coockies2.size());
	}

	
}


