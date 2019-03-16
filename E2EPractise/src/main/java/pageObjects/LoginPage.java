package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver driver;
	@FindBy(xpath="//input[@id='user_email']")
	WebElement userName;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(css="input.btn.btn-primary.btn-md.login-button")
	WebElement logInButton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement userNameMtd()
	{
		return userName;
	}
	public WebElement passwdMtd()
	{
		return password;
	}
	public WebElement logInMtd()
	{
		return logInButton;
	}
}
