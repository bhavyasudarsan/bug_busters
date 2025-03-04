package dsAlgo_PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stack {

	WebDriverWait wait;

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

	@FindBy(xpath = "//h5[text()='Linked List']/../a")
	WebElement getStartedStackBtn;

	@FindBy(xpath = "//div[@class='nav-item dropdown']")
	WebElement dropdownMenuStack;

	@FindBy(xpath = "//a[text()='Stack']")
	WebElement selectStackFromDropdownMenu;

	@FindBy(xpath = "//h4[@class='bg-secondary text-white']")
	WebElement title;

	@FindBy(xpath = "//a[@href='introduction']")
	WebElement introduction;

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

	public Stack(WebDriver driver) {
		PageFactory.initElements(driver, this);

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

	public void signInbtnWithWait(WebDriver driver) {

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

	public String titleLinkedList() {
		return title.getText();
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

}
