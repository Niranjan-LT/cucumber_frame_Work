package step_definitaion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_step 
{
	public WebDriver driver;
	@Given("open the application and enter the url")
	public void open_the_application_and_enter_the_url()
	{
		 driver = WebDriverManager.chromedriver().create();
		 driver.get("https://www.facebook.com");
	}

	@When("enter the valid user & password click on login button")
	public void enter_the_valid_user_password_click_on_login_button()
	{
		driver.findElement(By.name("email")).sendKeys("selenium");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
	}

	@Then("home page should be displayed")
	public void home_page_should_be_displayed() 
	{
		String title = driver.getTitle();
		System.out.println(title);
	}

	@Then("verify the home page is displayed")
	public void verify_the_home_page_is_displayed() 
	{
		System.out.println("home page is displayed");
	}

}
