package dsAlgo_DriverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory {
	static DriverFactory driverFactory;
	private static WebDriver driver;
	public final static int TIMEOUT = 2;

	private DriverFactory() {
//        WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
		new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
	}

	public  WebDriver getDriver() {
		return driver;
	}

//	public static WebDriver getDriver() {
//		return driver;
//	}

	public static DriverFactory getInstance() {
		if (driverFactory == null)
			driverFactory = new DriverFactory();
		return driverFactory;

	}
	public static void openPage(String url) {
        driver.get(url);
    }
	public static String getTitle() {
        return driver.getTitle();
    }
	
	public static String getCurrentURL() {
        return driver.getCurrentUrl();
    }
//	public static void openPage() {
//		driver.get("https://dsportalapp.herokuapp.com/");
//	}
}
