package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\lenovo\\eclipse-workspace\\Jazz\\Cucumber_Framework\\Features\\Facebook.feature",
glue = {"StepDefinition"},dryRun = true,plugin = {"pretty","html:target/facebook_login"} )

public class Facebook_runner {

}
