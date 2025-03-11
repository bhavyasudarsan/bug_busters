package dsAlgo_PageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgo_Utilities.CommonUtils;
import dsAlgo_Utilities.ExcelReader;

public class Array_PF {

	public Array_PF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait;

	@FindBy(linkText = "Get Started")WebElement getStart;
	@FindBy(linkText = "Sign in")WebElement signIn;
	@FindBy(id = "id_username")WebElement userName;
	@FindBy(id = "id_password")WebElement password;
	@FindBy(xpath = "//*[@value='Login']")WebElement login;
	@FindBy(xpath = "//*[@class ='alert alert-primary']")WebElement loginStatus;

	@FindBy(xpath = "/html/body/div[3]/div[2]/div/div/a")WebElement arrayGetStarted;
	@FindBy(linkText = "Arrays in Python")WebElement arraysInPython;
	@FindBy(linkText = "Try here>>>")WebElement tryHere;

	@FindBy(xpath = "//*[text()='Run']")WebElement run;
	@FindBy(xpath = "//div[@class='CodeMirror-code']")WebElement tryEditor;
	@FindBy(id = "output")WebElement output;
	@FindBy(xpath="//*[@value='Submit']")WebElement submit;

	@FindBy(linkText = "Practice Questions")WebElement practiceQuestions;
	@FindBy(linkText = "Search the array")WebElement searchTheArray;
	@FindBy(linkText = "Max Consecutive Ones")WebElement maxConsecutiveOnes;
	@FindBy(linkText = "Find Numbers with Even Number of Digits")WebElement findNumberswithEvenNumberofDigits;
	@FindBy(linkText = "Squares of a Sorted Array")WebElement squaresOfaSortedArray;

	@FindBy(linkText = "Arrays Using List")WebElement arraysUsingList;
	@FindBy(linkText = "Basic Operations in Lists")WebElement basicOperationsinLists;
	@FindBy(linkText = "Applications of Array")WebElement applicationsofArray;

	public void getStart(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		getStart.click();
	}

	public void signIn() {
		signIn.click();
	}

	public void enterCredentials(String loginName, String loginPassword) {

		userName.sendKeys(loginName);
		password.sendKeys(loginPassword);

	}

	public void clickLogin() {
		login.click();
	}

	public String getStatus() {

		return loginStatus.getText();

	}

	public void arrayGetStarted(WebDriver driver) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(arrayGetStarted)).click();

	}

	public void arraysInPython(WebDriver driver) {

		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arraysInPython);
		wait.until(ExpectedConditions.elementToBeClickable(arraysInPython)).click();

	}

	public void tryHere(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryHere);
		wait.until(ExpectedConditions.elementToBeClickable(tryHere)).click();
	}

	public void run() {
		run.click();
	}

	public String alertMessage(WebDriver driver) {
		String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alertMessage;
	}

	public void invalidPythonCode(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(tryEditor).click().sendKeys("Invalid Code").build().perform();
		run();
	}

	public void validPythonCode(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(tryEditor).click().sendKeys("print(\"VALID CODE\")").build().perform();
		run();
	}

	public String output(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", output);
		wait.until(ExpectedConditions.visibilityOf(output));
		return (output.getText());
	}

	public void practiceQuestions(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", practiceQuestions);
		wait.until(ExpectedConditions.visibilityOf(practiceQuestions)).click();
	}

	public void searchTheArray() {
		searchTheArray.click();
	}

	public void maxConsecutiveOnes() {
		maxConsecutiveOnes.click();
	}

	public void findNumberswithEvenNumberofDigits() {
		findNumberswithEvenNumberofDigits.click();
	}

	public void squaresOfaSortedArray() {
		squaresOfaSortedArray.click();
	}

	public void arraysUsingList(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arraysUsingList);
		wait.until(ExpectedConditions.visibilityOf(arraysUsingList)).click();
	}

	public void basicOperationsinLists(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", basicOperationsinLists);
		wait.until(ExpectedConditions.visibilityOf(basicOperationsinLists)).click();
	}

	public void applicationsofArray(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", applicationsofArray);
		wait.until(ExpectedConditions.visibilityOf(applicationsofArray)).click();
	}

	public void validCodeSearchtheArray(WebDriver driver) {
		String codeFromExcel;
		try {
			codeFromExcel = ExcelReader.readExcelSheet("SearchTheArray");
			CommonUtils.enterCodePractice(driver, codeFromExcel, tryEditor);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void validCodeMaxConsecutiveOnes(WebDriver driver) {
		String codeFromExcel;
		try {
			codeFromExcel = ExcelReader.readExcelSheet("MaxConsecutiveOnes");
			CommonUtils.enterCodePractice(driver, codeFromExcel, tryEditor);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void validCodeEvenNumberofDigits(WebDriver driver) {
		String codeFromExcel;
		try {
			codeFromExcel = ExcelReader.readExcelSheet("EvenNumberDigits");
			CommonUtils.enterCodePractice(driver, codeFromExcel, tryEditor);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void validCodeSquaresOfaSortedArray(WebDriver driver) {
		String codeFromExcel;
		try {
			codeFromExcel = ExcelReader.readExcelSheet("SquaresofSortedArray");
			CommonUtils.enterCodePractice(driver, codeFromExcel, tryEditor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void invalidCodeSubmit(WebDriver driver) {
		Actions actions = new Actions(driver);
		actions.moveToElement(tryEditor).click().sendKeys("Invalid Code").build().perform();
		submit.click();
	}
	public void submit() {
		submit.click();
	}

}
