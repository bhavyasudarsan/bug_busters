package dsAlgo_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedList {

	@FindBy(xpath = "//button[@class='btn']")
	WebElement getStartBtn;

	@FindBy(xpath = "//a[@href='/login']")
	WebElement signIn;
	@FindBy(xpath = "//div[@class='bs-example']")
	WebElement loginPage;

	@FindBy(xpath = "//h5[text()='Linked List']/../a\"")
	WebElement linkedList;
	@FindBy(name = "username")
	WebElement userName;
	@FindBy(name = "password")
	WebElement passWord;
	@FindBy(xpath = "//input[@type=\"submit\"]")
	WebElement login;
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement status;
	@FindBy(xpath = "//h5[text()='Linked List']/../a")
	WebElement getStarted;
	@FindBy(xpath = "//div[@class='nav-item dropdown']")
	WebElement linked;
	@FindBy(xpath = "//h4[@class='bg-secondary text-white']")
	WebElement title;

	public LinkedList(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

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

	public void ClickBtnLInkedList() {
		linkedList.click();
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

	public String statusMessage() {
		return status.getText();
	}

	public boolean isStatusMessage() {
		return status.isDisplayed();
	}

	public void getStartedBtn() {
		getStarted.click();
	}

	public void linkList() {
		linked.click();
	}

	public String titleLinkedList() {
		return title.getText();
	}
}
