package dsAlgo_Runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

		@CucumberOptions(
				plugin = {"pretty", "html:target/dsAlgo.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
				monochrome=false,  //console output color
				tags = "@Login or @linkedTest or @stackTest or @homeTest or @treeTest or @arrayTest",  //tags from feature file
				features = "src/test/resources/dsAlgo_FeatureFiles", //location of feature files
				glue= {"dsAlgo_StepDefinition","dsAlgo_hooks" }) //location of step definition files


public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
				
}