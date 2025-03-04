package dsAlgo_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriverWait wait;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='btn']")
	WebElement btn;

	@FindBy(xpath = "//div[@id='navbarCollapse']/div[2]/ul/a[2]")
	WebElement register;

	@FindBy(xpath = "//div[@id='navbarCollapse']/div[2]/ul/a[3]")
	WebElement signIn;

	public void clickStBtn(WebDriver driver) {
		btn.click();
	}

	public String clickStBtnString() {
		return btn.getText();
	}

	public String registerBtn() {
		return register.getText();
	}

	public String signInBtn() {
		return signIn.getText();
	}

}
