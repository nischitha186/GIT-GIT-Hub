package E2EFramework;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage extends Base {

	public Logger log=LogManager.getLogger(HomePage.class.getName());
	@BeforeTest
	public void initializer() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialized");
		
	}
	
	@Test(dataProvider="getdata")
	public void basePageNavigation(String username,String password) throws IOException
	{
		driver.get(prop.getProperty("url"));
		LandingPage landPage= new LandingPage(driver);
		landPage.loginClick().click();
		LoginPage logPage=new LoginPage(driver);
		logPage.userName().sendKeys(username);
		logPage.passWord().sendKeys(password);
		log.info("Login details passed");
		logPage.loginPress().click();
		log.debug("Login button is clicked");
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data= new Object[3][2];
		data[0][0]="abc@123.com";
		data[0][1]="123";
		
		data[1][0]="def@456.com";
		data[1][1]="456";
		
		data[2][0]="ghi@789.com";
		data[2][1]="789";
		
		return data;
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}
	
}
