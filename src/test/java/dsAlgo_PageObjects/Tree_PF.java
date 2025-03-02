package dsAlgo_PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tree_PF  {
	
	 public Tree_PF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	WebDriverWait wait;
	 
	@FindBy(linkText = "Get Started")WebElement getStarted;
	@FindBy(linkText = "Sign in")WebElement signIn;
	@FindBy(id= "id_username")WebElement userName;
	@FindBy(id= "id_password")WebElement password;
	@FindBy(xpath= "//*[@value='Login']")WebElement login;
	@FindBy(xpath="//*[@class ='alert alert-primary']")WebElement loginStatus;
	@FindBy(xpath= "/html/body/div[3]/div[6]/div/div/a")WebElement tree;
	@FindBy(linkText= "Overview of Trees")WebElement overviewOfTrees;
	
	public void getStart(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		getStarted.click();
	}
	public void signIn() {
		signIn.click();
	}
	
	public void enterCredentials(String loginName,String loginPassword) {
		
		userName.sendKeys(loginName);
		password.sendKeys(loginPassword);  
		
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public String getStatus() {
		
		return loginStatus.getText();
		
	}
	
	public void treeGetStrated(WebDriver driver) {
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tree);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(tree)).click();
		
	
	}
		public void overviewOfTrees(WebDriver driver) {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overviewOfTrees);
			wait.until(ExpectedConditions.visibilityOf(overviewOfTrees)).click();
		}
		 
	
	
	

}
