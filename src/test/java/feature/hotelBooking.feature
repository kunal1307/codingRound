Feature: HotelBooking Feature Verify Hotel Booking Functionality

	@hotel
	Scenario Outline: Login with authentic user
		Given I am on login Page
		I enter hotel place as <PLACE> and personcount as <PERSON> details
		And I click on hotel booking Search button
	Examples:
	|PLACE|PERSON|
	|Indiranagar, Bangalore|1 room, 2 adults|