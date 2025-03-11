package dsAlgo_StepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import dsAlgo_DriverFactory.DriverFactory;

public class Hooks {
	WebDriver driver;	
	
	@Before
    public void setUp() {     
		
        driver = DriverFactory.initiateDriver(driver);				
    }
 
    @After
    public void tearDown(Scenario scenario) { 
    	
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());            
        }   
         
        DriverFactory.tearDown(driver);
    }

}
