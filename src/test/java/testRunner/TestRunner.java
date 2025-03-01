//package testRunner;
//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/features",glue ="stepDefinitions"
//                 ,monochrome=true,
//plugin= {"pretty","html:target/cucumber.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//        })
//public class testRunner {
//
//}
package testRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
//@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
				plugin = {"pretty", "html:target/bharathi.html"}, //reporting purpose
				monochrome=false,  //console output color
				tags = "@persoanlLeave or @firstTest", //tags from feature file
				features = {"src/test/resources/features"}, //location of feature files
				glue= "stepdefinitions") //location of step definition files


		public class TestRunner extends AbstractTestNGCucumberTests{
			
			@Override
		    @DataProvider(parallel = false)
		    public Object[][] scenarios() {
						
				return super.scenarios();
		    }

}
