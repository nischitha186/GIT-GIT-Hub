package E2EFramework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ValidateTitle extends Base {

	public Logger log=LogManager.getLogger(ValidateTitle.class.getName());
	@BeforeTest
	public void initializer() throws IOException
	{
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
	
		LandingPage landPage= new LandingPage(driver);
		Assert.assertEquals("FEATURED COURSES", landPage.getTitle().getText());
		Assert.assertTrue(landPage.navigateBar().isDisplayed());
		log.error("Navigation bar is present");;
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}
	
}
