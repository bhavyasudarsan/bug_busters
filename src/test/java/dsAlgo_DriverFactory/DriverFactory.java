package dsAlgo_DriverFactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverFactory {

	public static WebDriver driver;
	
	public final static int TIMEOUT = 2;
    private static final Logger logger = LoggerFactory.getLogger(DriverFactory.class);
    

	public WebDriver driverSetup(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		logger.info("Driver initialised with browser as:"  +  browser) ;

		return driver;
	}
	
	public static WebDriver getDriverInstance() {
		return driver;
		
	}

	public String getTitle() {
		return driver.getTitle();
	}

}

