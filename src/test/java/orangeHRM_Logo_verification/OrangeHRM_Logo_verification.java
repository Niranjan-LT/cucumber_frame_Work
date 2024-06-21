package orangeHRM_Logo_verification;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_Logo_verification 
{
	@Given("Launch the firefox browser")
	public void launch_the_firefox_browser() 
	{
		System.out.println("helo");
	}
	@When("Open the OrangeHRM Homepage")
	public void open_the_orange_hrm_homepage() {
		System.out.println("tata");
	}
	@Then("verify the Login page is displayed")
	public void verify_the_login_page_is_displayed() {
		System.out.println("close");
	}
	
}