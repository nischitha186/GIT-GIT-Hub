package E2EPractise;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;


public class ValidateNavigation extends Base {

	Logger log=LogManager.getLogger(ValidateNavigation.class.getName());
	@BeforeTest
	public void iniialize() throws IOException
	{
		driver=initializeDriver();
		log.debug("Browser invoker");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to url  validate navigation updated");
		
		
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
		
		
		LandingPage lPage=new LandingPage(driver);
		String title=lPage.getTitle().getText();
		
		LandingPage lpage=new LandingPage(driver);
		Assert.assertTrue(lpage.navBar().isDisplayed());
		log.fatal("Incorrect Navigation Bar");
		log.info("Navigation Bar Validated");

	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
	}
	
}
