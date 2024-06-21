package OrangeHRM.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\lenovo\\eclipse-workspace\\Jazz\\Cucumber\\features_file\\OrangeHRM_Logo_varification.feature",
dryRun = true, glue ={"orangeHRM_Logo_verification"},tags = "@OpenAppn",plugin = {"pretty","html:target/Orange_hrm"})


public class Runner_Loginpage_Logo_verification {}
