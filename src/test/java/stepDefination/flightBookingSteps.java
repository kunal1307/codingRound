package stepDefination;

import pages.*;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class flightBookingSteps {
	reusableFunctions reuse= new reusableFunctions();
	flightBooking flightBookingObjects=new flightBooking();
	@Given("^I am on flight booking page$")
		public void homage() {
			reuse.openUrl();
		}
	@When("^I enter from as \"(.*)\" and to \"(.*)\"$")
	public void searchflights(String from, String to) {
		flightBookingObjects.findflight(from , to);
	}
	@And("^I click on search button$")
	public void clicksearchbtn() {
		flightBookingObjects.clickonSearchButton();
	}
	@Then("^I should see the search Summary$")
	public void checkForSearchSummary() {
		assertTrue("Element not Present",flightBookingObjects.checksearchSummary());
		reuse.closeDriver();
	}
	

}
