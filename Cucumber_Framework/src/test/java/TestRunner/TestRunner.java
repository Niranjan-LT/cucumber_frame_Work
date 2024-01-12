package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\lenovo\\eclipse-workspace\\Jazz\\Cucumber_Framework\\Features\\OrangeHRM.feature",
dryRun = false, glue ={"StepDefinition"},plugin = {"pretty","html:target/Orange_hrm"} )

public class TestRunner 
{
	
}
