package dsAlgo_PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Array_PF {
	
	public Array_PF(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait;
	
	@FindBy(linkText = "Get Started")
	WebElement getStart;
	@FindBy(linkText = "Sign in")
	WebElement signIn;
	@FindBy(id = "id_username")
	WebElement userName;
	@FindBy(id = "id_password")
	WebElement password;
	@FindBy(xpath = "//*[@value='Login']")
	WebElement login;
	@FindBy(xpath = "//*[@class ='alert alert-primary']")
	WebElement loginStatus;
	
	@FindBy(xpath="/html/body/div[3]/div[2]/div/div/a")WebElement arrayGetStarted;
	@FindBy(linkText="Arrays in Python")WebElement arraysInPython;
	@FindBy(linkText="Try here>>>")WebElement arraysInPythonTryHere;
	
	
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
	
	public void arrayGetStarted(WebDriver driver){
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(arrayGetStarted)).click();
		
	}
	
	public void arraysInPython(WebDriver driver) {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arraysInPython);		
		wait.until(ExpectedConditions.elementToBeClickable(arraysInPython)).click();
	
	}
	
	public void arraysInPythonTryHere(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arraysInPythonTryHere);
		wait.until(ExpectedConditions.elementToBeClickable(arraysInPythonTryHere)).click();
	}
}
