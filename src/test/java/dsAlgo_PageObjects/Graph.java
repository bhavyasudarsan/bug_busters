package dsAlgo_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graph {
	
	public Graph (WebDriver webDriver)
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
	  
	 @FindBy(xpath ="//a[@href='graph']")
	 @CacheLookup
	 WebElement Graph1;
	 
	 @FindBy(xpath ="//a[@href='/tryEditor']")
	 @CacheLookup
	 WebElement TryEditor;
	 
	 @FindBy(xpath ="//button[text()='Run']")
	 @CacheLookup
	 WebElement btnRun;
	 
	 @FindBy(xpath ="//div[@class='CodeMirror-code']")
	 @CacheLookup
	 WebElement CodeMirror;
	 
	 @FindBy(xpath ="//pre[@id='output']")
	 @CacheLookup
	 WebElement consoleOP;
	 
	   
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
	 
	 public void ClickTryEditor() {
		 TryEditor.click();
	 }
	 
	 public void ClickBtnRun() {
		 btnRun.click();
	 }

}
