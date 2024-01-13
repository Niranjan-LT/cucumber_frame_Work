package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\lenovo\\git\\cucumber_frame_Work\\Cucumber_Framework\\Features\\OrangeHRM.feature",
dryRun = false, glue ={"StepDefinition"},plugin = {"pretty","html:target/Orange_hrm"})

public class TestRunner 
{	
}
