package runner_class;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\lenovo\\eclipse-workspace\\Jazz\\Cucumber\\features_file\\login.feature",
glue = "OrangeHRM_StepDefinition",dryRun = false,plugin = {"pretty","html:report/facebok1234"},monochrome = true)

public class Login 
{
	
}
