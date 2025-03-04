@treeTest
Feature: Testing the Tree Module in dsAlgo portal

Background: Tree user sign in the dsAlgo application
Given Tree user is in login page
When Tree user enters Username as "bugbusters" and Password as "Team@bug" 
And Tree user clicks on Login button
Then Tree user should see the Home page on successful login status "You are logged in"
    
Scenario: Verify that user is able to navigate to Overview of Trees page
Given The user is in the Tree page after Sign in
When The user clicks the Overview of Trees button
Then The user be redirected to the Overview of Trees Page

Scenario: Verify that user is able to navigate to try Editor page for Overview of Trees page
Given The user is in the Overview of Trees page
When The user clicks Try here button in Overview of Trees page
Then The user should be redirected to the try Editor page with a Run button to test