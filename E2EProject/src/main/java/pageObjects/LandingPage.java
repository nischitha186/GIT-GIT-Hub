package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	WebDriver driver;
	By loginButton=By.cssSelector("a[href='http://qaclickacademy.usefedora.com/sign_in']");
	By title=By.cssSelector(".text-center>h2");
	By navigationBar=By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement loginClick()
	{
		return driver.findElement(loginButton);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement navigateBar()
	{
		return driver.findElement(navigationBar);
	}
}
