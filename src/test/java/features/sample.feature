Feature: firstCry 
Background:
 Given Chrome browser is 74
 And firstCry is up and running
 
 
  Scenario: 1. TC1
     When I am in home screen
     Then I verify the following are present
     |Email|Mobile_no_box|Sign_Up|
     And I check that mobile prefix has 91
     
     
   Scenario: 4. TC4
     When I am in home screen
     And scroll down
     Then I verify that scroll up is present
   

     
