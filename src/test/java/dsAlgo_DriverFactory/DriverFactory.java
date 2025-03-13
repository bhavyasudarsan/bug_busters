package dsAlgo_DriverFactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	static DriverFactory driverFactory;
	public static WebDriver DFdriver;
	public final static int TIMEOUT = 2;

	public static WebDriver initiateDriver(WebDriver driver) {
		
		driver = new ChromeDriver();			
		driver.manage().window().maximize();	
		DFdriver = driver;
		return driver;

	}

	public static WebDriver getDriver() {		
		return DFdriver;
		
	}

	public void wait(int time) {
		new WebDriverWait(DFdriver, Duration.ofSeconds(time));
	}

	public DriverFactory getInstance() {
//		if (driverFactory == null)
//			driverFactory = new DriverFactory();
//		return driverFactory;
		return this;

	}

	public void openPage(String url) {
		DFdriver.get(url);
	}

	static public void openApp() {
		DFdriver.get("https://dsportalapp.herokuapp.com/");
	}

	public void openHomeScreen() {
		DFdriver.get("https://dsportalapp.herokuapp.com/home");

	}

	public String getTitle() {
		return DFdriver.getTitle();
	}

	public String getCurrentURL() {
		return DFdriver.getCurrentUrl();
	}
	public static void tearDown(WebDriver driver) {
		if (driver != null) {
			driver.quit();
		}

	}

}
