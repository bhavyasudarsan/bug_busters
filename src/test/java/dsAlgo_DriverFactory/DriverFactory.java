package dsAlgo_DriverFactory;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	static DriverFactory driverFactory;
	private static WebDriver driver;
	public final static int TIMEOUT = 2;

	private DriverFactory() {
	}


	public static WebDriver initiateDriver() {

		driver = new ChromeDriver();
		new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();

		return driver;

	}

	public static WebDriver getDriver() {
		return driver;
	}


	public static void wait(int time) {
		new WebDriverWait(driver, Duration.ofSeconds(time));
	}

	public static DriverFactory getInstance() {
//		if (driverFactory == null)
//			driverFactory = new DriverFactory();
//		return driverFactory;
		return new DriverFactory();

	}

	public static void openPage(String url) {
		driver.get(url);
	}

	public static void openApp() {
		driver.get("https://dsportalapp.herokuapp.com/");
	}

	public static void openHomeScreen() {
		driver.get("https://dsportalapp.herokuapp.com/home");

	}

	public static String getTitle() {
		return driver.getTitle();
	}

	public static String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}

	}

}
