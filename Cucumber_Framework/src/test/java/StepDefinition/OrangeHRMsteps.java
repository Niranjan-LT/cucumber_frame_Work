package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMsteps 
{
	
	public WebDriver driver;
	 public WebDriverWait wait;
	
	@Given("Launch the firefox browser")
	public void launch()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		wait=new WebDriverWait(driver, 20);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
	@When("Open the OrangeHRM Homepage")
	public void homepage()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Then("verify the Login page is displayed")
	public void verify_home_page()
	{
		boolean logo = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//img[@alt='company-branding']")))).isDisplayed();
		Assert.assertTrue(logo, "Logo is present");
	}

	
}
