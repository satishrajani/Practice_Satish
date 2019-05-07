Feature: firstCry 
Background:
 Given firstCry is up and launched successfully
 
  Scenario: 1. TC1
     When I am in home screen
     Then I verify the following are present
     |Email|Mobile_no_box|Sign_Up|
     And I verify that mobile prefix has 91
     
     
   Scenario: 4. TC4
     When I am in home screen
     And scroll down
     Then I verify that scroll up is present
   

     
