package dsAlgo_Utilities;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonUtils {

	public static void enterCodePractice_old(WebDriver driver, String code, WebElement element)
			throws InterruptedException {

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("a").sendKeys(Keys.DELETE).keyUp(Keys.CONTROL).perform();

		System.out.println("Code :: " + code);
		String[] str1 = code.split("\n");
		for (int i = 0; i < str1.length; i++) {
			System.out.println("str1[" + i + "]::" + str1[i]);
			if (str1[i].contains("\\b")) {
				System.out.println("inside if block");
				actions.sendKeys(Keys.HOME).perform();
			} else {
				actions.sendKeys(str1[i]).perform();
				actions.sendKeys(Keys.RETURN).perform();

			}
		}
	}
	

	public static void enterCodePractice(WebDriver driver, String code, WebElement element) throws InterruptedException {
	    // Initialize Actions class
	    Actions actions = new Actions(driver);

	    // Clear existing content in the editor
	    actions.click(element) // Focus on the editor
	           .keyDown(Keys.CONTROL)
	           .sendKeys("a") // Select all content
	           .keyUp(Keys.CONTROL)
	           .sendKeys(Keys.DELETE) // Clear content
	           .perform();

	    System.out.println("Code :: " + code);

	    // Split code into lines
	    String[] lines = code.split("\n");

	    for (String line : lines) {
	        System.out.println("Processing line: " + line);
	        actions.sendKeys(Keys.HOME).perform();
	        // Count the leading tabs or spaces for indentation
	        int leadingSpaces = countLeadingSpaces(line);
	        int leadingTabs = countLeadingTabs(line);

	        // Add spaces for indentation
	        for (int i = 0; i < leadingSpaces; i++) {
	            actions.sendKeys(Keys.SPACE).perform();
	        }

	        // Add tabs for indentation
	        for (int i = 0; i < leadingTabs; i++) {
	            actions.sendKeys(Keys.TAB).perform();
	        }

	        // Send the actual line content (trimmed of leading spaces/tabs, as those are already added)
	        actions.sendKeys(line.trim()).perform();

	        // Add a newline after each line
	        actions.sendKeys(Keys.RETURN).perform();
	    }
	}

	// Helper method to count leading spaces
	private static int countLeadingSpaces(String line) {
	    int count = 0;
	    while (count < line.length() && line.charAt(count) == ' ') {
	        count++;
	    }
	    return count;
	}

	// Helper method to count leading tabs
	private static int countLeadingTabs(String line) {
	    int count = 0;
	    while (count < line.length() && line.charAt(count) == '\t') {
	        count++;
	    }
	    return count;
	}



}