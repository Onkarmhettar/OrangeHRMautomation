package test_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_Package.FacebookLogin;
import POM_Package.Home_Page;
import POM_Package.Login_Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import mainUtility.ElementWait;
import testUtility.ReadFiles;
import testUtility.StaticBrowser;

 
public class Test_Class1 {
	WebDriver driver;
	@Parameters({"browser"})
	
	
//	@BeforeSuite
//	public void beforesuit()
//	{
//		System.out.println("before suit of class1");
//	}

	@BeforeTest
	public void beforetest(String browser) 
	{
		
		driver= StaticBrowser.launchBrowsers(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", 10);
	//	driver= StaticBrowser.launchBrowsers(browser, "https://www.facebook.com/", 5);
		
		System.out.println("beforetest");
	}

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("BeforeClass of class1");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("BeforeMethod of class1");
	}
	
	@Test
	public void verifyDashboardElement () throws EncryptedDocumentException, IOException
	{
	//	SoftAssert s=new SoftAssert();
		Login_Page login = new Login_Page(driver);
		login.sendusername(ReadFiles.fetchDataFromExcel(0, 1));
		login.sendPassword(ReadFiles.fetchDataFromExcel(1, 1));
	//	FacebookLogin login = new FacebookLogin(driver);
	//	login.sendusername(ReadFiles.fetchDataFromExcel(1, 0));
		
	//	login.sendPassword(ReadFiles.fetchDataFromExcel(1, 1));
		
//		String ExpectedResult= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
//		//String ExpectedResult="https://www.facebook.com/";
//		String ActualResult=driver.getCurrentUrl();
	//	AssertJUnit.assertEquals(ActualResult, ExpectedResult);
//		Home_Page home=new Home_Page(driver);
//		
//		boolean result=home.AdminDisplayed();
//		AssertJUnit.assertTrue(result);
//		//s.assertFalse(result, "Admin option is not present");
//		
//		boolean result1=home.PIMDisplayed();
//		AssertJUnit.assertTrue(result1);
//		
//		boolean result2=home.LeaveDisplayed();
//		AssertJUnit.assertTrue(result2);
//		
//		s.assertAll();

	}
	
	@Test
	public void test2()
	{
		System.err.println("Test2 of class1");
	}
	
	@Test(priority=0)
	public void test1()
	{
		System.out.println("Test1 of class1");
	}
	
	@Test(priority=2)
	public void abcd()
	{
		System.out.println("abcd");
	}
	@Test
	public void test3()
	{
		System.err.println("Test3 of class1");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMhethod of class1");
	}
	
	@AfterClass()
	public void afterClass()
	{
		System.out.println("AfterClass of class1");
	}
	@AfterTest
	public void aftertest()
	{
		System.err.println("after test of class1");
		//driver.quit();
	}

//	@AfterSuite
//	public void Aftersuit()
//	{
//		System.err.println("after suit of class1");
//	}

}
	
