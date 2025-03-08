package dsAlgo_Runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
		
		@CucumberOptions(
				plugin = {"pretty", "html:target/pushpa.html"}, //reporting purpose
				monochrome=false,  //console output color
				tags = "@Graph and @Login and @Queue",  //tags from feature file
				features = {"src/test/resources/dsAlgo_FeatureFiles"}, //location of feature files
				glue = "com.bug_busters.dsAlgo_StepDefinition") //location of step definition files

public class TestRunner extends AbstractTestNGCucumberTests{
			
			@Override
		    @DataProvider(parallel = false)
		    public Object[][] scenarios() {
						
				return super.scenarios();
		    }


	
}


