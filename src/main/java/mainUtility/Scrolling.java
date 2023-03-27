package mainUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scrolling {
static WebDriver driver;
	
	public static void scrollingByPixelMethod()
	{
		JavascriptExecutor scroll =((JavascriptExecutor)driver);
		scroll.executeScript("window.scrollBy(0,500)");
	}
	
	public static void scrollIntoViewMethod()
	{
		WebElement argument=driver.findElement(By.xpath(""));
		JavascriptExecutor scroll =((JavascriptExecutor)driver);
		
		scroll.executeScript("arguments[0].scrollIntoView(true)", argument);
	}
}
