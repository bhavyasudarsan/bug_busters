package dsAlgo_hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import dsAlgo_DriverFactory.DriverFactory;

public class Hooks {
	@Before
    public static void setUp() {
     
		//DriverFactory.getInstance();
    }
 
    @After
    public static void tearDown(Scenario scenario) {
 
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName()); 
        }   
         
        DriverFactory.tearDown();
    }

}
