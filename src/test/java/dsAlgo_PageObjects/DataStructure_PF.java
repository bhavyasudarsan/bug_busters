package dsAlgo_PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataStructure_PF {
	

	public DataStructure_PF(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait;

	@FindBy(linkText = "Get Started")WebElement getStart;
	@FindBy(linkText = "Sign in")WebElement signIn;
	@FindBy(id = "id_username")WebElement userName;
	@FindBy(id = "id_password")WebElement password;
	@FindBy(xpath = "//*[@value='Login']")WebElement login;
	
	@FindBy(xpath = "//*[@class ='alert alert-primary']")WebElement loginStatus;
	@FindBy(xpath = "//a[@href='data-structures-introduction']")WebElement data_structureGetSatrted;
	@FindBy(xpath = "//a[@href='time-complexity']")WebElement timeComplexity;
	@FindBy(linkText="Try here>>>")WebElement timeComplexityTryhere;

	public void getStart(WebDriver driver) {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
		
		login.click();
	}

	public String getStatus() {

		return loginStatus.getText();
	}

	public void data_structureGetSatrted(WebDriver driver) {

		data_structureGetSatrted.click();
	}

	public void timeComplexity(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		timeComplexity.click();
	}
	
	public void timeComplexityTryhere(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)", "");
		timeComplexityTryhere.click();
	}  

}

