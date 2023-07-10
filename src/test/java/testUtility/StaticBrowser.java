package testUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticBrowser {
	static WebDriver driver;
	String browser;
	
	public static WebDriver launchBrowsers(String browser,String URL,int timeout)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("WebDriver.Chrome.driver", "H:\\Testing\\\\chromedriver.exe\\");
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(option);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		return driver;
	}

}
