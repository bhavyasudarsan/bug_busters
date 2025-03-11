package dsAlgo_PageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tree_PF {

	public Tree_PF(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait;

	@FindBy(linkText = "Get Started")WebElement getStart;
	@FindBy(linkText = "Sign in")WebElement signIn;
	@FindBy(id = "id_username")WebElement userName;
	@FindBy(id = "id_password")WebElement password;
	@FindBy(xpath = "//*[@value='Login']")WebElement login;
	
	@FindBy(xpath = "//*[@class ='alert alert-primary']")WebElement loginStatus;
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

	public void treeGetStarted(WebDriver driver) {

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", treeGetStarted);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(treeGetStarted)).click();

	}

	public void overviewOfTrees(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overviewOfTrees);
		wait.until(ExpectedConditions.visibilityOf(overviewOfTrees)).click();
	}
	
	public void tryHere(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryHere);
		wait.until(ExpectedConditions.elementToBeClickable(tryHere)).click();
	}
	
	public void run() {
		run.click();
	}
	
	public void invalidPythonCode(WebDriver driver) {
		Actions actions = new Actions(driver);
        actions.moveToElement(tryEditor).click().sendKeys("Invalid Code").build().perform();
        run();
	}
	
	public String alertMessage(WebDriver driver) {
		String alertMessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alertMessage;
	}
	
	public void validPythonCode(WebDriver driver) {
		Actions actions = new Actions(driver);
        actions.moveToElement(tryEditor).click().sendKeys("print(\"VALID CODE\")").build().perform();
        run();
	}
	
	public String output(WebDriver driver) {
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", output);
    	return(output.getText());
    }
	
	public void terminologies(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", terminologies);
		wait.until(ExpectedConditions.visibilityOf(terminologies)).click();    
	}
	public void typesOfTrees(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", typesOfTrees);
		wait.until(ExpectedConditions.visibilityOf(typesOfTrees)).click();  
	}
	public void treeTraversals(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", treeTraversals);
		wait.until(ExpectedConditions.visibilityOf(treeTraversals)).click();
	}
	
	public void traversalsIllustration(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", traversalsIllustration);
		wait.until(ExpectedConditions.visibilityOf(traversalsIllustration)).click();
	}
	
	public void binaryTrees(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", binaryTrees);
		wait.until(ExpectedConditions.visibilityOf(binaryTrees)).click();
	}
	
	public void typesOfBinaryTrees(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", typesOfBinaryTrees);
		wait.until(ExpectedConditions.visibilityOf(typesOfBinaryTrees)).click();
	}
	
	public void implementationInPython(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", implementationInPython);
		wait.until(ExpectedConditions.visibilityOf(implementationInPython)).click();
	}
	public void binaryTreeTraversals(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", binaryTreeTraversals);
		wait.until(ExpectedConditions.visibilityOf(binaryTreeTraversals)).click();
	}
	public void implementationOfBinaryTrees(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", implementationOfBinaryTrees);
		wait.until(ExpectedConditions.visibilityOf(implementationOfBinaryTrees)).click();
	}
	public void applicationsOfBinarytrees(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", applicationsOfBinarytrees);
		wait.until(ExpectedConditions.visibilityOf(applicationsOfBinarytrees)).click();
	}
	public void binarySearchTrees(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", binarySearchTrees);
		wait.until(ExpectedConditions.visibilityOf(binarySearchTrees)).click();
	}
	public void implementationOfBST(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", implementationOfBST);
		wait.until(ExpectedConditions.visibilityOf(implementationOfBST)).click();
	}
	public void practiceQuestions(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", practiceQuestions);
		wait.until(ExpectedConditions.visibilityOf(practiceQuestions)).click();
	}
	
}
