@stackTest
Feature: Testing the Stack Module in dsAlgo portal

  Background: user launches the dsAlgo application
    Given Stack user launches DsAlgo app url "https://dsportalapp.herokuapp.com/"
    When Stack user clicks "Get Started" Button
    And Stack user clicks "Sign In" Button
    Then Stack user is on the "Login" page
    When Stack user enters Username as "bugbusters" and Password as "Team@bug"
    And Stack user clicks on "Login" button
    Then Stack user should see the Home page on successful login status "You are logged in"

  Scenario: Verify that user is able to navigate to Stack from dropdown
    Given Stack user is on the Home page after signing in
    When user selects Stack from the dropdown menu
    Then the user should be directed to the Stack data structure page

  Scenario: Verify that user is able to navigate to Stack by using start button
    Given Stack is redirct the Home page
    When Stack clicks the Stack button in the Stack panel
    Then the user should be directed to the Stack data structure page
