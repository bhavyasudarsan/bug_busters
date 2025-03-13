package dsAlgo_Runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			plugin = {"pretty", "html:target/dsAlgo.html"}, 
			monochrome=false,  
			tags = "@linkedTest or @stackTest or @homeTest or @treeTest or @arrayTest",  
			features = {"src/test/resources/dsAlgo_FeatureFiles"}, 
			glue= {"dsAlgo_StepDefinition","dsAlgo_hooks"}) 

public class Runner extends AbstractTestNGCucumberTests{
			
			@Override
		    @DataProvider(parallel = false)
		    public Object[][] scenarios() {
						
				return super.scenarios();
		    }

	
}