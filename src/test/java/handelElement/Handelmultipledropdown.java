package handelElement;
//|| jay bhawani jay shiwaji ||//
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handelmultipledropdown {
	static WebDriver driver;
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
	        driver =new ChromeDriver();
	        driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Ce%7Ccreate%20facebook%20account%7C&placement=&creative=589460569870&keyword=create%20facebook%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-15289672663%26loc_physical_ms%3D1007786%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw3cSSBhBGEiwAVII0Z91GPlwLj16E-0BMXV9wuwndvmjzWW4ScYJS20xkhYjmTRuFDxY6hhoCWD4QAvD_BwE/");
	        WebElement el1=driver.findElement(By.xpath("//select[@id='day']"));
	        dropdown( el1,"17");
	        WebElement el2= driver.findElement(By.xpath("//select[@id='month']"));
	        dropdown(el2 ,"6");
	        WebElement el3= driver.findElement(By.xpath("//select[@id='year']"));
	        dropdown( el3,"2022");
	
	}
        public static void dropdown(WebElement ele,String value)
        {
        Select sel=new Select(ele);
             List <WebElement> sd= sel.getOptions();
                for(WebElement as:sd)
                {
                	if(as.getText().equals(value))
                	{
                		as.click();
                		break;
                	}
                }
        }
}
