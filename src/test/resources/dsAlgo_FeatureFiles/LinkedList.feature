@LinkedTest
Feature: Testing the Linked List Module in dsAlgo portal

  Background: user launches the dsAlgo application
    Given User launches DsAlgo app url "https://dsportalapp.herokuapp.com/"
    When User clicks "Get Started" Button
    And User clicks "Sign In" Button
    Then User is on the "Login" page
    When User enters Username as "bugbusters" and Password as "Team@bug"
    And User clicks on "Login" button
    Then User should see the Home page on successful login status "You are logged in"

  Scenario: Verify that user is able to navigate to "Linked List" from dropdown
    Given the user is on the Home page after signing in
    When user selects "Linked List" from the dropdown menu
    Then the user should be directed to the "Linked List" data structure page

  Scenario: Verify that user is able to navigate to "Linked List" by using start button
    Given the user is redirct the Home page
    When the user clicks the "Linked List" button in the Linked List panel
    Then the user should be directed to the "Linked List" data structure page

  Scenario: Verify that user is able to navigate to "Introduction" page
    Given the user is on the Linked List page after signing in
    And user selects "Linked List" from the dropdown menu
    When the user clicks the "Introduction" button
    Then the user should be redirected to the "Introduction" page
