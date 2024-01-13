package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Orange 
{

    private WebDriverWait wait;
    private WebDriver driver;
    @Before
    public void launch()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
    }
	
	 @When("enter the UserName and Password click on Login button")
	    public void enter_the_UserName_and_Password_click_on_Login_button() 
	    {
	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("username")))).sendKeys("admin");
	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("password")))).sendKeys("admin123");
	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@value='LOGIN']")))).click();
	    }
	    @Then("verify the Home page is displayed")
	    public void Home_page() {
	        String title = driver.getTitle();
	        System.out.println("Page title: " + title);
	        Assert.assertTrue(title.contains("Dashboard"), "Home page title verification failed");
	    }
}
