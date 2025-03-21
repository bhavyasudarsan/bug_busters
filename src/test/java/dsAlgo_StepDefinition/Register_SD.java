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
		}
		@When("The user clicks Register link on the Home page")
		public void the_user_clicks_register_link_on_the_home_page() {
			
			register_PF.registerlink();  
		}
		@Then("The user should be land to {string} page")
		public void The_user_should_be_land_to_Registration_page(String string) {
			
			Assert.assertEquals(register_PF.getTitle(), string);
		}
		@Given("The user is on the user registration page")
		public void the_user_is_on_the_user_registration_page()  {
			
			register_PF.registerlink();
		}
		@When("The user clicks Sign in link on the Registration page")
		public void the_user_clicks_link_Sign_in_link_on_the_registration_page() {
		  
			register_PF.SigninlinkIn();
		}
	
		@Then("The user should see the {string} Page")
		public void the_user_should_see_the_Login_page(String string) {
		 
			Assert.assertEquals(register_PF.getTitle(), string);
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
		public void the_user_should_able_to_see_an_warning_message(String string) throws InterruptedException {
		
			Assert.assertEquals(register_PF.getStatus(), string);
		}
	
		@Then("land on the {string} page")
		public void land_on_the_page(String NumpyNinja) {
		  
			Assert.assertEquals(register_PF.getTitle(), NumpyNinja);
		}
		
		@When("The user register with data from Excel {string} and {int} for Register")
		public void the_user_register_with_data_from_excel_and_for_register(String SheetName, Integer RowNo) throws IOException {
		   
			List<Object[]> registerData = ExcelReader.readExcelData(SheetName);
		     if (RowNo <= registerData.size()) 
		     {
		    	    Object[] row = registerData.get(RowNo-1); // Access the desired row directly
		    	    username = (String) row[0];
		    	    password1 = (String) row[1];
		    	    password2 = (String) row[2];
		    	    expectedResult = (String) row[3];  
		    	    performRegister(username, password1, password2, expectedResult ); 
		     }  
		}
		@Then("The error or validation message appears after register button clicked")
		public void the_error_or_validation_message_appears_after_register_button_clicked() throws InterruptedException {
		  
			if (expectedResult.equals("Please fill in this field."))
			 {
				 if (username.equals(""))
				 {
					 Assert.assertEquals(expectedResult, register_PF.getValidationMessage());
				 }
				 else if (password1.equals(""))
				 {
					 Assert.assertEquals(expectedResult, register_PF.getValidationMessagePwd());
				 }	
				 else 
				 {
					 Assert.assertEquals(expectedResult, register_PF.getValidationMessagePwd2());
				 }
			 }
			 else
			 {
				 Assert.assertEquals(expectedResult,register_PF.getStatus());				 
			 }
		}

		@Then("The user should be redirected to {string} page with success message")
		public void the_user_should_be_redirected_to_page_with_success_message(String string) {
			
			Assert.assertEquals(register_PF.getTitle(), "NumpyNinja");
		}
   	
   	    private void performRegister(String username, String password1, String password2,  String expectedResult) {
   	    	
   	    	//Implementation of the Login functionality.
   	    	
   	    	register_PF.enterCredentials(username, password1, password2);
   	    	register_PF.clickRegister();
   	 } 
   		 
}





