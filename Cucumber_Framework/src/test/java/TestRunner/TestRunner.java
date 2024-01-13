package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\USER\\git\\cucumber_frame_Work\\Cucumber_Framework\\Features\\OpenOrangeHRM.feature",
dryRun = false, glue ={"StepDefinition"},plugin = {"pretty","html:target/Orange_hrm"})

public class TestRunner 
{	
	
}
