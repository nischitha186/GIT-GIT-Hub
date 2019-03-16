package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	WebDriver driver;
	By signIn=By.xpath("//a[contains(@href,'sign_in')]");
	By title=By.cssSelector(".text-center>h2");
	By navigationBar=By.cssSelector(".nav.navbar-nav.navbar-right");
  
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement signInClick()
	{
		return driver.findElement(signIn);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	
	public WebElement navBar()
	{
		return driver.findElement(navigationBar);
	}
}
