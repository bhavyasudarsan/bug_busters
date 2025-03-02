@treeTest
Feature: Testing the Tree Module in dsAlgo portal

Background: user launches the dsAlgo application
Given user launches the dsAlgo application
When user click get started button
And user click sign in button
Then user is in login page
When User enters Username as "bugbusters" and Password as "Team@bug" 
And User clicks on Login button
Then User should see the Home page on successful login status "You are logged in"
    
Scenario: Verify that user is able to navigate to Tree data structure page
Given The user is in the Home page after Sign in 
When The user clicks the Get Started button in Tree Panel
Then The user be redirected to the Tree Data Structure Page 

Scenario: Verify that user is able to navigate to Overview of Trees page
Given The user is in the Tree page after Sign in
When The user clicks the Overview of Trees button
Then The user be redirected to the Overview of Trees Page

