package dsAlgo_PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Utilities.CommonUtils;
import dsAlgo_Utilities.ExcelReader;

public class Array_PF {

	WebDriver driver;
	List<Object[]> arrayData;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	public Array_PF() {
		driver = DriverFactory.getDriverInstance();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='array']")
	WebElement arrayGetStarted;
	@FindBy(linkText = "Arrays in Python")
	WebElement arraysInPython;
	@FindBy(linkText = "Try here>>>")
	WebElement tryHere;

	@FindBy(xpath = "//*[text()='Run']")
	WebElement run;
	@FindBy(xpath = "//div[@class='CodeMirror-code']")
	WebElement tryEditor;
	@FindBy(id = "output")
	WebElement output;
	@FindBy(xpath = "//*[@value='Submit']")
	WebElement submit;

	@FindBy(linkText = "Practice Questions")
	WebElement practiceQuestions;
	@FindBy(linkText = "Search the array")
	WebElement searchTheArray;
	@FindBy(linkText = "Max Consecutive Ones")
	WebElement maxConsecutiveOnes;
	@FindBy(linkText = "Find Numbers with Even Number of Digits")
	WebElement findNumberswithEvenNumberofDigits;
	@FindBy(linkText = "Squares of a Sorted Array")
	WebElement squaresOfaSortedArray;

	@FindBy(linkText = "Arrays Using List")
	WebElement arraysUsingList;
	@FindBy(linkText = "Basic Operations in Lists")
	WebElement basicOperationsinLists;
	@FindBy(linkText = "Applications of Array")
	WebElement applicationsofArray;

	public void arrayGetStarted() {
		wait.until(ExpectedConditions.elementToBeClickable(arrayGetStarted)).click();
	}

	public void arraysInPython() {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arraysInPython);
		wait.until(ExpectedConditions.elementToBeClickable(arraysInPython)).click();
	}

	public void tryHere() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryHere);
		wait.until(ExpectedConditions.elementToBeClickable(tryHere)).click();
	}

	public void run() {
		run.click();
	}

	public String alertMessage() {
		try {
		    String alertMessage = driver.switchTo().alert().getText();
		    driver.switchTo().alert().accept();
		    return alertMessage;
		} catch (NoAlertPresentException e) {
			 return "No alert found.";
		}
	}

	public void invalidPythonCode(String sheetname,int row) {
		Actions actions = new Actions(driver);
		try {
			arrayData = ExcelReader.readExcelData(sheetname);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Object[] objArray = arrayData.get(row);
		String invalidInput = (String) objArray[1];
		actions.moveToElement(tryEditor).click().sendKeys(invalidInput).build().perform();
		run();
	}

	public void validPythonCode(String sheetname,int row) {
		Actions actions = new Actions(driver);
		try {
			arrayData = ExcelReader.readExcelData(sheetname);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Object[] objArray = arrayData.get(row);
		String validInput = (String) objArray[1];
		actions.moveToElement(tryEditor).click().sendKeys(validInput).build().perform();
		run();
	}

	public String expectedOutputFromExcel(String sheetname,int row) {
		try {
			arrayData = ExcelReader.readExcelData(sheetname);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Object[] objArray = arrayData.get(row);
		String output = (String) objArray[2];
		return output;
	}

	public String output() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", output);
		wait.until(ExpectedConditions.visibilityOf(output));
		return (output.getText());
	}

	public void practiceQuestions() {
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

	public void arraysUsingList() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", arraysUsingList);
		wait.until(ExpectedConditions.visibilityOf(arraysUsingList)).click();
	}

	public void basicOperationsinLists() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", basicOperationsinLists);
		wait.until(ExpectedConditions.visibilityOf(basicOperationsinLists)).click();
	}

	public void applicationsofArray() {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", applicationsofArray);
		wait.until(ExpectedConditions.visibilityOf(applicationsofArray)).click();
	}

	public void validCodePracticeQuestions(String sheetname,int row) {
		try {
			arrayData = ExcelReader.readExcelData(sheetname);
			Object[] objArray = arrayData.get(row);
			String codeFromExcel = (String) objArray[1];
			CommonUtils.enterCodePractice(driver, codeFromExcel, tryEditor);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void invalidCodeSubmit(String sheetname,int row) {
		try {
			arrayData = ExcelReader.readExcelData(sheetname);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Actions actions = new Actions(driver);
		Object[] objArray = arrayData.get(row);
		String codeFromExcel = (String) objArray[1];
		actions.moveToElement(tryEditor).click().sendKeys(codeFromExcel).build().perform();
		submit.click();
	}

	public void submit() {
		submit.click();
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
