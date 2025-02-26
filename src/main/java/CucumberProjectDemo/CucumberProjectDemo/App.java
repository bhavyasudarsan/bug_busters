package CucumberProjectDemo.CucumberProjectDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
		driver.get("https://dsportalapp.herokuapp.com/login");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bugbusters");
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Team@bug");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
        
		
		WebElement warningMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body")));

		//System.out.println(warningMessage.getText());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        String outerHTML = (String) js.executeScript("return arguments[0].outerHTML;", warningMessage);
        
       // System.out.println(outerHTML);

		
		
					
	
	
			
    }
    
  }
