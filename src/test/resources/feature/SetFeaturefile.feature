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
