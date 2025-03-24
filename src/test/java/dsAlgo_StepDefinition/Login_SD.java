package dsAlgo_StepDefinition;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import dsAlgo_PageObjects.Login;
import dsAlgo_Utilities.ExcelReader;

public class Login_SD {
	private static final Logger logger = LoggerFactory.getLogger(Login_SD.class);
	public Login login_PF;
	String expectedResult;
	String username;
	String password;
		
	public Login_SD() {  
        login_PF = new Login();
    }
	
 @Given("The user is on the DS Algo Home Page for Login")
 public void the_user_is_on_the_ds_algo_home_page() {
     // Write code here that turns the phrase above into concrete actions
		login_PF.openHome();	
		logger.info("User is in the DS Algo Home Page");
 }

 @When("The user should click the Sign in link for Login")
 public void the_user_should_click_the_sign_in_link() {
     // Write code here that turns the phrase above into concrete actions
	 login_PF.ClickSignIn();
 }

 @Then("The user should be redirected to Sign in page for Login")
 public void the_user_should_be_redirected_to_sign_in_page() {
     // Write code here that turns the phrase above into concrete actions
	 String loginPgTitle = login_PF.getTitle();
	 Assert.assertEquals("Login", loginPgTitle);
	 logger.info("User is in the Sign in Page"); 
 }

 @Given("The user is on the DS Algo Sign in Page for Login")
 public void the_user_is_on_the_ds_algo_sign_in_page() {
     // Write code here that turns the phrase above into concrete actions
	 login_PF.openLogin();
	 logger.info("User is in the Sign in Page");
 }

 @When("The user clicks login button after entering invalid username and valid password")
 public void the_user_clicks_login_button_after_entering_invalid_username_and_valid_password() {
     // Write code here that turns the phrase above into concrete actions
	 login_PF.SetUserName("Username");
	 login_PF.SetPassword("password");
	 login_PF.ClickBtnLogin();	 
 }

 @When("The user clicks login button after entering valid username and valid password for Login")
 public void the_user_clicks_login_button_after_entering_valid_username_and_valid_password() {
     // Write code here that turns the phrase above into concrete actions
	 login_PF.SetUserName("bugbusters");
	 login_PF.SetPassword("Team@bug");
	 login_PF.ClickBtnLogin();	 
 }

 @Then("The user should see Login success message for Login")
 public void the_user_should_land_in_data_structure_home_page_with_message() {
     // Write code here that turns the phrase above into concrete actions	 
	 Assert.assertEquals(expectedResult, login_PF.getErrMsg()); 
	 logger.info("Login Success");
}

 @Given("The user is in the Home page after Sign in for Login")
 public void the_user_is_in_the_home_page_after_sign_in() {
     // Write code here that turns the phrase above into concrete actions
	 login_PF.openLogin();	 
	 login_PF.SetUserName("bugbusters");
	 login_PF.SetPassword("Team@bug");
	 login_PF.ClickBtnLogin();	 
 }

 @When("The user clicks {string}")
 public void the_user_clicks(String string) {
     // Write code here that turns the phrase above into concrete actions	
	 login_PF.ClickSignOut();
 }

 @Then("The user should be redirected to home page with message {string}")
 public void the_user_should_be_redirected_to_home_page_with_message(String string) {
     // Write code here that turns the phrase above into concrete actions	
	 Assert.assertEquals(string, login_PF.getErrMsg());	 
 }
 
 @When("User logs in with data from Excel {string} and {int} for Login")
 public void login_user_logs_in_with_data_from_excel_for_row(String SheetName, Integer RowNo) throws IOException {
     List<Object[]> loginData = ExcelReader.readExcelData(SheetName);
     if (RowNo <= loginData.size()) 
     {
    	    Object[] row = loginData.get(RowNo-1); // Access the desired row directly
    	    username = (String) row[0];
    	    password = (String) row[1];
    	    expectedResult = (String) row[2];    	    
    	    performLogin(username, password, expectedResult);
     }      
 }

 @Then("The error or validation message appears after Login button clicked")
 public void login_user_should_see_the_either_log_in_sucess_or_failure() {
     // Assert the expected result
	 if (expectedResult.equals("Please fill out this field."))
	 {
		 if (username.equals(""))
		 {
			 Assert.assertEquals(expectedResult, login_PF.getValidationMessage(login_PF.inputUsername));
		 }
		 else
		 {
			 Assert.assertEquals(expectedResult, login_PF.getValidationMessage(login_PF.inputPassword));
		 }			 
	 }	 
	 else
	 {
		 Assert.assertEquals(expectedResult, login_PF.getErrMsg()); 
	 }
 }

 private void performLogin(String username, String password, String expectedResult) {
     //Implementation of the Login functionality.
	 login_PF.SetUserName(username);
	 login_PF.SetPassword(password);
	 login_PF.ClickBtnLogin();
 } 

}
