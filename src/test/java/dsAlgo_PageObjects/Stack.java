package dsAlgo_PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgo_DriverFactory.DriverFactory;

public class Stack {
	WebDriverWait wait;
	WebDriver driver;
	
	public Stack() {
		driver=  DriverFactory.getDriverInstance();
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath = "//div[@class='nav-item dropdown']")
	WebElement dropdownMenu;

	@FindBy(xpath = "//a[text()='Stack']")
	WebElement selectStackFromDropdoMenu;

	@FindBy(xpath = "//button[@class='btn']")
	WebElement getStartBtn;

	@FindBy(xpath = "//a[text()='Sign in']")
	WebElement signIn;

	@FindBy(xpath = "//div[@class='bs-example']")
	WebElement loginPage;

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(name = "password")
	WebElement passWord;

	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement login;

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement status;

	@FindBy(xpath = "//h5[text()='Stack']/../a")
	WebElement getStartedStackBtn;

	@FindBy(xpath = "//div[@class='nav-item dropdown']")
	WebElement dropdownMenuStack;
	@FindBy(xpath = "//title[text()='NumpyNinja']")
	WebElement titleHome;

	@FindBy(xpath = "//a[text()='Stack']")
	WebElement selectStackFromDropdownMenu;

	@FindBy(xpath = "//h4[@class='bg-secondary text-white']")
	WebElement title;

	@FindBy(xpath = "//a[@href='introduction']")
	WebElement introduction;

	@FindBy(xpath = "//a[text()='Operations in Stack']")
	WebElement operationLinkBtn;
	@FindBy(xpath = "//p[text()='Operations in Stack']")
	WebElement operationInStackPageIdentifier;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryHereBtn;
	@FindBy(xpath = "//button[text()='Run']")
	WebElement runBtn;
	@FindBy(xpath = "//div[@class='CodeMirror cm-s-default']\r\n")
	WebElement tryEditor;
	@FindBy(xpath = "//div[@class='CodeMirror-code']")
	WebElement tryEditorInput;
	@FindBy(xpath = "//pre[@id='output']")
	public WebElement tryEditorConsole;
	
	@FindBy(xpath = "//a[text()='Implementation']")
	WebElement linkImplementation;
	@FindBy(xpath = "//p[text()='Implementation']")
	WebElement implementationPageIdentifier;
	
	@FindBy(xpath = "//a[text()='Applications']")
	WebElement linkApplication;
	@FindBy(xpath = "//p[text()='Applications']")
	WebElement applicationsPageIdentifier;
	
	
	public void ClickGetStBtn() {
		getStartBtn.click();
	}

	public void SignBtn() {

		signIn.click();
	}

	public void Login() {
		signIn.click();
	}

	public void openURL(String url) {
		signIn.click();
	}

	public void dropDownStack() {
		dropdownMenu.click();
	}

	public void dropDownSelectStack() {
		selectStackFromDropdoMenu.click();
	}

	public void Username() {
		userName.sendKeys("bugbusters");
	}

	public void Password() {
		passWord.sendKeys("Team@bug");
	}

	public void Loginbtn() {
		login.click();
	}

	public void signInbtnWithWait() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(signIn)).click();

	}

	public void clickGetStartedStackBtn() {
		getStartedStackBtn.click();
	}

	public String statusMessage() {
		return status.getText();
	}

	public void dropdownMenuClick() {
		dropdownMenu.click();
	}

	public void dropdownMenuStackClick() {
		dropdownMenu.click();
	}

	public void clickStackFromDropdown() {
		selectStackFromDropdownMenu.click();
	}

	public String titleStack() {
		return title.getText();
	}

	public String titleHome() {
		return title.getText();
	}

	public void operationLinkBtnClick() {
		operationLinkBtn.click();
	}

	public String stackPageIdentify() {
		return operationInStackPageIdentifier.getText();
	}

	public void tryHereBtnClick() {
		tryHereBtn.click();
	}

	public void runBtnClick() {
		runBtn.click();
	}

	public String runBtnText() {
		return runBtn.getText();
	}

	public String alertMessage() {

		return driver.switchTo().alert().getText();
	}

	public void inputEditorInvalid() {

		Actions actions = new Actions(driver);
		actions.moveToElement(tryEditorInput).click().sendKeys("hii").build().perform();

	}

	public void inputEditorValid() {

		Actions actions = new Actions(driver);
		actions.moveToElement(tryEditorInput).click().sendKeys("print 'hello'").build().perform();

	}

	public String console() {
		return tryEditorConsole.getText();
	}

	public void linkImplementationClick() {
		linkImplementation.click();
	}

	public String implementationPageIdentify() {
		return implementationPageIdentifier.getText();
	}

	public void linkApplicationClick() {
		linkApplication.click();
	}

	public String applicationPageIdentify() {
		return applicationsPageIdentifier.getText();
	}
	public void tryEditorPage() {
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	}
	
	public void currentURL() {
		driver.getCurrentUrl();

	}	
	public void getUrl() {
		driver.get("https://dsportalapp.herokuapp.com/");
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
