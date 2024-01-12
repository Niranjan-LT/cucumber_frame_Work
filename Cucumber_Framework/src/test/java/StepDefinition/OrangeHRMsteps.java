package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class OrangeHRMsteps {
	
	public WebDriver driver;
	
	@Given("Launch the firefox browser")
	public void launch()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
	@When("Open the OrangeHRM Homepage")
	public void homepage()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Then("Verify the logo present on that page")
	public void verify_the_login_present_on_page()
	{
		WebElement logo = driver.findElement(By.xpath("//img[@alt='company-branding']"));
		//assertEquals(logo, true);
		System.out.println("Logo is present");
		
	}
	@When("enter the UserName and Password click on Login button")
	public void enter_the_user_name_and_password_click_on_login_button()
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
	}

	@Then("verify the Home page is displayed")
	public void verify_the_home_page_is_displayed() {
		WebElement home_page_logo = driver.findElement(By.xpath("//img[@alt='client brand banner']"));
		assertEquals(home_page_logo, true);
		System.out.println("Home page is displayed");
	}
//	@When("click on PIM Icon")
//	public void click_on_pim_icon() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Verify the PIM page is displayed")
//	public void verify_the_pim_page_is_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("click on add Employee major tab and enter the Firstname,MiddleName and LastName click on save button")
//	public void click_on_add_employee_major_tab_and_enter_the_firstname_middle_name_and_last_name_click_on_save_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("Check weather the confirmation message is displayed")
//	public void check_weather_the_confirmation_message_is_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("click on Employee List major tab")
//	public void click_on_employee_list_major_tab() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("verify the EmployeeName is present in Employee List")
//	public void verify_the_employee_name_is_present_in_employee_list() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("Mousehover to employee and click on delete icon")
//	public void mousehover_to_employee_and_click_on_delete_icon() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("verify the delete confirmation message is displayed")
//	public void verify_the_delete_confirmation_message_is_displayed() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}
