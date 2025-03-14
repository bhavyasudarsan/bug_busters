package dsAlgo_StepDefinition;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import dsAlgo_PageObjects.Graph;
import dsAlgo_Utilities.ExcelReader;

public class Graph_SD {
	
	public Graph graph_PF;
	String inputText;
	String expectedOutput;
	
	public Graph_SD() {
        graph_PF = new Graph();
    }
	
	@Given("Graph User Launches DsAlgo portal")
	public void graph_user_launches_ds_algo_portal() {
	    // Write code here that turns the phrase above into concrete actions		
		graph_PF.openLogin();		
		graph_PF.SetUserName("bugbusters");
		graph_PF.SetPassword("Team@bug");
		graph_PF.ClickBtnLogin();
	}
	
	@Given("The Graph user is in the Main page after Sign in")
	public void the_graph_user_is_in_the_home_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@When("The Graph user clicks the {string} button in Graph Panel")
	public void the_graph_user_clicks_the_button_in_graph_panel(String string) {
	    // Write code here that turns the phrase above into concrete actions
		graph_PF.ClickGraph();		
	}

	@Then("The Graph user be directed to {string} Page")
	public void the_user_be_directed_to_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = graph_PF.getTitle();
		Assert.assertEquals(string, msg);		
	}
	
	@When("The user select Graph item from the drop down menu")
	public void the_user_select_graph_item_from_the_drop_down_menu() {
	    // Write code here that turns the phrase above into concrete actions
		graph_PF.ClickDropDownGraph();
	}

	@Given("The Graph user is in the {string} page after Sign in")
	public void the_user_is_in_the_page_after_sign_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		graph_PF.ClickGraph();
	}

	@When("The Graph user clicks {string} link")
	public void the_user_clicks_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
		if (string.equals("Practice Questions"))
		{
			graph_PF.ClickSubGraph();
		}
		if (string.equals("Graph"))
		{			
			graph_PF.ClickGraph2(string);
		}
		else
		{
			graph_PF.ClickText(string);	
		}
	}

	@Then("The Graph user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = graph_PF.getTitle();
		Assert.assertEquals(string, msg);
	}

	@Given("The Graph user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		graph_PF.ClickGraph();
		if (string.equals("Graph"))
		{
			graph_PF.ClickGraph2(string);
		}
		else
		{
			graph_PF.ClickText(string);	
		}
	}

	@When("The Graph user clicks {string} button in {string} page")
	public void the_user_clicks_button_in_page(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions		
		graph_PF.ClickTryEditor();
	}

	@Then("The Graph user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    // Write code here that turns the phrase above into concrete actions
		String msg = graph_PF.getTitle();
		Assert.assertEquals("Assessment", msg);		
	}

	@Given("The Graph user is in the tryEditor page in {string} page")
	public void the_user_is_in_the_try_editor_page(String string) {
	    // Write code here that turns the phrase above into concrete actions		
		graph_PF.ClickGraph();				
		if (string.equals("Graph"))
		{			
			graph_PF.ClickGraph2(string);
		}
		else
		{
			graph_PF.ClickText(string);	
		}
		graph_PF.ClickTryEditor();
	}

	@When("The Graph user write the invalid code in Editor and click the Run Button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		graph_PF.PythonCode("Hello");
        graph_PF.ClickBtnRun();		
	}

	@Then("The Graph user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
		String alertMsg = graph_PF.AlertMsg();
		Assert.assertTrue(alertMsg.contains("NameError:"));	
		graph_PF.Alertaccept();
	}

	@When("The Graph user write the valid code in Editor and click the Run Button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		graph_PF.PythonCode("print(\"Hello\")");        
		graph_PF.ClickBtnRun();
	}

	@Then("The Graph user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions		
		Assert.assertEquals("Hello", graph_PF.getOPMsg());
	}
	
	@When("The Graph user clicks the Run Button without entering the code in the Editor")
	public void the_graph_user_clicks_the_run_button_without_entering_the_code_in_the_editor() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		graph_PF.PythonCode("");        
		graph_PF.ClickBtnRun();
	}
	

    @When("Graph User enters data from Excel {string} in {string}")
    public void user_enters_data_from_excel(String SheetName, String Page) throws IOException {      
        List<Object[]> editorData = ExcelReader.readExcelData(SheetName);
        for (Object[] row : editorData) { 
       	 	inputText = (String) row[0];
       	    expectedOutput = (String) row[1];         
       	    performEditorTest(inputText, expectedOutput, Page);
       	 }
    }

    @Then("The Graph editor should display Expected Text")
    public void the_editor_should_display() {
        // Assert the expected output
    	
    }

    private void performEditorTest(String inputText, String expectedOutput, String Page) {
        //Implementation of the textbox editor test.
    	graph_PF.PythonCode(inputText);        
		graph_PF.ClickBtnRun();
		
		if (expectedOutput.equals("AlertMessage"))
	   	{			
	    	String alertMsg = graph_PF.AlertMsg();	    	
			Assert.assertTrue(alertMsg.contains("NameError:"));	 
			graph_PF.Alertaccept();
	   	}
    	else
    	{
	    	Assert.assertEquals(expectedOutput, graph_PF.getOPMsg());
	   	}
		
		graph_PF.openHome();
		graph_PF = new Graph();
		the_user_is_in_the_try_editor_page(Page);
				
    }	

}
