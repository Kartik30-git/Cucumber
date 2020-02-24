package StepDefinitions;

import Academy.Base;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import PageObjects.PortalHomepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefLogin extends Base{
	@Given("^Initialize the browser with Chrome$")
	public void initialize_the_browser_with_Chrome() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = initializeDriver();
	}

	@Given("^Navigate to (.+) site$")
	public void navigate_to_site(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	}

	@Given("^Click on login link on homepage to land on Secure Sign In page\\.$")
	public void click_on_login_link_on_homepage_to_land_on_Secure_Sign_In_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		LandingPage landing = new LandingPage(driver);
		//Handling the Newsletter popup
		if(landing.getPopUpSize()>0) {
			landing.getPopUp().click();
		}
		landing.loginElement().click();
	}

	@When("^User enters (.+) and (.+) and logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		LoginPage login = new LoginPage(driver);
		login.emailElement().sendKeys(arg1);
		login.passwordElement().sendKeys(arg2);
		login.submitElement().click();
	}

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PortalHomepage portal=new PortalHomepage(driver);
		Assert.assertTrue(portal.getSearchBox().isDisplayed());
		
	}

}
