package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Base {

	public static WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException{
		
		prop= new Properties();
		FileInputStream fis=new FileInputStream("C://STUFF//IMP COURSES//Selenium//E2ESeleniumPractise//src//main//java//resources//Data.properties");
		prop.load(fis);
		
	
		String browser=prop.getProperty("Browser");
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C://STUFF//IMP COURSES//Selenium//chromedriver_win32//chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\STUFF\\IMP COURSES\\Selenium\\IEDriverServer_x64_3.3.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		else
		{
			//System.setProperty("webdriver.gecko.driver", "");
			driver=new FirefoxDriver();																						
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void screenshot(String result) throws IOException
	{
	

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("C://STUFF//IMP COURSES//Selenium//E2ESeleniumPractise//"+result+"Screenshot.png"));
	}
}
