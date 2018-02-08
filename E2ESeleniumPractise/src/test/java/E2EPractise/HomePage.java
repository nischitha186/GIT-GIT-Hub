package E2EPractise;


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

	Logger log= LogManager.getLogger(HomePage.class.getName());
	@BeforeTest
	public void iniialize() throws IOException
	{
		driver=initializeDriver();
		log.debug("Browser invoker");
		
	}
	
	
	@Test(dataProvider="getdata")
	public void basePageNavigation(String username,String password) throws IOException
	{
		System.out.println("Home Page");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to url");
		LandingPage lPage=new LandingPage(driver);
		lPage.signInClick().click();
		log.fatal("Did not click on link");
		LoginPage logPage=new LoginPage(driver);
		logPage.userNameMtd().sendKeys(username);
		logPage.passwdMtd().sendKeys(password);
		logPage.logInMtd().click();

	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="mno@xyz";
		data[0][1]="pqr";
		
		data[1][0]="ghi@xyz";
		data[1][1]="mno";
		return data;
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
		
	}
}
