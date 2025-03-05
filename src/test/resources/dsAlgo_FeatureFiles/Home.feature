@homeTest
Feature: dsAlgo

  @tag1
  Scenario: Verify that user is able to open the dsAlgo Portal
    Given Browser is open
    When Home user enter  the correct URL for Heroku app
    Then Home User is at dsAlgo  app with "Get Started" btn.

  @tag2
  Scenario: Verify the Home page for a user without Sign in
    Given Browser is open
    And The Homepage user is on the DS Algo Portal
    When The Homepage user clicks the "Get Started" button 
    Then The Homepage user should be navigated to the Data Structure Introduction page, which displays the "Register" and "Sign in" links.
