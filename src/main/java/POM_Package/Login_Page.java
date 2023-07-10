package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page{

	
// WebElements
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Button;
	
	//@FindBy(xpath="//p[(text()='Forgot your password? ']")
	//private WebElement Forgotpasslink;
	
	
	
	//constructor
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void sendusername(String Uname)
	{
		username.sendKeys(Uname);
	}

	public void sendPassword(String Pass)
	{
		Password.sendKeys(Pass);
	}
	
	public void ClickOnLoginButton()
	{
		Button.click();
	}
	
	/*
	 * public void forgotpasslink() { Forgotpasslink.click(); }
	 */
}
