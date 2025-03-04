@arrayTest
Feature: Testing the Array Module in dsAlgo portal

Background: Array user launches the dsAlgo application
Given Array user is in login page 
When Array User enters Username as "bugbusters" and Password as "Team@bug" 
And Array User clicks on Login button
Then Array User should see the Home page on successful login status "You are logged in"
    
Scenario: Verify that user is able to navigate to Arrays in Python page
Given The user is in the Array page after Sign in
When The user clicks Arrays in Python button
Then The user should be redirected to Arrays in Python page

Scenario: Verify that user is able to navigate to try Editor page for Arrays in Python page
Given The user is on the Arrays in Python page
When The user clicks Try Here button in Arrays in Python page
Then The user should be redirected to a page having an try Editor with a Run button to test