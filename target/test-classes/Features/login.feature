Feature: To validate the login functionality of facebook application

Background:
	Given The user should be in facebook page
	
	@smoke
	Scenario Outline: To validate the login functionality with invalid username and password
	
		When The user has to fill invalid "<username>"and "<password>"
		And The user has to click the "login" button
		Then The user should navigate to the invalid login page
	
	Examples:
	| username | password |
	| manoj    |    34567 |
	