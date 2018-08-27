<<<<<<< HEAD
@Runner
Feature: All user stories
	Scenario Outline: User reserve study room 
		Given the user is on the home page
		And the user sign in to the Plan page "<login>" and "<password>"
		
		When the user click on hunt menu btn
		Then user should be on hunt page
		Then user  choose date , time and  click search 
		Then user can see all availble rooms , choose one of them  and book 
		And user need to comfirm
		Then users reservation need to displayed in schedule page
		
Examples:
|login                   |password |
    |htwinbrowb4@blogspot.com		  |	kanyabang			|
	#|efieldenba@cbslocal.com		  |	claudinebarnsley	|
	#|osurmeyersbf@illinois.edu		  |	jacquenettakelling	|
 	#|sbirdbj@fc2.com				  |	asenorval			|
	#|ggreeninbm@flavors.me			  |	arleenjoney			|
	#|larnaezbp@symantec.com			  |	kialstowgill		|
	#|hcranfieldbx@blinklist.com		  |	belviaizzatt		|
	#|abowfinc1@ning.com				  |	emeryvassar			|
=======
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
>>>>>>> 71c4ef0954724bdf15118ab1996c8d25fb6dfaa4
