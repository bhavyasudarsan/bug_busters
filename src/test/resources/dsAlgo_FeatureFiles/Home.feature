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
  @tag3
  Scenario: Verify that user is able to view options for "Data Structures" dropdown on home page without Sign in
    Given Browser is open
    And The user at the Homepage
    When The Homepage user clicks the Data Structures dropdown
    Then The Homepage user should able to see 6 options "Arrays,Linked List,Stack,Queue,Tree,Graph" in dropdown menu
  @tag4
  Scenario: Verify that user able to see warning message while selecting "Arrays" from the drop down without Sign in
    Given Browser is open
    And The user at the Homepage
    When The user selects "Arrays" from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"
   @tag5
  Scenario: Verify that user able to see warning message while selecting "Linked List" from the drop down without Sign in
    Given The user at the Homepage
    When The user selects "Linked List" from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"

  @tag6
  Scenario: Verify that user able to see warning message while selecting "Stack" from the drop down without Sign in
    Given The user at the Homepage
    When The user selects "Stack" from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"

  @tag7
  Scenario: Verify that user able to see warning message while selecting "Queue" from the drop down without Sign in
    Given The user at the Homepage
    When The user selects "Queue" from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"

  @tag8
  Scenario: Verify that user able to see warning message while selecting "Tree" from the drop down without Sign in
    Given The user at the Homepage
    When The user selects "Tree" from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"

  @tag9
  Scenario: Verify that user able to see warning message while selecting "Graph" from the drop down without Sign in
    Given The user at the Homepage
    When The user selects "Graph" from the drop down without Sign in.
    Then The user should able to see an warning message "You are not logged in"
  @tag10
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Data Structures-Introduction" on the home page without Sign in
    Given The user at the Homepage
    When The user clicks "Get Started" buttons of "Data Structures-Introduction" on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"
    
     @tag11
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Array" on the home page without Sign in
    Given The user at the Homepage
    When The user clicks "Get Started" buttons of "Array" on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"
   @tag12
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Linked List" on the home page without Sign in
    Given The user at the Homepage
    When The user clicks "Get Started" buttons of "Linked List" on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"
  
     @tag13
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Stack" on the home page without Sign in
    Given The user at the Homepage
    When The user clicks "Get Started" buttons of "Stack" on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"
     @tag14
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Queue" on the home page without Sign in
    Given The user at the Homepage
    When The user clicks "Get Started" buttons of "Queue" on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"
     @tag15
  Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Tree" on the home page without Sign in
    Given The user at the Homepage
    When The user clicks "Get Started" buttons of "Tree" on the homepage without Sign in
    Then The user should able to see an warning message "You are not logged in"
    
  
    