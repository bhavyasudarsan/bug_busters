package dsAlgo_Runner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


		@CucumberOptions(
				plugin = {"pretty", "html:target/dsAlgo.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
				monochrome=false,  
				tags = "@Login or @linkedTest or @stackTest or @homeTest or @treeTest or @arrayTest",  
				features = "src/test/resources/dsAlgo_FeatureFiles", 
				glue= {"dsAlgo_StepDefinition", "dsAlgo_hooks" }) 
		
public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
				
		return super.scenarios();
    }
				
}