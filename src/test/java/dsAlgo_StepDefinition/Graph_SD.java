package dsAlgo_StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.core.cli.Main;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Graph_SD {
WebDriver driver = new ChromeDriver();
	
	@Given("User Launches DsAlgo portal")
	public void user_launches_ds_algo_portal() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver.get("https://dsportalapp.herokuapp.com/login");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bugbusters");
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Team@bug");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	@When("The user clicks the {string} button in Graph Panel")
	public void the_user_clicks_the_button_in_graph_panel(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@href='graph']")).click();
	}

	@Then("The user be directed to {string} Page")
	public void the_user_be_directed_to_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = driver.getTitle();
		Assert.assertEquals(string, msg);		
		driver.quit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@When("The user select Graph item from the drop down menu")
	public void the_user_select_graph_item_from_the_drop_down_menu() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[@class='nav-item dropdown']")).click();
		driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a[@href='/graph']")).click();
	}

	@Given("The user is in the {string} page after Sign in")
	public void the_user_is_in_the_page_after_sign_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@href='graph']")).click();
	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
		if (string.equals("Practice Questions"))
		{
			driver.findElement(By.xpath("//a[@href='graph']")).click();
		}
		if (string.equals("Graph"))
		{
			driver.findElement(By.xpath("(//a[text()='" + string + "'])[2]")).click();
		}
		else
		{
			driver.findElement(By.xpath("//a[text()='" + string + "']")).click();
		}
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		String msg = driver.getTitle();
		Assert.assertEquals(string, msg);
		driver.quit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@Given("The user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@href='graph']")).click();
		if (string.equals("Graph"))
		{
			driver.findElement(By.xpath("(//a[text()='" + string + "'])[2]")).click();
		}
		else
		{
			driver.findElement(By.xpath("//a[text()='" + string + "']")).click();
		}
	}

	@When("The user clicks {string} button in {string} page")
	public void the_user_clicks_button_in_page(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@href='/tryEditor']")).click();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	    // Write code here that turns the phrase above into concrete actions
		String msg = driver.getTitle();
		Assert.assertEquals("Assessment", msg);
		driver.quit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@href='graph']")).click();
		driver.findElement(By.xpath("//a[@href='graph']")).click();
		driver.findElement(By.xpath("//a[@href='/tryEditor']")).click();
	}

	@When("The user write the invalid code in Editor and click the Run Button")
	public void the_user_write_the_invalid_code_in_editor_and_click_the_run_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement text = driver.findElement(By.xpath("//div[@class='CodeMirror-code']"));
		Actions actions = new Actions(driver);
        actions.moveToElement(text).click().sendKeys("Hello").build().perform();
        Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Run']")).click();
		Thread.sleep(500);
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
		String alertMsg = driver.switchTo().alert().getText();
		Assert.assertTrue(alertMsg.contains("NameError:"));		
		driver.quit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@When("The user write the valid code in Editor and click the Run Button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions 
		WebElement text = driver.findElement(By.xpath("//div[@class='CodeMirror-code']"));
		Actions actions = new Actions(driver);
        actions.moveToElement(text).click().sendKeys("print(\"Hello\")").build().perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Run']")).click();
		Thread.sleep(500);
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement msg = driver.findElement(By.xpath("//pre[@id='output']"));
		Assert.assertEquals("Hello", msg.getText());
		driver.quit();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

}
