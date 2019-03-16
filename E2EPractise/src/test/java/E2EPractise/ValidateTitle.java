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


public class ValidateTitle extends Base {

	Logger log=LogManager.getLogger(ValidateTitle.class.getName());
			
	@BeforeTest
	public void iniialize() throws IOException
	{
		driver=initializeDriver();
		log.debug("Browser invoker");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to url");
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
		
		
		LandingPage lPage=new LandingPage(driver);
		String title=lPage.getTitle().getText();
		Assert.assertEquals(title, "FEATURED COURSES123");
		log.error("Incorrect Title");
		log.info("Title Validated");
		

	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver=null;
		
	}
}
