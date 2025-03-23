@homeTest
Feature: dsAlgo

  @tag1
  Scenario: Verify that user is able to open the dsAlgo Portal
    Given Browser is open
    When The user enter  the correct URL for Heroku app
    Then The user is at dsAlgo  app with "Get Started" btn.

  @tag2
  Scenario: Verify the Home page for a user without Sign in
    Given Browser is open
    And The user is on the DS Algo Portal
    When The user clicks the "Get Started" button at Portal
    Then The user should be navigated to the Data Structure Introduction page, which displays the "Register" and "Sign in" links.

  @tag3
  Scenario: Verify that user is able to view options for "Data Structures" dropdown on home page without Sign in
    Given Browser is open
    And The user at the Home
    When The user clicks the Data Structures dropdown at Home
    Then The  user should able to see 6 options "Arrays,Linked List,Stack,Queue,Tree,Graph" in dropdown menu at Home 

  @tag4
  Scenario: Verify that user able to see warning message while selecting "Arrays" from the drop down without Sign in
    Given Browser is open
    And The user at the Home
    When The user selects "Arrays" from the drop down without Sign in.
    Then The user should able to see a warning message "You are not logged in" at Home 

  @tag5
  Scenario: Verify that user able to see warning message while selecting "Linked List" from the drop down without Sign in
    Given The user at the Home
    When The user selects "Linked List" from the drop down without Sign in at Home
    Then The user should able to see a warning message "You are not logged in" at Home

  @tag6
  Scenario: Verify that user able to see warning message while selecting "Stack" from the drop down without Sign in
    Given The user at the Home
    When The user selects "Stack" from the drop down without Sign in at Home
    Then The user should able to see a warning message "You are not logged in" at Home

  @tag7
  Scenario: Verify that user able to see warning message while selecting "Queue" from the drop down without Sign in
    Given The user at the Home
    When The user selects "Queue" from the drop down without Sign in at Home 
    Then The user should able to see a warning message "You are not logged in" at Home 

  @tag8
  Scenario: Verify that user able to see warning message while selecting "Tree" from the drop down without Sign in
    Given The user at the Home
    When The user selects "Tree" from the drop down without Sign in at Home 
    Then The user should able to see a warning message "You are not logged in" at Home

  @tag9
  Scenario: Verify that user able to see warning message while selecting "Graph" from the drop down without Sign in
    Given The user at the Home
    When The user selects "Graph" from the drop down without Sign in at Home 
    Then The user should able to see a warning message "You are not logged in" at Home
     @tag9
 
  @tag10
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Data Structures-Introduction" on the home page without Sign in
    Given The user at the Home
    When The user clicks "Get Started" buttons of "Data Structures-Introduction" on the homepage without Sign in at Home 
    Then The user should able to see a warning message "You are not logged in" at Home

  @tag11
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Array" on the home page without Sign in
    Given The user at the Home
    When The user clicks "Get Started" buttons of "Array" on the homepage without Sign in at Home 
    Then The user should able to see a warning message "You are not logged in" at Home

  @tag12
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Linked List" on the home page without Sign in
    Given The user at the Home
    When The user clicks "Get Started" buttons of "Linked List" on the homepage without Sign in at Home 
    Then The user should able to see a warning message "You are not logged in" at Home

  @tag13
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Stack" on the home page without Sign in
    Given The user at the Home
    When The user clicks "Get Started" buttons of "Stack" on the homepage without Sign in at Home 
    Then The user should able to see a warning message "You are not logged in" at Home

  @tag14
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Queue" on the home page without Sign in
    Given The user at the Home
    When The user clicks "Get Started" buttons of "Queue" on the homepage without Sign in at Home 
    Then The user should able to see a warning message "You are not logged in" at Home

  @tag15
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Tree" on the home page without Sign in
    Given The user at the Home
    When The user clicks "Get Started" buttons of "Tree" on the homepage without Sign in at Home   
    Then The user should able to see a warning message "You are not logged in" at Home
