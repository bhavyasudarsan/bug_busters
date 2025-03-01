
Feature: Data Strcure Functionality
 
Background: The user sign in to dsAlgo Portal
Given User Launches DsAlgo portal  


Scenario: Verify that user is able to navigate to Data Structures - Introduction page
    Given The user is in the Home page after logged in
    When The user clicks the Get Started button in Data Structures - Introduction page
    Then The user should land in "Data Structures- Introduction" Page
   

 