package handelElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandels {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		   js.executeScript("window.scrollBy(0,2000)", "");
		   String windowid=driver.getWindowHandle();
		   System.out.println(windowid);
		   //CDwindow-D2A73BA4DB87E9C8036DF5DFF4715C19
		   driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		  Set<String> windowids=driver.getWindowHandles();
		   Iterator<String> it=  windowids.iterator();
		   String parentWindowId=it.next();
		   String childWindowId=it.next();
		   
		   System.out.println(parentWindowId);
	        System.out.println(childWindowId);
//	
//	List<String> windowsIDList=new ArrayList(windowids);
//	        String parentid=windowsIDList.get(0);
//	        String childid=windowsIDList.get(1);
//	        driver.switchTo().window(parentid);
//	        System.out.println("parent title"+driver.getTitle());//parent titleOrangeHRM
//            driver.switchTo().window(childid);
//            System.out.println("child title"+driver.getTitle());//child titleOrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS
//            driver.switchTo().window(parentid);
	}
	
	

}
