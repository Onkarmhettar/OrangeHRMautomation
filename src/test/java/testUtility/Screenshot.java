package testUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	static WebDriver driver;
	public static String ScreenShotCaptureMethod(WebDriver driver) throws IOException
	{
		String path = System.getProperty("user.dir"+File.separator +"Screenshots"+File.separator +System.currentTimeMillis()+".png");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination= new File(path);
		FileHandler.copy(source, destination);
		return path;
		
	}
}
