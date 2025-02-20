package SeleniumProject.Amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener_Amazon implements ITestListener
{
	 static WebDriver driver;
	 @Override
	 public void onTestSuccess(ITestResult result) {
	 	
	 	ITestListener.super.onTestSuccess(result);
	 	Reporter.log("Test case is pass");
	 	
	 	TakesScreenshot t1=(TakesScreenshot) driver;
	     File source=t1.getScreenshotAs(OutputType.FILE);
	     File destination=new File("C:\\Users\\priya\\eclipse-workspace\\SeleniumProject11\\screenshots\\pass\\projectone"+Math.random()+".png");
	     try {
	 		FileHandler.copy(source, destination);
	 	} catch (IOException e) {
	 		// TODO Auto-generated catch block
	 		e.printStackTrace();
	 	}
	 }

	 @Override
	 public void onTestFailure(ITestResult result) {
	 	
	 	ITestListener.super.onTestFailure(result);
	 	Reporter.log("Test case is fail");
	 	TakesScreenshot t1=(TakesScreenshot) driver;
	     File source=t1.getScreenshotAs(OutputType.FILE);
	     File destination=new File("C:\\Users\\priya\\eclipse-workspace\\SeleniumProject11\\screenshots\\fail\\prsojectone"+Math.random()+".png");
	     try {
	 		FileHandler.copy(source, destination);
	 	} catch (IOException e) {
	 		e.printStackTrace();
	 	}
	 }

}
