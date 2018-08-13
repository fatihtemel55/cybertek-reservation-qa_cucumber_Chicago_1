Feature: 

	
	@SPA-1326 @SPA-1646 @SPA-1316 @It_Club
	Scenario Outline: User reserve study room 
		Given the user is on the home page
		And the user sign in to the Plan page "<login>" and "<password>"
		|login                   |password |
		|htwinbrowb4@blogspot.com|kanyabang|
		When the user click on hunt menu btn
		Then user should be on hunt page
		Then user  choose date , time and  click search 
		Then user can see all availble rooms , choose one of them  and book 
		And user need to comfirm
		Then users reservation need to displayed in schedule page
			

	
	@SPA-1425 @SPA-1646 @SPA-1316 @It_Club
	Scenario: Cancel the reservation
		Given the user is on the home page
		And the user sign in to the Plan page "<login>" and "<password>"
		|login                   |password |
		|htwinbrowb4@blogspot.com|kanyabang|
		Then user clicks on schedule button
		Then user need to find the revervation which is going to cancel
		And user clicks on  cancel conference
		Then users reservation need to deleted from schedule page
			

	#Admin user should be able to remove batches and teams through UI
	@SPA-1578 @SPA-1646 @SPA-1316 @It_Club
	Scenario: Add batches and teams by Admin
		Given the user is on the home page
		And the user sign in to the Plan page "<login>" and "<password>"
		|login                   |password |
		|htwinbrowb4@blogspot.com|kanyabang|
		Then admin clicks on the schedule
		And admin adds "batches" and "teams"
		Then admin should be able to add it all succesfully	

	#Teacher under admin credentials can canceled conference for any "batch" and "teams"
	@SPA-1635 @SPA-1646 @SPA-1316 @It_Club
	Scenario: Remove batches and teams by Admin
		Given admin goes to reservation application
		Then admin clicks on the schedule
		And choose any conference
		Then admin should be able canceled conference succesfully	

	#When user cancel the reservation email notification should be sent
	@SPA-1641 @SPA-1646 @SPA-1316 @It_Club
	Scenario: Emailing notification after scheduling reservations
		Given user on a schedule menu
		And choose any conference
		Then user cancel the reservation 
		And should receive email notification