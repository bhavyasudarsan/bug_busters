package dsAlgo_PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register_PF {
	
public Register_PF(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait;

	@FindBy(linkText = "Get Started")WebElement getStart;
	@FindBy(linkText = "Register")WebElement registerlink;
	@FindBy(id = "id_username")WebElement userName;
//	String un=userName.getText("value");
	WebElement userName=driver.fin
	
	@FindBy(id = "id_password1")WebElement password1;
	@FindBy(id = "id_password2")WebElement password2;
	@FindBy(xpath = "//*[@value='Register']")WebElement btnRegister;
	
//	@FindBy(xpath = "//*[@class ='alert alert-primary']")WebElement registerStatus;
/*	@FindBy(xpath = "//a[@href='data-structures-introduction']")WebElement data_structureGetSatrted;
	@FindBy(xpath = "//a[@href='time-complexity']")WebElement timeComplexity;
	@FindBy(linkText="Try here>>>")WebElement timeComplexityTryhere;  */

	public void getStart(WebDriver driver) {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		getStart.click();
	}

	public void registerlink() {
		
		registerlink.click();
	}

	public void enterCredentials(String loginName, String loginPassword1,String loginPassword2) {

		userName.sendKeys(loginName);
		password1.sendKeys(loginPassword1);
		password2.sendKeys(loginPassword2);
	}

	public void btnRegister(WebDriver driver) {
		
		if((userName==null)&&(password1==null)&&(password2==null))
		{
			System.out.println("empty field");
			
			driver.switchTo().alert().sendKeys("Text");
			btnRegister.click();
					
		}
		else if ((userName=="bugbusters")&&(password1==null)&&(password2==null))
		{
			
			System.out.println(" field not empty");
		}
	}

/*	public String getStatus() {

		return registerStatus.getText();
	}

/*	public void data_structureGetSatrted(WebDriver driver) {

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
	}  */

}
