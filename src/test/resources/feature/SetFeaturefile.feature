@Runner
Feature: sinan

@1633
Scenario: Remove batches and teams by Admin
Given admin goes to reservation application
Then admin clicks on the schedule
And choose any conference
Then admin should be able canceled conference succesfully

@1635
Scenario: Remove batches and teams by Admin
Given admin goes to reservation application
Then admin clicks on the schedule
And choose any conference
Then admin should be able canceled conference succesfully

@1641
Scenario: Emailing notification after scheduling reservations
Given user on a schedule menu
And choose any conference
Then user cancel the reservation 
And should receive email notification

