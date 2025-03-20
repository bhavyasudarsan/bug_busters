package dsAlgo_StepDefinition;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import dsAlgo_PageObjects.Graph;
import dsAlgo_Utilities.ExcelReader;

public class Graph_SD {
	private static final Logger logger = LoggerFactory.getLogger(Graph_SD.class);	
	public Graph graph_PF;
	String inputText;
	String expectedOutput;
	
	public Graph_SD() {
        graph_PF = new Graph();
    }
	
	@Given("The user is in the Main page after Sign in for Graph")
	public void the_graph_user_is_in_the_home_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
		logger.info("User is in the Main Page");
	}
	
	@When("The user clicks the {string} button in Graph Panel")
	public void the_graph_user_clicks_the_button_in_graph_panel(String string) {
	    // Write code here that turns the phrase above into concrete actions
		graph_PF.ClickGraph();		
	}

	@Then("The user should be directed to {string} Page for Graph")
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

	@Given("The user is in the {string} page after Sign in for Graph")
	public void the_user_is_in_the_page_after_sign_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		graph_PF.ClickGraph();
	}

	@When("The user clicks {string} link for Graph")
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

	@Given("The user is on the {string} page for Graph")
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

	@When("The user clicks Try Here button in Graph page")
	public void the_user_clicks_button_in_page() {
	    // Write code here that turns the phrase above into concrete actions		
		graph_PF.ClickTryEditor();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test for Graph")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    // Write code here that turns the phrase above into concrete actions
		String msg = graph_PF.getTitle();
		Assert.assertEquals("Assessment", msg);		
	}
	
	@Given("The user is in the tryEditor page in Graph page")
	public void the_user_is_in_the_try_editor_page_in_Graph_page() {
	    // Write code here that turns the phrase above into concrete actions		
		graph_PF.ClickGraph();	
		graph_PF.ClickGraph2("Graph");		
		graph_PF.ClickTryEditor();
	}
	
	@Given("The user is in the tryEditor page in Graph Representations page")
	public void the_user_is_in_the_try_editor_page_in_GP_page() {
	    // Write code here that turns the phrase above into concrete actions		
		graph_PF.ClickGraph();	
		graph_PF.ClickText("Graph Representations");
		graph_PF.ClickTryEditor();
	}

	@Given("The user is in the tryEditor page in {string} page for Graph")
	public void the_user_is_in_the_try_editor_page_in_page(String Page) {
	    // Write code here that turns the phrase above into concrete actions		
		graph_PF.ClickGraph();	
		if (Page.equals("Graph"))
		{
			graph_PF.ClickGraph2(Page);
		}
		else
		{
			graph_PF.ClickText(Page);
		}
		graph_PF.ClickTryEditor();
	}

	@When("The user write the invalid code in Editor and click the Run Button for Graph")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		graph_PF.PythonCode("Hello");
        graph_PF.ClickBtnRun();		
	}

	@Then("The user should able to see an error message in alert window for Graph")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
		String alertMsg = graph_PF.AlertMsg();
		Assert.assertTrue(alertMsg.contains("NameError:"));	
		logger.info(alertMsg);
		graph_PF.Alertaccept();
	}

	@When("The user write the valid code in Editor and click the Run Button for Graph")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		graph_PF.PythonCode("print(\"Hello\")");        
		graph_PF.ClickBtnRun();
	}

	@Then("The user should able to see output in the console for Graph")
	public void the_user_should_able_to_see_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions		
		Assert.assertEquals(expectedOutput, graph_PF.getOPMsg());
	}
	
	@When("The user clicks the Run Button without entering the code in the Editor for Graph")
	public void the_graph_user_clicks_the_run_button_without_entering_the_code_in_the_editor() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		graph_PF.PythonCode("");        
		graph_PF.ClickBtnRun();
	}
	

    @When("User enters data from Excel {string} and {int} for Graph")
    public void user_enters_data_from_excel_and_in_graph(String SheetName, Integer RowNo) throws IOException {      
        List<Object[]> editorData = ExcelReader.readExcelData(SheetName);       
        if (RowNo <= editorData.size()) 
        { 
        	Object[] row = editorData.get(RowNo-1); // Access the desired row directly
       	 	inputText = (String) row[0];
       	    expectedOutput = (String) row[1];         
       	    performEditorTest(inputText, expectedOutput);
       	}
    }

    private void performEditorTest(String inputText, String expectedOutput) {
        //Implementation of the textbox editor test.
    	graph_PF.PythonCode(inputText);        
		graph_PF.ClickBtnRun();				
    }	

}
