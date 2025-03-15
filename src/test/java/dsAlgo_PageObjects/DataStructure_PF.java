package dsAlgo_PageObjects;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgo_DriverFactory.DriverFactory;

public class DataStructure_PF {
	
	WebDriver driver ;
	WebDriverWait wait;

	public DataStructure_PF() {
		
		driver=DriverFactory.getDriverInstance();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Get Started")WebElement getStart;
	@FindBy(linkText = "Sign in")WebElement signIn;
	@FindBy(id = "id_username")WebElement userName;
	@FindBy(id = "id_password")WebElement password;
	@FindBy(xpath = "//*[@value='Login']")WebElement btnlogin;
	@FindBy(xpath = "//*[@class ='alert alert-primary']")WebElement loginStatus;
	
	@FindBy(xpath = "//a[@href='data-structures-introduction']")WebElement data_structureGetSatrted;
	@FindBy(xpath = "//a[@href='/data-structures-introduction/practice']")WebElement practiceQuestion;
	@FindBy(xpath = "//a[@href='time-complexity']")WebElement timeComplexity;
	@FindBy(linkText="Try here>>>")WebElement timeComplexityTryhere;
	
	@FindBy(xpath = "//div[@class='CodeMirror-code']")WebElement textEditor;
	@FindBy(xpath = "//pre[@id='output']")WebElement console;
	@FindBy(xpath = "//button[text()='Run']")WebElement runButton;

	public void getStart() {
		
		getStart.click();
	}

	public void signIn() {
		
		signIn.click();
	}

	public void enterCredentials(String loginName, String loginPassword) {

		userName.sendKeys(loginName);
		password.sendKeys(loginPassword);
	}

	public void clickLogin() {
		
		btnlogin.click();
	}

	public String getStatus() {

		return loginStatus.getText();
	}

	public void data_structureGetSatrted() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(data_structureGetSatrted)).click();
	}
	
	public void practiceQuestion() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(practiceQuestion)).click();
	}

	public void timeComplexity() {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		timeComplexity.click();
	}
	
	public void timeComplexityTryhere() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		timeComplexityTryhere.click();
	}  
	
	public void textEditorWithNoData() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		Actions actions = new Actions(driver);
        actions.moveToElement(textEditor).click().sendKeys(" ").build().perform();
		runButton.click();
	}  
	
	public void textEditorWithInvalidData() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		Actions actions = new Actions(driver);
        actions.moveToElement(textEditor).click().sendKeys("Hello").build().perform();
		runButton.click();
	}  
	public void textEditorWithValiddData() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		
		Actions actions = new Actions(driver);
        actions.moveToElement(textEditor).click().sendKeys("print(\"Hello\")").build().perform();
		runButton.click();
	} 
	public String getStatusTextEditor() {
		
		return console.getText();
	}
	
	public String alertMessage() {
		
		String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alertMessage;
	}
	
	public String getTitle() {
		
		return driver.getTitle();
		
	}

}

