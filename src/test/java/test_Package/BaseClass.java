package test_Package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import testUtility.ReadFiles;
import testUtility.Screenshot;
import testUtility.StaticBrowser;

public class BaseClass{
	static WebDriver driver;
	static ExtentTest logger;
	static ExtentReports report;
	static ExtentHtmlReporter extent;
	
	@Parameters({"browser"})
	
	@BeforeTest
	public void BeforeTest(String browser) throws InterruptedException
	{
		
		 report =new ExtentReports();
		 extent = new ExtentHtmlReporter("test-output\\reports\\"+System.currentTimeMillis()+".html");
		 report.attachReporter(extent);
		 driver= StaticBrowser.launchBrowsers(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login", 10);
		 Thread.sleep(3000);
		
		
	}
	
	@AfterMethod
	public void AfterMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String path=Screenshot.ScreenShotCaptureMethod(driver);
			logger.fail(" Test case is failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			logger.pass("This case is pass");
		}
		report.flush();
	}
	
	@AfterTest
	public void aftertest()
	{
		System.err.println("after test of class1");
	//	driver.quit();
	}
	
}
