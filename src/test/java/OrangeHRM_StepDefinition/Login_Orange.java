package OrangeHRM_StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

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
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
			driver.get("https://opensource-demo.orangehrmlive.com/");
			System.out.println("hi");
	    }
    	@When("enter the UserName and Password click on Login button")
	    public void enter_the_UserName_and_Password_click_on_Login_button() 
	    {
	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='username']")))).sendKeys("Admin");
	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='password']")))).sendKeys("admin123");
	        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[.=' Login ']")))).click();
	    }
	    @Then("verify the Home page is displayed")
	    public void Home_page() 
	    {
	        String title = driver.getTitle();
	        System.out.println("Page title: " + title);
	    //    Assert.assertTrue(title.contains("OrangeHRM"), "Home page title verification failed");
	    }  
}
