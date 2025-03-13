package dsAlgo_Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

		@RunWith(Cucumber.class)
		@CucumberOptions(
				plugin = {"pretty", "html:target/dsAlgo.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
				monochrome=false,  //console output color
				//tags = "@Login and @Graph and @Queue",  //tags from feature file
				features = "src/test/resources/dsAlgo_FeatureFiles", //location of feature files
				glue= "dsAlgo_StepDefinition") //location of step definition files

public class TestRunner {
				
}
