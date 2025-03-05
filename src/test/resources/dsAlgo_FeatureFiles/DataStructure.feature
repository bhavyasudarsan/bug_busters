Feature: Data Structure

Background: The user sign in to dsAlgo Portal
		
Given user is in login page
When user enters Username as "bugbusters" and Password as "Team@bug" 
And user clicks on Login button
Then user should see the Home page on successful login status "You are logged in" 

Scenario Outline: Verify that user is able to navigate to Data Structure page
Given The user is in the Home page after Sign in
When The user clicks the Get Started button in Data Structure Panel 
Then The user be directed to "Data Structure" Page
    
Scenario: Verify that user is able to navigate to Time Complexity page
Given The user is in the Data Structures page
When The user clicks Time Complexity button
Then The user should be redirected to "Time Complexity" page
    
Scenario: Verify that user is able to navigate to try Editor page
Given The user is in the Time Complexity page
When The user clicks Try Here button
Then The user should be redirected to a page having an "try Editor" with a Run button to test
