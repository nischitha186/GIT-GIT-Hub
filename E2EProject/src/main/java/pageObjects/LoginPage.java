package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="input[id='user_email']")
	WebElement username;
	
	@FindBy(name="user[password]")
	WebElement password;
	
	@FindBy(css="input[value='Log In']")
	WebElement login;
	
	public WebElement userName()
	{
		return username;
	}
	
	public WebElement passWord()
	{
		return password;
	}
	
	public WebElement loginPress()
	{
		return login;
	}
	
}
