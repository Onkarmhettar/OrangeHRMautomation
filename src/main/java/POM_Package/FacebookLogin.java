package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {

	@FindBy(xpath="//input[@name='email']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement LoginButton;
	
	
	public FacebookLogin (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendusername(String Uname)
	{
		Username.sendKeys(Uname);
	}

	public void sendPassword(String Pass)
	{
		Password.sendKeys(Pass);
	}
	
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}
}
