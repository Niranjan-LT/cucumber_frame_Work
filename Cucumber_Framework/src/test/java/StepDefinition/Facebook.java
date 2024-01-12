package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook 
{
	WebDriver driver;
	@Given("open Browser enter the url")
	public void open_browser_enter_the_url() 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() 
	{
		driver.findElement(By.name("email")).sendKeys("selenium");
		driver.findElement(By.name("pass")).sendKeys("12345");
	}

	@Then("click the Login button")
	public void click_the_login_button()
	{
		driver.findElement(By.name("login")).click();
	}

	@Then("close the browser")
	public void close_the_browser() 
	{
		driver.quit();
	}

}
