Feature: Testing Linked List page in DsAlgo page

  Background: 
    Given User launches DsAlgo app url "https://dsportalapp.herokuapp.com/"
    When User clicks "Get Started" Button
    And User clicks "Sign In" button
    Then User is on the "Login" page

  Scenario Outline: Login functionality
    When User enters Username "<username>" and Password "<password>"
    When User clicks on Login button with expected status as "<status>"
    Then User should see the Home page on successful Login with status "<status>"

    Examples: 
      | username   | password | status            |
      | bugbusters | Team@bug | You are logged in |

  #@tag1
  #Scenario: Verify that user is able to navigate to "Linked List" data structure page
    #Given the user is on the Home page after signing in
    #When the user clicks the "Getting Started" button in the Linked List panel
    #And the user selects "Linked List" from the dropdown menu
    #Then the user should be directed to the "Linked List" data structure page

  #@tag2
  #Scenario: Verify that user is able to navigate to "Introduction" page
    #Given the user is on the Linked List page after signing in
    #When the user clicks the "Introduction" button
    #Then the user should be redirected to the "Introduction" page
