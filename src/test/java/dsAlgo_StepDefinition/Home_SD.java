package dsAlgo_StepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_PageObjects.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class Home_SD {

	HomePage homePage;
	WebDriver driver;

	public Home_SD() {
		System.out.println("******Home_SD ");
		driver = DriverFactory.initiateDriver();
		homePage = new HomePage(driver);
	}

	@Given("Browser is open")
	public void browser_is_open() {
		if(driver==null)
			driver=  DriverFactory.initiateDriver();
		driver.get("https://dsportalapp.herokuapp.com/");
	}

	@When("Home user enter  the correct URL for Heroku app")
	public void the_user_enter_the_correct_url_for_heroku_app() {
		driver.getCurrentUrl();
		
	}

	@Then("Home User is at dsAlgo  app with {string} btn.")
	public void user_is_at_ds_algo_app_with_get_start_button(String string) {
		Assert.assertEquals(string, homePage.clickStBtnString());

	}

	@Given("The Homepage user is on the DS Algo Portal")
	public void the_user_is_on_the_ds_algo_portal() {
		 driver.getCurrentUrl();
	}

	@When("The Homepage user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		homePage.clickStBtn(driver);
	}

	@Then("The Homepage user should be navigated to the Data Structure Introduction page, which displays the {string} and {string} links.")
	public void the_user_should_be_navigated_to_the_data_structure_introduction_page_which_displays_the_and_links(
			String string, String string2) {

		Assert.assertEquals(string, homePage.registerBtn());
		Assert.assertEquals(string2, homePage.signInBtn());

	}
	
	

}
