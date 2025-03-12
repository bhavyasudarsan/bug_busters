package dsAlgo_StepDefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgo_DriverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.core.cli.Main;
import io.github.bonigarcia.wdm.WebDriverManager;

import dsAlgo_PageObjects.Graph;
import dsAlgo_PageObjects.Queue;
import dsAlgo_Utilities.ExcelReader;

public class Graph_SD {
	
	WebDriver driver;
	public Graph graph_PF;
	String inputText;
	String expectedOutput;
	
	public Graph_SD() {        
        this.driver = DriverFactory.getDriver();   
        graph_PF = new Graph(driver);
    }
	
	@Given("Graph User Launches DsAlgo portal")
	public void graph_user_launches_ds_algo_portal() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver.get("https://dsportalapp.herokuapp.com/login");
		driver.manage().window().maximize();
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
		String msg = driver.getTitle();
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
			graph_PF.ClickGraph2(driver, string);
		}
		else
		{
			graph_PF.ClickText(driver, string);			
		}
	}

	@Then("The Graph user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = driver.getTitle();
		Assert.assertEquals(string, msg);
	}

	@Given("The Graph user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@href='graph']")).click();
		if (string.equals("Graph"))
		{
			graph_PF.ClickGraph2(driver, string);
		}
		else
		{
			graph_PF.ClickText(driver, string);	
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
		String msg = driver.getTitle();
		Assert.assertEquals("Assessment", msg);		
	}

	@Given("The Graph user is in the tryEditor page in {string} page")
	public void the_user_is_in_the_try_editor_page(String string) {
	    // Write code here that turns the phrase above into concrete actions		
		graph_PF.ClickGraph();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));		
		if (string.equals("Graph"))
		{			
			graph_PF.ClickGraph2(driver, string);
		}
		else
		{
			graph_PF.ClickText(driver, string);			
		}
		graph_PF.ClickTryEditor();
	}

	@When("The Graph user write the invalid code in Editor and click the Run Button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		graph_PF.PythonCode(driver, "Hello");
        Thread.sleep(500);
        graph_PF.ClickBtnRun();		
		Thread.sleep(500);
	}

	@Then("The Graph user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
		String alertMsg = driver.switchTo().alert().getText();
		Assert.assertTrue(alertMsg.contains("NameError:"));	
	}

	@When("The Graph user write the valid code in Editor and click the Run Button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		graph_PF.PythonCode(driver, "print(\"Hello\")");        
		Thread.sleep(500);
		graph_PF.ClickBtnRun();
		Thread.sleep(500);
	}

	@Then("The Graph user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions		
		Assert.assertEquals("Hello", graph_PF.getOPMsg());
	}
	
	@When("The Graph user clicks the Run Button without entering the code in the Editor")
	public void the_graph_user_clicks_the_run_button_without_entering_the_code_in_the_editor() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		graph_PF.PythonCode(driver, "");        
		Thread.sleep(500);
		graph_PF.ClickBtnRun();
		Thread.sleep(500);
	}
	

    @When("Graph User enters data from Excel {string} for Row {string}")
    public void user_enters_data_from_excel(String filePath, String RowNo) throws IOException, InterruptedException {      
        List<Object[]> editorData = ExcelReader.readExcelData(filePath, "Sheet1");
        int index = 1;
        for (Object[] row : editorData) { 
       	 if (index == Integer.parseInt(RowNo))
       	 {
       		inputText = (String) row[0];
       	    expectedOutput = (String) row[1];         
       	    performEditorTest(inputText);
       	 }
       	 index++;
        }
    }

    @Then("The Graph editor should display Expected Text")
    public void the_editor_should_display() {
        // Assert the expected output
    	if (expectedOutput.equals("AlertMessage"))
	   	{
	    	String alertMsg = driver.switchTo().alert().getText();
			Assert.assertTrue(alertMsg.contains("NameError:"));	    	
	   	}
    	else
    	{
	    	Assert.assertEquals(expectedOutput, graph_PF.getOPMsg());
	   	}
    }

    private void performEditorTest(String inputText) throws InterruptedException{
        //Implementation of the textbox editor test.
    	graph_PF.PythonCode(driver, inputText);        
		Thread.sleep(500);
		graph_PF.ClickBtnRun();
		Thread.sleep(500);
    }	

}
