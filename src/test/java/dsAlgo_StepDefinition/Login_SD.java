package dsAlgo_StepDefinition;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import dsAlgo_PageObjects.Graph;
import dsAlgo_PageObjects.Login;
import dsAlgo_Utilities.ExcelReader;
import dsAlgo_DriverFactory.DriverFactory;

public class Login_SD {
	
	WebDriver driver;
	public Login login_PF;
	String expectedResult;
	String username;
	String password;
		
	public Login_SD() {        
        this.driver = DriverFactory.getDriver();   
        login_PF = new Login(driver);
    }
	
 @Given("The Login user is on the DS Algo Home Page")
 public void the_user_is_on_the_ds_algo_home_page() {
     // Write code here that turns the phrase above into concrete actions	 
	 	WebDriverManager.chromedriver().setup();
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.manage().window().maximize();     
 }

 @When("The Login user should click the Sign in link")
 public void the_user_should_click_the_sign_in_link() {
     // Write code here that turns the phrase above into concrete actions
	 login_PF.ClickSignIn();
 }

 @Then("The Login user should be redirected to Sign in page")
 public void the_user_should_be_redirected_to_sign_in_page() {
     // Write code here that turns the phrase above into concrete actions
	 String loginPgTitle = driver.getTitle();
	 Assert.assertEquals("Login", loginPgTitle);
      
 }

 @Given("The Login user is on the DS Algo Sign in Page")
 public void the_user_is_on_the_ds_algo_sign_in_page() {
     // Write code here that turns the phrase above into concrete actions
	 driver.get("https://dsportalapp.herokuapp.com/login");
	 driver.manage().window().maximize();
      
 }

 @When("The Login user clicks login button after leaving the {string} textbox and {string} textbox empty")
 public void the_user_clicks_login_button_after_leaving_the_textbox_and_textbox_empty(String string, String string2) {
     // Write code here that turns the phrase above into concrete actions
	 login_PF.ClickBtnLogin();
 }

 @Then("The error message {string} appears below Username textbox in Login page")
 public void the_error_message_appears_below_username_textbox(String string) {
	// Write code here that turns the phrase above into concrete actions 		
		String ValidationMsg = login_PF.getValidationMessage(driver, login_PF.inputUsername);
		Assert.assertEquals(string, ValidationMsg);
 }
 
@When("The Login user clicks login button after entering the {string} and leaves {string} textbox empty")
 public void the_user_clicks_login_button_after_entering_the_and_leaves_textbox_empty(String string, String string2) {
     // Write code here that turns the phrase above into concrete actions
	 login_PF.SetUserName(string);
	 login_PF.ClickBtnLogin();
      
 }

 @Then("The error message {string} appears below Password textbox in Login page")
 public void the_error_message_appears_below_password_textbox(String string) {
     // Write code here that turns the phrase above into concrete actions
	 String ValidationMsg = login_PF.getValidationMessage(driver, login_PF.inputPassword);
	 Assert.assertEquals(string, ValidationMsg); 
 }
 
 @When("The Login user clicks login button after entering the Password only")
 public void the_user_clicks_login_button_after_entering_the_password_only() {
     // Write code here that turns the phrase above into concrete actions
	 login_PF.SetPassword("password");
	 login_PF.ClickBtnLogin();      
 }

 @When("The Login user clicks login button after entering invalid username and valid password")
 public void the_user_clicks_login_button_after_entering_invalid_username_and_valid_password() {
     // Write code here that turns the phrase above into concrete actions
	 login_PF.SetUserName("Username");
	 login_PF.SetPassword("password");
	 login_PF.ClickBtnLogin();	 
 }
 
 @Then("The Login user should able to see an error message {string}.")
 public void the_user_should_able_to_see_an_error_message(String string) {
     // Write code here that turns the phrase above into concrete actions	
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 Assert.assertEquals(string, login_PF.getErrMsg());
	
 }
 
 @When("The Login user clicks login button after entering Valid username and Incorrect password")
 public void the_user_clicks_login_button_after_entering_valid_username_and_incorrect_password() {
     // Write code here that turns the phrase above into concrete actions
	 login_PF.SetUserName("bugbusters");
	 login_PF.SetPassword("password");
	 login_PF.ClickBtnLogin();		 
 }

 @When("The Login user clicks login button after entering valid username and valid password")
 public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password() {
     // Write code here that turns the phrase above into concrete actions
	 login_PF.SetUserName("bugbusters");
	 login_PF.SetPassword("Team@bug");
	 login_PF.ClickBtnLogin();	 
 }

 @Then("The Login user should land in Data Structure Home Page with message {string}")
 public void the_user_should_land_in_data_structure_home_page_with_message(String string) {
     // Write code here that turns the phrase above into concrete actions	 
	 Assert.assertEquals(string, login_PF.getErrMsg()); 
}

 @Given("The Login user is in the Home page after Sign in")
 public void the_user_is_in_the_home_page_after_sign_in() {
     // Write code here that turns the phrase above into concrete actions
	 driver.get("https://dsportalapp.herokuapp.com/login");
	 driver.manage().window().maximize();
	 login_PF.SetUserName("bugbusters");
	 login_PF.SetPassword("Team@bug");
	 login_PF.ClickBtnLogin();	 
 }

 @When("The Login user clicks {string}")
 public void the_user_clicks(String string) {
     // Write code here that turns the phrase above into concrete actions	
	 login_PF.ClickSignOut();
 }

 @Then("The Login user should be redirected to home page with message {string}")
 public void the_user_should_be_redirected_to_home_page_with_message(String string) {
     // Write code here that turns the phrase above into concrete actions	
	 Assert.assertEquals(string, login_PF.getErrMsg());
 }
 
 @When("Login User logs in with data from Excel {string} for row {string}")
 public void login_user_logs_in_with_data_from_excel_for_row(String filePath, String RowNo) throws IOException {
     List<Object[]> loginData = ExcelReader.readExcelData(filePath, "Sheet1");
     int index = 1;
     for (Object[] row : loginData) { 
    	 if (index == Integer.parseInt(RowNo))
    	 {
	         username = (String) row[0];
	         password = (String) row[1];
	         expectedResult = (String) row[2];	         
	         performLogin(username, password);
    	 }
    	 index++;
     }
 }

 @Then("Login User should see the either Log in Success or Failure")
 public void login_user_should_see_the_either_log_in_sucess_or_failure() {
     // Assert the expected result
	 if (expectedResult.equals("Please fill out this field."))
	 {
		 if (username.equals(""))
		 {
			 Assert.assertEquals(expectedResult, login_PF.getValidationMessage(driver, login_PF.inputUsername));
		 }
		 else
		 {
			 Assert.assertEquals(expectedResult, login_PF.getValidationMessage(driver, login_PF.inputPassword));
		 }			 
	 }
	 else
	 {
		 Assert.assertEquals(expectedResult, login_PF.getErrMsg());
	 }
 }

 private void performLogin(String username, String password){
     //Implementation of the Login functionality.
	 login_PF.SetUserName(username);
	 login_PF.SetPassword(password);
	 login_PF.ClickBtnLogin();			 
 }
 

}
