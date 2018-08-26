<<<<<<< HEAD
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
	
=======
@Runner
Feature: sinan

@1633 @1635
Scenario: Remove batches and teams by Admin
Given admin goes to reservation application
Then admin clicks on the schedule
And choose one conference
Then admin should be able canceled conference succesfully

@1641
Scenario: Emailing notification after scheduling reservations
Given user on a schedule menu
And choose any conference
Then user cancel the reservation 
And should receive email notification

>>>>>>> 6c61b12574864a214859291a33b5074e15cf6ae3
