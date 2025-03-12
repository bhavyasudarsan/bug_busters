package dsAlgo_hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
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
	
	@AfterStep
	public void takeScreenshotIfFailed(Scenario scenario) {
        if (scenario.isFailed()) { 
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
               
                String screenshotPath = "C:\\Users\\sanja\\Pictures\\Screenshots\\DsAlgo\\" + System.currentTimeMillis() + ".png";
                FileUtils.copyFile(screenshot, new File(screenshotPath));
                System.out.println("Screenshot saved: " + screenshotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
	
	@After
	public void closeDriver() {
			if (driver != null) {
				driver.quit();
			}
	}
	}
