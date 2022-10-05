package handelElement;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshotall {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	//Full page Screen shot 
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File("C:/Users/yogesh/eclipse-workspace/Test95/Screenshotseries/cr.png");
	FileUtils.copyFile(src, trg);
    Thread.sleep(2000);
	
	//screenshot of Element 
	WebElement Section=driver.findElement(By.xpath("//input[@id='txtUsername']"));
	
	File src1=Section.getScreenshotAs(OutputType.FILE);
	File trg1=new File("C:/Users/yogesh/eclipse-workspace/Test95/Screenshotseries/cr99.png");
	FileUtils.copyFile(src1, trg1);
	Thread.sleep(2000);
	//driver.close();
	
	}

}
