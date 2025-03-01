package dsAlgo_StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DataStructure_SD {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("User Launches DsAlgo portal")
	public void user_launches_ds_algo_portal() {
		
		 driver.get("https://dsportalapp.herokuapp.com/login");
		 driver.manage().window().maximize();
	}

	@Given("The user is in the Home page after logged in")
	public void the_user_is_in_the_home_page_after_logged_in() {
		
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bugbusters");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Team@bug");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	}

	@When("The user clicks the Get Started button in Data Structures - Introduction page")
	public void the_user_clicks_the_get_started_button_in_data_structures_introduction_page() {
	   
		driver.findElement(By.xpath("//a[@href='data-structures-introduction']")).click();		
	}

	@Then("The user should land in Data Structures- Introduction Page")
	public void the_user_should_land_in_data_structures_introduction_page(String string) {
	  
		String msg = driver.getTitle();
		Assert.assertEquals(string, msg);
		
		
	}



	
	

	


}
