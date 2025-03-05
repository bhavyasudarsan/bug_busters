package dsAlgo_StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_SD {
	
	WebDriver driver = new ChromeDriver();
	
	 
 @Given("The user is on the DS Algo Home Page")
 public void the_user_is_on_the_ds_algo_home_page() {
     // Write code here that turns the phrase above into concrete actions	 
	 	WebDriverManager.chromedriver().setup();
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.manage().window().maximize();
		
      
 }

 @When("The user should click the Sign in link")
 public void the_user_should_click_the_sign_in_link() {
     // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//*[text()='Sign in']")).click();
 }

 @Then("The user should be redirected to Sign in page")
 public void the_user_should_be_redirected_to_sign_in_page() {
     // Write code here that turns the phrase above into concrete actions
	 String loginPgTitle = driver.getTitle();
	 Assert.assertEquals("Login", loginPgTitle);
      
 }

 @Given("The user is on the DS Algo Sign in Page")
 public void the_user_is_on_the_ds_algo_sign_in_page() {
     // Write code here that turns the phrase above into concrete actions
	 driver.get("https://dsportalapp.herokuapp.com/login");
	 driver.manage().window().maximize();
      
 }

 @When("The user clicks login button after leaving the {string} textbox and {string} textbox empty")
 public void the_user_clicks_login_button_after_leaving_the_textbox_and_textbox_empty(String string, String string2) {
     // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
 }

 @Then("The error message {string} appears below Username textbox")
 public void the_error_message_appears_below_username_textbox(String string) {
     // Write code here that turns the phrase above into concrete actions 
	// WebElement ErrMsg = driver.findElement(By.xpath("//*[contains(text(),'Please fill out this field')]"));
	// Assert.assertEquals(string, ErrMsg.getText());
 }

 @When("The user clicks login button after entering the {string} and leaves {string} textbox empty")
 public void the_user_clicks_login_button_after_entering_the_and_leaves_textbox_empty(String string, String string2) {
     // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
      
 }

 @Then("The error message {string} appears below Password textbox")
 public void the_error_message_appears_below_password_textbox(String string) {
     // Write code here that turns the phrase above into concrete actions
	 //WebElement msg = driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
	 //Assert.assertEquals(string, msg.getText());
 }

 @When("The user clicks login button after entering the Password only")
 public void the_user_clicks_login_button_after_entering_the_password_only() {
     // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
      
 }

 @When("The user clicks login button after entering invalid username and valid password")
 public void the_user_clicks_login_button_after_entering_invalid_username_and_valid_password() {
     // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Username");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
 }
 
 @Then("The user should able to see an error message {string}.")
 public void the_user_should_able_to_see_an_error_message(String string) {
     // Write code here that turns the phrase above into concrete actions
	 //WebElement msg = driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
	// Assert.assertEquals(string, msg.getText());
 }
 
 @When("The user clicks login button after entering Valid username and Incorrect password")
 public void the_user_clicks_login_button_after_entering_valid_username_and_incorrect_password() {
     // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bugbusters");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
 }

 @When("The user clicks login button after entering valid username and valid password")
 public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password() {
     // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bugbusters");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Team@bug");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
 }

 @Then("The user should land in Data Structure Home Page with message {string}")
 public void the_user_should_land_in_data_structure_home_page_with_message(String string) {
     // Write code here that turns the phrase above into concrete actions
	 //WebElement msg = driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
	// Assert.assertEquals(string, msg.getText());
 }

 @Given("The user is in the Home page after Sign in")
 public void the_user_is_in_the_home_page_after_sign_in() {
     // Write code here that turns the phrase above into concrete actions
	 driver.get("https://dsportalapp.herokuapp.com/login");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bugbusters");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Team@bug");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
 }

 @When("The user clicks {string}")
 public void the_user_clicks(String string) {
     // Write code here that turns the phrase above into concrete actions	
	 WebDriverWait wait;
	 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Sign out']"))).click();
 }

 @Then("The user should be redirected to home page with message {string}")
 public void the_user_should_be_redirected_to_home_page_with_message(String string) {
     // Write code here that turns the phrase above into concrete actions
	 WebElement msg = driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
	 Assert.assertEquals(string, msg.getText());
 }

}
