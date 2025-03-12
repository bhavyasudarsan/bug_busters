package dsAlgo_StepDefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
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

import dsAlgo_PageObjects.Queue;
import dsAlgo_Utilities.ExcelReader;

public class Queue_SD{
	
	WebDriver driver;	
	public Queue queue_PF;
	String inputText;
	String expectedOutput;
		
	public Queue_SD() {        
        this.driver = DriverFactory.getDriver();   
        queue_PF = new Queue(driver);
    }
	
	@Given("Queue User Launches DsAlgo portal")
	public void queue_user_launches_ds_algo_portal() {
	    // Write code here that turns the phrase above into concrete actions
		//WebDriverManager.chromedriver().setup();
		driver.get("https://dsportalapp.herokuapp.com/login");		
		queue_PF.SetUserName("bugbusters");
		queue_PF.SetPassword("Team@bug");
		queue_PF.ClickBtnLogin();		 
	}
	
	@Given("The Queue user is in the Main page after Sign in")
	public void the_queue_user_is_in_the_home_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The Queue user clicks the {string} button in Queue")
	public void the_user_clicks_the_button_in_queue(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		queue_PF.ClickQueue();
	}

	@Then("The Queue user should land in {string}")
	public void the_user_should_land_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = driver.getTitle();
		Assert.assertEquals(string, msg);
	}

	@Given("The Queue user is in the {string} page")
	public void the_user_is_in_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		if (string.equals("Queue"))
		{			
			queue_PF.ClickQueue();
		}
		else
		{
			queue_PF.ClickQueue();
			queue_PF.ClickText(driver, string);			
		}
	}

	@When("The Queue user click {string} link")
	public void the_user_click_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
		if (string.equals("Practice Questions"))
		{			
			queue_PF.ClickQueueOP();
		}
		queue_PF.ClickText(driver, string);		
	}

	@Then("The Queue user should be redirected to {string} Page")
	public void the_user_should_be_redirected_to_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = driver.getTitle();		
		Assert.assertEquals(string, msg);
	}

	@Given("The Queue user is in the tryEditor page in {string} page")
	public void the_queue_user_is_in_the_try_editor_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		queue_PF.ClickQueue();		
		queue_PF.ClickText(driver, string);
		queue_PF.ClickTryEditor();		
	}

	@When("The Queue user write the invalid code in Editor and click the Run Button")
	public void the_queue_user_write_the_invalid_code_in_editor_and_click_the_run_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		queue_PF.PythonCode(driver, "Hello");
        Thread.sleep(500);
        queue_PF.ClickBtnRun();
        Thread.sleep(500);
	}

	@Then("The Queue user should able to see an error message in alert window")
	public void the_queue_user_should_able_to_see_an_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
		String alertMsg = driver.switchTo().alert().getText();
		Assert.assertTrue(alertMsg.contains("NameError:"));	
	}
	
	@When("The Queue user write the valid code in Editor and click the Run Button")
	public void the_queue_user_write_the_valid_code_in_editor_and_click_the_run_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		queue_PF.PythonCode(driver, "print(\"Hello\")");        
		Thread.sleep(500);
		queue_PF.ClickBtnRun();
		Thread.sleep(500);
	}

	@Then("The Queue user should able to see output in the console")
	public void the_queue_user_should_able_to_see_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions		
		Assert.assertEquals("Hello", queue_PF.getOPMsg());
	}
	
	
	
	@Then("The Queue user should be redirected to a page having an {string} Page")
	public void the_user_should_be_redirected_to_a_page_having_an_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = driver.getTitle();
		Assert.assertEquals("Assessment", msg);
	}
	
	@When("The Queue user click {string} button")
	public void the_user_clicks_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		queue_PF.ClickTryEditor();
	}
	
	@When("The Queue user clicks the Run Button without entering the code in the Editor")
	public void the_queue_user_clicks_the_run_button_without_entering_the_code_in_the_editor() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		queue_PF.PythonCode(driver, "");        
		Thread.sleep(500);
		queue_PF.ClickBtnRun();
		Thread.sleep(500);
	}
	
	@When("Queue User enters data from Excel {string} for Row {string}")
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

    @Then("The Queue editor should display Expected Text")
    public void the_editor_should_display() {
        // Assert the expected output
    	if (expectedOutput.equals("AlertMessage"))
	   	{
	    	String alertMsg = driver.switchTo().alert().getText();
			Assert.assertTrue(alertMsg.contains("NameError:"));	    	
	   	}
    	else
    	{
	    	Assert.assertEquals(expectedOutput, queue_PF.getOPMsg());
	   	}
    }

    private void performEditorTest(String inputText) throws InterruptedException{
        //Implementation of the textbox editor test.
    	queue_PF.PythonCode(driver, inputText);        
		Thread.sleep(500);
		queue_PF.ClickBtnRun();
		Thread.sleep(500);
    }
	
}
