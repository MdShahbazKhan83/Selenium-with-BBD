package Apphook;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.DriverFactory.Driverfactory;
import com.qa.utility.Configreader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHook {
	//1.The main purpose is to launch the browser so its available in our driver factory so creathe the object the driver factory then create the object of the init metthod
		private Driverfactory Driverfactory;
		private WebDriver driver;
		//2.b. so created the obj to use the launch the browser
		private Configreader Configreader;
		Properties prop;
		//2. Before launch the browser we need to use the config file and that is vailable in propert and utility file
		@Before(order = 0)
		public void getproperty() {
			Configreader  = new Configreader(); 
		prop = Configreader.init_prop();
		}

		@Before(order = 1)
		public void launchBrowser() {
		String browser = prop.getProperty("browser"); //this is property key words
		Driverfactory = new Driverfactory();
		Driverfactory.init_driver(browser);  //here browser came from line 34
		}


		@After(order = 0)
		public void tearDown() {
		driver.quit();
		}

		@After(order = 1)
		public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
		// take screenshot:
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "image/png", screenshotName);

		}}}
		



		


	
	