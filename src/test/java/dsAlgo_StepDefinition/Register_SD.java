package dsAlgo_StepDefinition;
	
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.IOException;
import java.util.List;
import org.testng.Assert;
import dsAlgo_PageObjects.Register_PF;
import dsAlgo_Utilities.ExcelReader;
	
public class Register_SD {
		
		Register_PF register_PF ;
		
		String expectedResult;
		String username;
		String password1;
		String password2;
		
		public Register_SD() {  
			
			register_PF = new Register_PF();
	    }
		
		@Given("The user is in the Home page")
		public void The_user_is_in_the_Home_page() {
		 
			
			register_PF.getStart();
			//register_PF.registerlink();
		}
		@When("The user clicks Register link on the Home page")
		public void the_user_clicks_register_link_on_the_home_page() {
			
			register_PF.registerlink();  
		}
		@Then("The user should be land to {string} page")
		public void The_user_should_be_land_to_Registration_page(String string) {
			
			Assert.assertEquals(register_PF.getTitle(), string);
			System.out.println("\n You are on registration page \n ");
		}
		
		@Given("The user is on the user registration page")
		public void the_user_is_on_the_user_registration_page()  {
			
			register_PF.registerlink();
		}
		@When("user enters Username as {string} and Password as {string} and Confirm Password as {string} and user clicks resgister button")
		public void user_enters_username_as_and_password_as_and_confirm_password_as_and_user_clicks_resgister_button(String username, String password1, String password2) {
		   
			register_PF.enterCredentials(username, password1, password2);
			register_PF.clickRegister();
		}
		@Then("The user should be redirected to {string} with message New Account Created.You are logged in.")
		public void the_user_should_be_redirected_to_with_message_new_account_created_you_are_logged_in(String string) {
			
			Assert.assertEquals(register_PF.getTitle(), string);
			System.out.println("\n You are on Home page \n");
		}
		
		@When("The user clicks register button after leaving the Username as {string} textbox and Password as {string} and Confirm Password as {string} textbox empty")
		public void the_user_clicks_register_button_after_leaving_the_username_as_textbox_and_password_as_and_confirm_password_as_textbox_empty(String username, String password1, String password2) {
		 
			register_PF.enterCredentials(username, password1, password2);
			register_PF.clickRegister();
		}	
		
		@Then("The error {string} appears below Username textbox")
		public void the_error_appears_below_username_textbox(String string) {
		   
			String ValidationMsg = register_PF.getValidationMessage();
			Assert.assertEquals(string, ValidationMsg); 
			System.out.println("\n  Please enter a value in the textbox \n");
		}
		
		@When("The user enters Username as {string} and Password as {string} and Confirm Password as {string} and user clicks resgister button")
		public void the_user_enters_username_as_and_password_as_and_confirm_password_as_and_user_clicks_resgister_button(String username, String password1, String password2) {
		    
			register_PF.enterCredentials(username, password1, password2);
			register_PF.clickRegister();
		}
	
		@Then("The error {string} appears below Password textbox")
		public void the_error_appears_below_password_textbox(String string) {
		    
			String ValidationMsg = register_PF.getValidationMessage();
			Assert.assertEquals(string, ValidationMsg); 
			System.out.println("\n  Please enter a value in the textbox \n");
		}
		
		@When("The user enters a username as {string} and Password as {string} and Confirm Password as {string} with spacebar characters other than digits and @\\/.\\/+\\/-\\/_")
		public void the_user_enters_a_username_as_and_password_as_and_confirm_password_as_with_spacebar_characters_other_than_digits_and(String username, String password1, String password2) {
		   
			register_PF.enterCredentials(username,password1,password2);
		}
		@When("user clicks on register button")
		public void user_clicks_on_register_button() {
		   
			register_PF.clickRegister();
		}
		@Then("The user should able to see warning message {string}")
		public void the_user_should_able_to_see_warning_message(String string) {
			
			Assert.assertEquals(register_PF.getStatus(), string);
			System.out.println("\n Do not enter special characher \n ");
		}
		
		@When("The user clicks Sign in link on the Registration page")
		public void the_user_clicks_link_Sign_in_link_on_the_registration_page() {
		  
			register_PF.SigninlinkIn();
		}
	
		@Then("The user should see the {string} Page")
		public void the_user_should_see_the_Login_page(String string) {
		 
			Assert.assertEquals(register_PF.getTitle(), string);
			System.out.println("\n You are on the Login page \n ");
		}
		
		@When("The user selects {string} from the drop down without Sign in.")
		public void the_user_selects_from_the_drop_down_without_sign_in(String string) {
			
			register_PF.dropDownClick();
			
			switch (string) {
			case "Arrays":
				register_PF.arrayClick();
				break;
			case "Linked List":
				register_PF.linkedListClick();
				break;
	
			case "Stack":
				register_PF.stackClick();
				break;
			case "Queue":
				register_PF.queueClick();
				break;
			case "Graph":
				register_PF.graphClick();
				break;
			case "Tree":
				register_PF.treeClick();
				break;
			default:
				break;
			}
		  
		}
	
		@Then("The user should able to see an warning message {string}")
		public void the_user_should_able_to_see_an_warning_message(String string) {
		
			Assert.assertEquals(register_PF.getStatus(), string);
			System.out.println("\n You are not logged in \n ");	
		}
	
		@Then("land on the {string} page")
		public void land_on_the_page(String NumpyNinja) {
		  
			Assert.assertEquals(register_PF.getTitle(), NumpyNinja);
			System.out.println("\n You are on the Home page \n ");
		}
		
		@When("The User register with data from Excel {string}")
		public void the_user_register_with_data_from_excel(String SheetName) throws IOException {
			
			List<Object[]> registerData = ExcelReader.readExcelData(SheetName);
			 
		     for (Object[] row : registerData) 
		     { 
		         username = (String) row[0];
		         System.out.println(username+"\n" );
		         password1 = (String) row[1];
		         System.out.println(password1+ "\n");
		         password2 = (String) row[2];
		         System.out.println(password2+ "\n");
		         expectedResult = (String) row[3]; 
		         System.out.println(expectedResult+ "\n\n\n");
		         
		         performRegister(username, password1, password2, expectedResult);
		        
		     }
		}

		@Then("The User should see the either register Success or Failure")
		public void the_user_should_see_the_either_register_success_or_failure() {
		   
		}
		
		public void performRegister(String username, String password1, String password2, String expectedResult) {
     		
   	     //Implementation of the Register functionality.
   		
			register_PF.enterCredentials(username, password1, password2);
			register_PF.clickRegister();		
   		 
   		 if (expectedResult.equals("Please fill in this field."))
   		 {
   			 if (username.equals(""))
   			 {
   				 Assert.assertEquals(expectedResult,register_PF.getValidationMessage());
   			 }
   			 else if (password1.equals(""))
   			 {
   				Assert.assertEquals(expectedResult,register_PF.getValidationMessagePwd());
   			 }
   			 else
   			 {
   				Assert.assertEquals(expectedResult,register_PF.getValidationMessagePwd2());
   			 }
   		 }
   		 else 
   		 {
   				 Assert.assertEquals(expectedResult, register_PF.getStatus());
   		 }
   		
   		register_PF.openRegister(); // method to reach to registration page "registration link click"
   	    register_PF = new Register_PF();
   		 
   	 }
		
	}