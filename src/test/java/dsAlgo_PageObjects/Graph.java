package dsAlgo_PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	 
	 @FindBy(xpath ="//a[@href='graph']")
	 @CacheLookup
	 WebElement Graph2;
	 
	 @FindBy(xpath ="//div[@class='nav-item dropdown']")
	 @CacheLookup
	 WebElement DropDown;
	 
	 @FindBy(xpath ="//div[@class='dropdown-menu show']/a[@href='/graph']")
	 @CacheLookup
	 WebElement DropDownGraph;
	  
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
	 
	 @FindBy(xpath = "//a[text()='%s']")
	 WebElement dynamicLink;	  
	   
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
	 
	 public void ClickGraph() {
		 Graph1.click();
	 }
	 
	 public void ClickSubGraph() {
		 Graph2.click();
	 }
	 
	 public void ClickDropDownGraph() {
		 DropDown.click();
		 DropDownGraph.click();
	 }
	 
	 public void ClickTryEditor() {
		 TryEditor.click();
	 }
	 
	 public void ClickBtnRun() {
		 btnRun.click();
	 }
	 
	 public void ClickText(WebDriver driver, String string) {		 
		 String dynamicPath = String.format("//a[text()='%s']", string);
		 dynamicLink = driver.findElement(By.xpath(dynamicPath));
		 dynamicLink.click();
	 }
	 
	 public void ClickGraph2(WebDriver driver, String string) {		 
		 String dynamicPath = String.format("(//a[text()='%s'])[2]", string);
		 dynamicLink = driver.findElement(By.xpath(dynamicPath));
		 dynamicLink.click();
	 }
	 
	 public void PythonCode(WebDriver driver, String string) {
		 Actions actions = new Actions(driver);
	     actions.moveToElement(CodeMirror).click().sendKeys(string).build().perform();
	 }
	 
	 public String getOPMsg() {
		   return consoleOP.getText();  
		 }

}
