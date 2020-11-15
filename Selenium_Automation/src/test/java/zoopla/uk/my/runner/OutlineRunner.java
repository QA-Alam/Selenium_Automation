package zoopla.uk.my.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = "Cucumber_Features",
		glue = "zoopla.uk.stefdefination"
	
		
		)
public class OutlineRunner extends AbstractTestNGCucumberTests{

}
