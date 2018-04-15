Feature: Login Feature Verify Login Functionality

	@signin
	Scenario: Login with authentic user
		Given I am on login Page
		When I click on signIn button
		Then I check of error message