package zoopla.uk.my.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber-reports/cucumber.json"},
	//Location of folder
	features = "Cucumber_Features", 		
    // Location of step definition
	glue = "zoopla.uk.stefdefination"  
		)
public class MyRunner extends AbstractTestNGCucumberTests{

}
