package mainUtility;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementWait {
static WebDriver driver;

//ImpliciteWait Method
public static void impliciteWait(int timeout)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
}

//ExpliciteWait Method
public static void expliciteWait(int timeout,String ElementXpath) 
{
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ElementXpath)));
	
}

public static void fluentWait(int timeout,int polling)
{
	 Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
			 .withTimeout(Duration.ofSeconds(timeout))
			 .pollingEvery(Duration.ofSeconds(polling))
			 .ignoring(NoSuchElementException.class);
}

}
