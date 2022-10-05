package handelElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handeldropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569870%7Ce%7Ccreate%20facebook%20account%7C&placement=&creative=589460569870&keyword=create%20facebook%20account&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221432%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-15289672663%26loc_physical_ms%3D1007786%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjw3cSSBhBGEiwAVII0Z91GPlwLj16E-0BMXV9wuwndvmjzWW4ScYJS20xkhYjmTRuFDxY6hhoCWD4QAvD_BwE/");
		WebElement we=driver.findElement(By.xpath("//select[@id='month']"));
		// we.click();
		Select sd=new Select(we);

		Thread.sleep(2000);
		//sd.selectByValue("10");
		//sd.selectByVisibleText("Feb");
		sd.selectByIndex(5);

		List<WebElement> all=sd.getOptions();
		//using simple for loop print elemnt
		int asd=  all.size();
		for(int i=0;i<=asd;i++)
		{
			String a =all.get(i).getText();
			System.out.println(a);
		}
		//using foreach print element  
		for(WebElement a2:all)
		{
			String std=	a2.getText();
			System.out.println(std);
		}

	}

}
