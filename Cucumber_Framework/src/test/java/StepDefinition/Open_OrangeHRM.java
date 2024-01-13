package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_OrangeHRM {

    public WebDriverWait wait;
   public WebDriver driver = new FirefoxDriver();
    @Given("Launch the firefox browser")
    public void launch() {
        WebDriverManager.firefoxdriver().setup();
        wait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
    }

    @When("Open the OrangeHRM Homepage")
    public void homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Then("verify the Login page is displayed")
    public void verify_home_page() {
        boolean logo = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='company-branding']")))).isDisplayed();
        Assert.assertTrue(logo, "Logo is present");
    } 
}
