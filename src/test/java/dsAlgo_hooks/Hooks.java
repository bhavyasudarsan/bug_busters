package dsAlgo_hooks;

import org.openqa.selenium.WebDriver;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	DriverFactory driverFactory = new DriverFactory();
	ConfigReader configReader = new ConfigReader();
	WebDriver driver;
	String url;
	
	@Before
	public void setup() {
		driver=driverFactory.driverSetup(configReader.getBrowser());
		url=configReader.getUrl();
		driver.get(url);
	}

	@After
	public void closeDriver() {
			if (driver != null) {
				driver.quit();
			}
	}
}
