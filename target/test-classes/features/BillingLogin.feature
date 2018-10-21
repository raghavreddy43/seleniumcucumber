#----------------------------------
# Empty Cucumber .feature file
#----------------------------------

Feature: Activbill Login funtionality 
   
Meta:
activpm:Login

Narrative:I want to login to the system with a valid user name and password
Scenario: 4. Verify that user can successfully login with a valid username and a valid password.
Given I open billing login web page
When I login with the username  and password 
Then Home Page is displayed