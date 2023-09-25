
//package parallel;

package parallel;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.dsalgo.Util.ConfigReader;
import com.dsalgo.factory.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {

	private DriverFactory driverFactory;
	public WebDriver driver;
	public ConfigReader configReader;
	public Properties prop;

	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prp();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactory = new DriverFactory();
		System.out.println("browser name is " + browserName);
		driver = driverFactory.init_driver(browserName);
		driver.get(prop.getProperty("loginpage_url"));

	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			// take screenshot:
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

}

//
//import java.util.Properties;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//
//import com.qa.Factory.DriverFactory;
//import com.qa.utilities.ConfigReader;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
//
//public class AppHooks 
// 
//{
//	private DriverFactory driverfactory;
//	private WebDriver driver;
//	private ConfigReader  configReader;
//	Properties prop;
//	
//	@Before(order=0)
//	
//	public void getProperty() {
//	
//		configReader=new ConfigReader();
//		prop=configReader.init_prp(); 
//	
//
//		
//	}
//	@Before(order=1)
//	public void launchBrowser()
//	{
//		String browserName=prop.getProperty("browser");
//		driverfactory=new DriverFactory();
//    driver = driverfactory.init_driver(browserName);	
//	
//	}
//	@After(order=0)
//	public void quitBrowser()
//	{
//	driver.quit();	
//	}
//	@After(order=1)
//	
//		public void tearDown(Scenario sc)
//		{
//		if(sc.isFailed())
//		{
//			//takescreenshot
//		String screenshot=	sc.getName().replaceAll(" ", "_");
//byte[]sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)	;	
//	sc.attach(sourcePath, "image/png", screenshot);	
//		
//		}
//	}
//
//}
