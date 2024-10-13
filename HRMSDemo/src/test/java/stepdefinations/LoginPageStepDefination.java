package stepdefinations;

import java.io.IOException;

import HRMS.COM.BASE.TestBase;
import HRMS.COM.PAGES.HrmsLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefination extends TestBase
{
	HrmsLoginPage hlogin;

	@Given("user is already on LoginPage")
	public void user_is_already_on_login_page() throws IOException 
	{
		hlogin = new HrmsLoginPage();
	    TestBase.launchBrowser();
	    TestBase.launchUrl();	   
	 
	}
	
	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) 
	{
		hlogin.enterUserName(username);
		hlogin.enterPassword(password);
	}

	@And("user click on Login button")
	public void user_click_on_login_button() 
	{
	    hlogin.clickOnLogiButton();
	}
	
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() 
	{
	    hlogin.checkTitle();
	}

	
}
