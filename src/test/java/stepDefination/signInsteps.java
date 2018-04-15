package stepDefination;

import pages.*;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class signInsteps {
	signInpage signInPageObject= new signInpage();
	reusableFunctions reuse= new reusableFunctions();
	@Given("^I am on login Page$")
	public void login(){
		reuse.openUrl();
		signInPageObject.navigatetologinPage();
		signInPageObject.clickOnSignInBtn();
		}
	@When("^I click on signIn button$")
	public void signInbtnclick() {
		signInPageObject.clickOnSignInBtn();
	}
	@Then("I check of error message")
	public void errormsg() {
		assertTrue("Element not Present",signInPageObject.checkforErrormsg());
		reuse.closeDriver();
	}
}
