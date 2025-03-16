package dsAlgo_PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dsAlgo_DriverFactory.DriverFactory;
import dsAlgo_Utilities.ExcelReader;

public class Tree_PF {
	WebDriver driver;
	List<Object[]> treeData;
	WebDriverWait wait;
	
	public Tree_PF() {
		driver=DriverFactory.getDriverInstance();
		PageFactory.initElements(driver, this);
		try {
			treeData = ExcelReader.readExcelData("Editor");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@FindBy(xpath = "/html/body/div[3]/div[6]/div/div/a")WebElement treeGetStarted;
	
	@FindBy(linkText = "Overview of Trees")WebElement overviewOfTrees;
	@FindBy(linkText="Try here>>>")WebElement tryHere;
	
	@FindBy(xpath="//*[text()='Run']")WebElement run;
	@FindBy(xpath="//div[@class='CodeMirror-code']")WebElement tryEditor;
	@FindBy(id="output")WebElement output;
	
	@FindBy(linkText="Terminologies")WebElement terminologies;
	@FindBy(linkText="Types of Trees")WebElement typesOfTrees;
	@FindBy(linkText="Tree Traversals")WebElement treeTraversals;
	@FindBy(linkText="Traversals-Illustration")WebElement traversalsIllustration;
	@FindBy(linkText="Binary Trees")WebElement binaryTrees;
	@FindBy(linkText="Types of Binary Trees")WebElement typesOfBinaryTrees;
	@FindBy(linkText="Implementation in Python")WebElement implementationInPython;
	@FindBy(linkText="Binary Tree Traversals")WebElement binaryTreeTraversals;
	@FindBy(linkText="Implementation of Binary Trees")WebElement implementationOfBinaryTrees;
	@FindBy(linkText="Applications of Binary trees")WebElement applicationsOfBinarytrees;
	@FindBy(linkText="Binary Search Trees")WebElement binarySearchTrees;
	@FindBy(linkText="Implementation Of BST")WebElement implementationOfBST;
	@FindBy(linkText="Practice Questions")WebElement practiceQuestions;


	public void treeGetStarted() {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", treeGetStarted);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(treeGetStarted)).click();

	}

	public void overviewOfTrees() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overviewOfTrees);
		wait.until(ExpectedConditions.visibilityOf(overviewOfTrees)).click();
	}
	
	public void tryHere() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryHere);
		wait.until(ExpectedConditions.elementToBeClickable(tryHere)).click();
	}
	
	public void run() {
		run.click();
	}
	
	public void pythonCodeFromExcel(int row) {
		Actions actions = new Actions(driver);
		Object[] objArray = treeData.get(row);
		String pythonCode = (String) objArray[0];
		actions.moveToElement(tryEditor).click().sendKeys(pythonCode).build().perform();
		run();	
}
	
	public String alertMessage() {
		String alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alertMessage;
	}

	public String expectedOutputFromExcel(int row) {
		Object[] objArray = treeData.get(row);
		String output = (String) objArray[1];
		return output;
	}
	
	public String output() {
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", output);
    	return(output.getText());
    }
	
	public void terminologies() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", terminologies);
		wait.until(ExpectedConditions.visibilityOf(terminologies)).click();    
	}
	public void typesOfTrees() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", typesOfTrees);
		wait.until(ExpectedConditions.visibilityOf(typesOfTrees)).click();  
	}
	public void treeTraversals() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", treeTraversals);
		wait.until(ExpectedConditions.visibilityOf(treeTraversals)).click();
	}
	
	public void traversalsIllustration() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", traversalsIllustration);
		wait.until(ExpectedConditions.visibilityOf(traversalsIllustration)).click();
	}
	
	public void binaryTrees() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", binaryTrees);
		wait.until(ExpectedConditions.visibilityOf(binaryTrees)).click();
	}
	
	public void typesOfBinaryTrees() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", typesOfBinaryTrees);
		wait.until(ExpectedConditions.visibilityOf(typesOfBinaryTrees)).click();
	}
	
	public void implementationInPython() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", implementationInPython);
		wait.until(ExpectedConditions.visibilityOf(implementationInPython)).click();
	}
	public void binaryTreeTraversals() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", binaryTreeTraversals);
		wait.until(ExpectedConditions.visibilityOf(binaryTreeTraversals)).click();
	}
	public void implementationOfBinaryTrees() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", implementationOfBinaryTrees);
		wait.until(ExpectedConditions.visibilityOf(implementationOfBinaryTrees)).click();
	}
	public void applicationsOfBinarytrees() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", applicationsOfBinarytrees);
		wait.until(ExpectedConditions.visibilityOf(applicationsOfBinarytrees)).click();
	}
	public void binarySearchTrees() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", binarySearchTrees);
		wait.until(ExpectedConditions.visibilityOf(binarySearchTrees)).click();
	}
	public void implementationOfBST() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", implementationOfBST);
		wait.until(ExpectedConditions.visibilityOf(implementationOfBST)).click();
	}
	public void practiceQuestions() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", practiceQuestions);
		wait.until(ExpectedConditions.visibilityOf(practiceQuestions)).click();
	}
	public String getTitle() {	
		return driver.getTitle();
		
	}
	
}
