package dsAlgo_PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	 WebDriverWait wait;
	
	 public Login (WebDriver webDriver)
	 {
	  PageFactory.initElements(webDriver, this);
	  wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
	 }
	 
	 @FindBy(xpath="//input[@name='username']")
	 @CacheLookup
	 WebElement inputUsername;
	 
	 @FindBy(xpath ="//input[@name='password']")
	 @CacheLookup
	 WebElement inputPassword;
	 
	 @FindBy(xpath="//input[@type='submit']")
	 @CacheLookup
	 WebElement btnLogin; 
	 
	 @FindBy(xpath="//*[text()='Sign in']")
	 @CacheLookup
	 WebElement SignIn;	
	 
	 @FindBy(xpath="//*[text()='Sign out']")
	 @CacheLookup
	 WebElement SignOut;
	
	 @FindBy(xpath="//div[@class='alert alert-primary']")
	 @CacheLookup
	 WebElement Alertmsg;
	 
	   
	 public void SetUserName(String uName) {
	  inputUsername.clear();
	  inputUsername.sendKeys(uName);
	 }
	 
	  
	 public void SetPassword(String pwd) {
	  inputPassword.clear();
	  inputPassword.sendKeys(pwd);
	 }  
	 
	 public void ClickBtnLogin() {
	  btnLogin.click();
	 }
	 

	 public String getErrMsg() {
	   return Alertmsg.getText();  
	 }
	 	 
	 public void ClickSignIn() {
		  SignIn.click();
		 }
	 
	 public void ClickSignOut() {
		 wait.until(ExpectedConditions.elementToBeClickable(SignOut)).click(); 
		 }
}
