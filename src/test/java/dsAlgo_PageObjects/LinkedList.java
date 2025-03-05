package dsAlgo_PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedList {

	@FindBy(xpath = "//button[@class='btn']")
	WebElement getStartBtn;

	@FindBy(xpath = "//a[text()='Sign in']")
	WebElement signIn;
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", signIn);

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
	
	//driver.findElement(By.xpath("//a[@href='"+string+"']"));

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

	/*
	 * public void ClickLinkedListDropDown() { linkedListDropDown.click(); }
	 */

	public void Username() {
		userName.sendKeys("bugbusters");
	}

	public void Password() {
		passWord.sendKeys("Team@bug");
	}

	public void Loginbtn() {
		login.click();
	}
	
	public void clickIntrodcution() {
		introduction.click();
	}

	public String statusMessage() {
		return status.getText();
	}

	public boolean isStatusMessage() {
		return status.isDisplayed();
	}

	public void clcikGetStartedLinkedListBtn() {
		getStartedLinkedListBtn.click();
	}

	/*
	 * public void linkedListDropDown() { linkedListDropDown.click(); }
	 */
	public void dropdownMenuClick() {
		dropdownMenu.click();
	}
	
	public void clickLinkedListFromDropdown() {
		selectLinkedListFromDropdownMenu.click();
	}

	public String titleLinkedList() {
		return title.getText();
	}
	
	
}
