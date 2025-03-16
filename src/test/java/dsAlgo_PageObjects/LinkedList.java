package dsAlgo_PageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgo_DriverFactory.DriverFactory;

public class LinkedList {
	WebDriver driver;

	WebDriverWait wait;
	
	public LinkedList() {
	    driver=  DriverFactory.getDriverInstance();
		PageFactory.initElements(driver, this);
	}

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

	@FindBy(xpath = "//h5[text()='Linked List']/../a")
	WebElement getStartedLinkedListBtn;

	@FindBy(xpath = "//div[@class='nav-item dropdown']")
	WebElement dropdownMenu;

	@FindBy(xpath = "//a[text()='Linked List']")
	WebElement selectLinkedListFromDropdownMenu;

	@FindBy(xpath = "//h4[@class='bg-secondary text-white']")
	WebElement title;

	@FindBy(xpath = "//a[@href='introduction']")
	WebElement introduction;

	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryHereBtn;

	@FindBy(xpath = "//div[@class='CodeMirror cm-s-default']\r\n")
	WebElement tryEditor;
	@FindBy(xpath = "//button[text()='Run']")
	WebElement runBtn;
	@FindBy(xpath = "//pre[@class='CodeMirror-line-like']")
	WebElement inputArea;
	@FindBy(xpath = "//div[@class='CodeMirror-code']")
	WebElement tryEditorInput;
	@FindBy(xpath = "//pre[@id='output']")
	public WebElement tryEditorConsole;
	@FindBy(xpath = "//a[text()='Creating Linked LIst']")
	WebElement creatingLinkedLIstLink;

	@FindBy(xpath = "//title[text()='Linked List']")
	WebElement titleLink;
	@FindBy(xpath = "//p[text()='Creating Linked LIst']")
	WebElement titleCreateLinkList;
	@FindBy(xpath = "	//a[text()='Types of Linked List']")
	WebElement typeOfLinkListink;
	@FindBy(xpath = "//p[text()='Types of Linked List']")
	WebElement titleTypeOfLinkList;
//	private WebDriver driver;
	@FindBy(xpath = "//a[text()='Implement Linked List in Python']")
	WebElement implimentLink;
	@FindBy(xpath = "//p[text()='Implement Linked List in Python']")
	WebElement titleImplimentLinkList;
	@FindBy(xpath = "//a[text()='Traversal']")
	WebElement traversalLink;
	@FindBy(xpath = "//p[text()='Traversal']")
	WebElement titleTraversal;
	@FindBy(xpath = "//a[text()='Insertion']")
	WebElement insertionLink;
	@FindBy(xpath = "//p[text()='Insertion']")
	WebElement titleInsertion;
	@FindBy(xpath = "//a[text()='Deletion']")
	WebElement deletionLink;
	@FindBy(xpath = "//p[text()='Deletion']")
	WebElement titleDeletion;

	

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

	public void Username() {
		userName.sendKeys("bugbusters");
	}

	public void password(String password ) {
		passWord.sendKeys(password);
	}
	public void username(String username) {
		userName.sendKeys(username);
	}

	public void Loginbtn() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(login)).click();
	}

	public void clickIntrodcution( ) {
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(introduction)).click();
//		introduction.click();
	}

	public String statusMessage() {
		return status.getText();
	}

	public boolean isStatusMessage() {
		return status.isDisplayed();
	}

	public void clcikGetStartedLinkedListBtn() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(getStartedLinkedListBtn)).click();
//		getStartedLinkedListBtn.click();
	}

	public void dropdownMenuClick() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(dropdownMenu)).click();

//		dropdownMenu.click();
	}

	public void clickLinkedListFromDropdown() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(selectLinkedListFromDropdownMenu)).click();
	}

	public String titleLinkedList() {

		return title.getText();
		
	}

	public void tryHereBtnClick() {
		tryHereBtn.click();
	}

	public String runBtnText() {
		
		return runBtn.getText();
	}

	public void runBtnClick() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.visibilityOf(runBtn)).click();
//		runBtn.click();
		
	}

	public void inputEditor() {

		Actions actions = new Actions(driver);
		actions.moveToElement(tryEditorInput).click().sendKeys("").build().perform();

	}

	public String alertMessage() {

		return driver.switchTo().alert().getText();
	}

	public void inputEditor(String code ) {

		Actions actions = new Actions(driver);
		actions.moveToElement(tryEditorInput).click().sendKeys(code).build().perform();

	}

	public String console() {

		return tryEditorConsole.getText();

	}

	public void creatingLinkedListClick() {
		creatingLinkedLIstLink.click();
	}

	public void getTitleLinked() {
		titleLink.getText();
	}

	public String getTitleCreatingLinkedList() {
		return titleCreateLinkList.getText();
	}

	public void typeOfLinkListinkClick() {
		typeOfLinkListink.click();
	}

	public String getTitleTypeOfLinked() {
		return titleTypeOfLinkList.getText();
	}

	public void implimentLinkedListClick() {
		implimentLink.click();
	}

	public String getTitleImplimentLinked() {
		return titleImplimentLinkList.getText();
	}

	public void traversalClick() {
		traversalLink.click();
	}

	public String getTitleTraversal() {
		return titleTraversal.getText();
	}

	public void insertionClick() {
		insertionLink.click();
	}

	public String getTitleInsertionLink() {
		return titleInsertion.getText();
	}

	public void deletionClick() {
		deletionLink.click();
	}

	public String getTitleDeletionLink() {
		return titleDeletion.getText();
	}
	public void currentURL() {
		driver.getCurrentUrl();
	}
	public void getUrl() {
		driver.get("https://dsportalapp.herokuapp.com/");
	}
	public void tryEditorPage() {
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	}
	public void openHomeScreen() {
	driver.get("https://dsportalapp.herokuapp.com/home");

}
}
