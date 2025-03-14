package dsAlgo_PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgo_DriverFactory.DriverFactory;

public class Queue {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public Queue()
	 {
		driver = DriverFactory.getDriverInstance();
		PageFactory.initElements(driver, this);
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
	  
	 @FindBy(xpath ="//a[@href='queue']")
	 @CacheLookup
	 WebElement Queue;
	 
	 @FindBy(xpath ="//a[@href='QueueOp']")
	 @CacheLookup
	 WebElement QueueOP;
	 	 
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
	 	   
	 public String getTitle() {
			return driver.getTitle();
	 }
	 
	 public void openHome() {
		 driver.get("https://dsportalapp.herokuapp.com/home");
	 }
	 
	 public void openLogin() {
		 driver.get("https://dsportalapp.herokuapp.com/login");
	 }
	 
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
		 wait.until(ExpectedConditions.visibilityOf(TryEditor)).click();
	 }
	 
	 public void ClickBtnRun() {
		 wait.until(ExpectedConditions.visibilityOf(btnRun)).click();
	 }
	 
	 public void ClickQueue() {		 
		 wait.until(ExpectedConditions.visibilityOf(Queue)).click();
	 }
	 
	 public void ClickQueueOP() {
		 QueueOP.click();
	 }
	 
	 public void ClickText(String string) {
		 String dynamicPath = String.format("//a[text()='%s']", string);
		 dynamicLink = driver.findElement(By.xpath(dynamicPath));
		 dynamicLink.click();
	 }
	  
	 public void PythonCode(String string) {
		 Actions actions = new Actions(driver);
	     actions.moveToElement(CodeMirror).click().sendKeys(string).build().perform();
	 }
	 
	 public String AlertMsg() {
		 return driver.switchTo().alert().getText();
	 }
	 
	 public void Alertaccept() {
		 driver.switchTo().alert().accept();
	 }
	 
	 public String getOPMsg() {
		   return consoleOP.getText();  
		 }

}
