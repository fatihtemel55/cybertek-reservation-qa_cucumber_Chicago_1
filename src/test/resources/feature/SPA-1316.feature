Feature: 

	#User should be able to reserve room for minimum 30 min, maximum 120 min
	@SPA-1320 @SPA-1316 @IT_Club
	Scenario Outline: Minimum room reservation time 30 min, 2 hours max
		Given the user is on the home page
		And the user sign in to the Plan page "<login>" and "<password>"
		|login                   |password |
		|htwinbrowb4@blogspot.com|kanyabang|
		When the user click on hunt menu btn
		Then the user be able to reserve room <value> "<time>" min.
		
		Examples:
		|value  |time|
		|minimum|30  |
		|maximum|120 |	

	#go to home page url and verify title
	@SPA-1259 @SPA-1316 @SPA-1261
	Scenario: In the hunt page date should be calnder
		Given the user is on the home page
		And the user sign in to the Plan page "<login>" and "<password>"
		|login                   |password |
		|htwinbrowb4@blogspot.com|kanyabang|
		When the user click on hunt menu btn
		Then user clicks drop down button on the date field
		Then user should see a calander
		
		
			

	
	@SPA-1400 @SPA-1316 @It_Club
	Scenario: students should only see their location
		Given the user is on the home page
		And the user sign in to the Plan page "<login>" and "<password>"
		|login                   |password |
		|htwinbrowb4@blogspot.com|kanyabang|
		Then user should see the subtitle as IL	

	
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
			

	
	@SPA-1386 @SPA-1316 @It_Club
	Scenario: Student reserve study room
		Given the user is on the home page
		And the user sign in to the Plan page "<login>" and "<password>"
		|login                   |password |
		|htwinbrowb4@blogspot.com|kanyabang|
		When the user click on hunt menu btn
		Then user should be on hunt page
		Then user  choose date , time and  click search 
		Then user can see all availble rooms 
		When user is student ,he/she can not reserve room
		
		
		
		
			

	
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
			

	#|User should be able to see daily view for each room|
	#
	#|User should be able to see weekly view for each room|
	@SPA-1558 @SPA-1316
	Scenario: User should be able to see daily view for each room
		Given the user is on the home page
		And the user sign in to the Plan page "<login>" and "<password>"
		|login                   |password |
		|htwinbrowb4@blogspot.com|kanyabang|
		Then user click on room name(Facebook,Amazon,Tesl e.t.c)
		Then user verify that sum of the days is for a 7 days
		Then user verify that the working hours are between 7:00 AM to 10:00 PM for each day
		Then user verify that the hours are presented at 30 minute range like 7:00, 7:30, 8:00,8:30 e.t.c
		
		#Repeat the steps mentioned above for each Cybertek room
		
			

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

	#Teacher as an admin can remove all, batches and teams using API
	@SPA-1575 @SPA-1316 @It_Club
	Scenario: Remove batches and teams using API
		When user hits add api with "batch" and "teams"
		Then user should be able to remove all sucessfully	

	#Teacher as an admin can add batches and teams using API
	@SPA-1568 @SPA-1316 @It_Club
	Scenario: Add batches and teams using API
		When user hits add API with "batch" and "teams"
		Then user should be able to add sucessfully	

	#Reservation options should be given in a format: $time to $time
	@SPA-1602 @SPA-1316 @IT_Club
	Scenario: Reservation options should be given in right format
		Given the user is on the home page
		And the user sign in to the Plan page "<login>" and "<password>"
		|login                   |password |
		|htwinbrowb4@blogspot.com|kanyabang|
		When the user click on hunt menu btn
		Then user choose date of the reservation he wants
		And user should get option to choose time from "7" a.m. till "10" p.m.	

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