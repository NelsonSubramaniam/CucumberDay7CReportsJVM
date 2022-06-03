Feature: To validate the registration functionality of facebook application

Background: 
	Given The user should be in facebook page
	
	@retest
	Scenario: To validate the registration functionality
		When The user has to click create new account link
		And The user has to fill the firstname, lastname and other details
		And The user has to click the "signup" button
		Then The user should get message successfull registered