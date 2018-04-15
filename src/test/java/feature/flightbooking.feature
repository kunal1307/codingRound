Feature: FlightBooking Feature Verify booking functionality

	@flight
	Scenario Outline: Login with authentic user
		Given I am on login Page
		When I enter from as <FROM> and to <TO>
		And I click on search button
		Then I should see the search Summary
	Examples:
	|FROM|TO|
	|Bangalore|Delhi|