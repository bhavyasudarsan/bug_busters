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
    When Stack user selects Stack from the dropdown menu
    Then Stack user should be directed to the Stack data structure page

  Scenario: Verify that user is able to navigate to Stack by using start button
    Given Stack user is redirct the Home page
    When Stack user clicks the Stack button in the Stack panel
    Then Stack user should be directed to the Stack data structure page

  Scenario: Verify that user is able to navigate to "Operations in Stack"  page
    Given The Stack user is in the Stack page
    When The Stack user clicks Operations in Stack button
    Then The  Stack user be directed to Operations in Stack Page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Operations in Stack" page
    Given The stack user is in the "Operations in Stack" page
    When The stack user clicks "Try Here" button in Stack page
    Then The stack user should be redirected to a page having a try Editor with a "Run" button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Operations in Stack" page
    Given The stack user is on the "try Editor" page
    When The stack user clicks the Run Button without entering the code in the Editor
    Then The stack user should able to see "error message" in alert window

  Scenario: Verify that user receives error for invalid python code for "Operations in Stack" page
    Given The stack user is on the "try Editor" page
    When The stack user clicks the Run Button by entering invalid code  in the Editor
    Then The stack user should able to see an "error message" in alert window

  Scenario: Verify that user is able to see output for valid python code
    Given The stack user is on the "try Editor" page
    When The stack user clicks the Run Button by entering valid code  in the Editor
    Then The stack user should able to see "hello"  in alert window

  Scenario: Verify that user is able to navigate to "Implementation"  page
    Given The Stack user is in the Stack page
    When The Stack user clicks Implementation in Stack button
    Then The  Stack user be directed to Implementation  Page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation" page
    Given The stack user is in the "Implementation" page
    When The stack user clicks "Try Here" button in Stack page
    Then The stack user should be redirected to a page having a try Editor with a "Run" button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Implementation" page
    Given The stack user is on the "try Editor" page
    When The stack user clicks the Run Button without entering the code in the Editor
    Then The stack user should able to see "error message" in alert window

  Scenario: Verify that user receives error for invalid python code for "Implementation" page
    Given The stack user is on the "try Editor" page
    When The stack user clicks the Run Button by entering invalid code  in the Editor
    Then The stack user should able to see an "error message" in alert window
    
   Scenario: Verify that user is able to see output for valid python code
    Given The stack user is on the "try Editor" page
    When The stack user clicks the Run Button by entering valid code  in the Editor
    Then The stack user should able to see "hello"  in alert window
    
     Scenario: Verify that user is able to navigate to "Applications"  page
    Given The Stack user is in the Stack page
    When The Stack user clicks Applications in Stack button
    Then The  Stack user be directed to Applications  Page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Applications" page
    Given The stack user is in the "Applications" page
    When The stack user clicks "Try Here" button in Stack page
    Then The stack user should be redirected to a page having a try Editor with a "Run" button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Applications" page
    Given The stack user is on the "try Editor" page
    When The stack user clicks the Run Button without entering the code in the Editor
    Then The stack user should able to see "error message" in alert window

  Scenario: Verify that user receives error for invalid python code for "Applications" page
    Given The stack user is on the "try Editor" page
    When The stack user clicks the Run Button by entering invalid code  in the Editor
    Then The stack user should able to see an "error message" in alert window
    
   Scenario: Verify that user is able to see output for valid python code
    Given The stack user is on the "try Editor" page
    When The stack user clicks the Run Button by entering valid code  in the Editor
    Then The stack user should able to see "hello"  in alert window
    
    