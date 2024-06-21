package OrangeHRM.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\lenovo\\git\\cucumber_frame_Work\\Cucumber_Framework\\Features\\Login_Orange.feature",
dryRun = false, glue ={"OrangeHRM.StepDefinition."},plugin = {"pretty","html:target/Orange_hrm"})

public class Runner_Login{}
