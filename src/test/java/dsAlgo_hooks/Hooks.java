package dsAlgo_hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Utilities.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	DriverFactory driverFactory;
	ConfigReader configReader;
	WebDriver driver;
	String url;

	public Hooks() {
		this.driverFactory = new DriverFactory();
		this.configReader = new ConfigReader();
	}
	
	@Before
	public void setup() {
		String browser = DriverFactory.getBrowserType();
		driver= driverFactory.driverSetup(browser);	
		url = configReader.getUrl();
		driver.get(url);
	}

	@AfterStep
	public void takeScreenshot(Scenario scenario) {

		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
