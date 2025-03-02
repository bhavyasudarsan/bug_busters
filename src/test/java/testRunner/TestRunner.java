package testRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/t.html" }, // reporting purpose
		monochrome = false, // console output color
		tags = "@persoanlLeave or @firstTest", // tags from feature file
		features = { "src/test/resources/features" }, // location of feature files
		glue = "stepdefinitions") // location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}
