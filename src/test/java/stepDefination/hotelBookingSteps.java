package stepDefination;

import pages.*;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

public class hotelBookingSteps {
	reusableFunctions reuse= new reusableFunctions();
	hotelBooking hotelBookingObjects=new hotelBooking();
	
	@Given("^I am on hotel booking page$")
	public void openHotelBookingPage() {
		reuse.openUrl();
		hotelBookingObjects.clickOnhotellnk();
	}
	@When("^I enter hotel place as \"(.*)\" and personcount as \"(.*)\" details$")
	public void hoteldetails(String place, String count) {
		hotelBookingObjects.findhotels(place, count);
	}
	@And("^I click on hotel booking Search button$")
	public void clicksearchHotelBtn() {
		hotelBookingObjects.clckOnHotelSearchButton();
		reuse.waitFor(3000);
		reuse.closeDriver();
	}

}
