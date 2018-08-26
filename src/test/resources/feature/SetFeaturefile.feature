@SPA-1260
Feature: User should be able to login

	
	Scenario Outline: User should be able to login 
		Given user goes to the homepage
		Then  user passes "<email>" and "<password>"
		And   user clicks signin
		Then  user verifies if text "IL" exist
		
		Examples:
		|	email		   |	password|
		|abowfinc1@ning.com| emeryvassar|
	