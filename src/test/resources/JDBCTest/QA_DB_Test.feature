Feature: DataBase has correct info as website

	#Here you should verify info in 'my' --> 'self' that connected to the email you are log in to the web site! Please verify name, role, team, batch, campus! 
	@DB
	Scenario: Verify user info on my --> self page
		Given user logs in using "htwinbrowb4@blogspot.com" "kanyabang"
		When user is on the my --> self page
		Then user info should match the DB records using email "htwinbrowb4@blogspot.com"	
#
#	#Verify data from DB on my–> team page (team name, full name according to account and role)
#	@DB
#	Scenario: Verify user info on my --> team page
#		Given user logs in using "htwinbrowb4@blogspot.com" "kanyabang"
#		When user is on the my --> team page
#		Then user info should match the DB records using email "htwinbrowb4@blogspot.com"	
#
#	#Verify according to DB that after log in that user see correct location of his campus , in this situation expected result is "IL"
#	@DB
#	Scenario: Verify correct info campus location State
#		Given user logs in using "htwinbrowb4@blogspot.com" "kanyabang"
#		Then location state should match DB records using campus id of the user	
#
#	#Verify in every room : name of the room, goal of the room, capacity, tv, whiteboard with DB
#	@DB
#	Scenario Outline: Rooms descriptions should match DB
#		Given user logs in using "htwinbrowb4@blogspot.com" "kanyabang"
#		When user click on any room <room> that he can reserve
#		Then correct room info (name, goal, capacity, tv, whiteboard) should be displayed
#		
#		Examples:
#		|room     |
#		|tesla    |
#		|amazon   |
#		|facebook |
#		|googlea  |
#		|apple    |
#		|microsoft|
		