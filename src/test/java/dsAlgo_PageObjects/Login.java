package dsAlgo_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	 public Login (WebDriver webDriver)
	 {
	  PageFactory.initElements(webDriver, this);
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
	 
	  
	 @FindBy(xpath="//div[contains(text(),'The email')]")
	 @CacheLookup
	 WebElement divErrorMsgUN;
	 
	   
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
	 

	 public String getErrMsgUN() {
	   return divErrorMsgUN.getText();  
	 }
}
