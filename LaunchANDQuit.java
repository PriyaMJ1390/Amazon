package SeleniumProject.Amazon;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchANDQuit extends Listener_Amazon
{
WebDriver driver;
	
		@BeforeMethod
		public void Launch()
		{
		
		driver=new ChromeDriver();
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
		
		
		
		@AfterMethod
		public void quit()
		{	
		//driver.quit();
		}
		
}
