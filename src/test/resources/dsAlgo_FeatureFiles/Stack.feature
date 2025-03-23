@stackTest
Feature: Testing the Stack Module in dsAlgo portal

  Background: User launches the dsAlgo application
    Given User is in login page
    When User enter username and password from Excel test_data.xlsx sheet "Login"
    And User clicks on Login button

  Scenario: Verify that user is able to navigate to Stack from dropdown
    Given User is redirct the Home page for Stack
    When User selects Stack from the dropdownmenu for Stack
    Then User should be directed to the Stack data structure page for Stack

  Scenario: Verify that user is able to navigate to Stack by using start button
    Given User is redirct the Home page for Stack
    When User clicks the Stack button in the Stack panel
    Then User should be directed to the Stack data structure page for Stack

  Scenario Outline: Verify that user is able to navigate to corresponding pages
    Given The user is in the Stack page for Stack
    When The user clicks "<PageName>" button for Stack
    Then The user be directed to "<PageName>" for Stack

    Examples: 
      | PageName            |
      | Operations in Stack |
      | Implementation      |
      | Applications        |

  Scenario: Verify that user is able to navigate to "try Editor" page for "Operations in Stack" page
    Given The user is in the "Operations in Stack" page for Stack
    When The user clicks "Try Here" button in Stack page for Stack
    Then The user should be redirected to a page having a try Editor with a "Run" button to test for Stack

  Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation" page
    Given The user is in the "Implementation" page for Stack
    When The user clicks "Try Here" button in Stack page for Stack
    Then The user should be redirected to a page having a try Editor with a "Run" button to test for Stack

  Scenario: Verify that user is able to navigate to "try Editor" page for "Applications" page
    Given The user is in the "Applications" page for Stack
    When The user clicks "Try Here" button in Stack page for Stack
    Then The user should be redirected to a page having a try Editor with a "Run" button to test for Stack

  Scenario Outline: Verify that user receives error when click on Run button with invalid code for each page
    Given The user is on the try Editor of "<PageName>" for Stack
    When User clicks the Run Button by entering invalid data from "<sheetName>" and <rowNumber> for Stack
    Then User should be able to see the error for Stack

    Examples: 
      | PageName            | sheetName | rowNumber |
      | Operations in Stack | Editor    |         4 |
      | Operations in Stack | Editor    |         3 |
      | Implementation      | Editor    |         4 |
      | Implementation      | Editor    |         3 |
      | Applications        | Editor    |         4 |
      | Applications        | Editor    |         3 |

  Scenario Outline: Verify that user receives result when click on Run button with valid code for each page
    Given The user is on the try Editor of "<PageName>" for Stack
    When User clicks the Run Button by entering valid data from "<sheetName>" and <rowNumber> for Stack
    Then User should be able to see the output for Stack

    Examples: 
      | PageName            | sheetName | rowNumber |
      | Operations in Stack | Editor    |         2 |
      | Implementation      | Editor    |         2 |
      | Applications        | Editor    |         2 |
