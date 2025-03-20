@linkedTest
Feature: Testing the Linked List Module in dsAlgo portal

  Background: User launches the dsAlgo application
    Given User is in login page
    When User enter username and password from Excel test_data.xlsx sheet "Login"
    And User clicks on Login button

  Scenario: Verify that user is able to navigate to "Linked List" from dropdown
    Given User is redirct the Home page for LinkedList
    When User selects "Linked List" from the "dropdownmenu" for LinkedList
    Then User  should be directed to the "Linked List" data structure page for LinkedList

  Scenario: Verify that user is able to navigate to "Linked List" by using start button
    Given User is redirct the Home page for LinkedList
    When User clicks the "Linked List" button in the Linked List panel for LinkedList
    Then User  should be directed to the "Linked List" data structure page for LinkedList

  Scenario Outline: Verify that user is able to navigate to respective page for LinkedList
    Given User is on the Linked List page after signing in
    When Userr clicks the "<pageName>" button for LinkedList
    Then User should be redirected to the respective page for LinkedList

    Examples: 
      | PageName                        |
      | Introduction                    |
      | Creating Linked List            |
      | Types of Linked List            |
      | Implement Linked List in Python |
      | Traversal                       |
      | Insertion                       |
      | Deletion                        |

  Scenario Outline: Verify that user is able to navigate to Try Editor page for corresponding page
    Given User is on "<Page1>" page for LinkedList
    When User clicks "Try Here" button in "<Page1>" page for LinkedList
    Then User should be redirected to a page having a try Editor with a "Run" button to test for LinkedList

    Examples: 
      | Page1                           |
      | Introduction                    |
      | Creating Linked List            |
      | Types of Linked List            |
      | Implement Linked List in Python |
      | Traversal                       |
      | Insertion                       |
      | Deletion                        |

  Scenario Outline: Verify that user receives error when click on Run button with invalid code for each page
    Given User is on the "Editor" page for "<PageName>" LinkedList
    When User clicks the Run Button by entering invalid data from "<sheetName>" and <rowNumber> for LinkedList
    Then User should be able to see the error for LinkedList

    Examples: 
      | PageName                        | sheetName | rowNumber |
      | Introduction                    | Editor    |         4 |
      | Introduction                    | Editor    |         3 |
      | Creating Linked List            | Editor    |         4 |
      | Creating Linked List            | Editor    |         3 |
      | Types of Linked List            | Editor    |         4 |
      | Types of Linked List            | Editor    |         3 |
      | Implement Linked List in Python | Editor    |         4 |
      | Implement Linked List in Python | Editor    |         3 |
      | Traversal                       | Editor    |         4 |
      | Traversal                       | Editor    |         3 |
      | Insertion                       | Editor    |         4 |
      | Insertion                       | Editor    |         3 |
      | Deletion                        | Editor    |         4 |
      | Deletion                        | Editor    |         3 |

  Scenario Outline: Verify that user receives output when click on Run button with valid code for each page
    Given User is on the "Editor" page for "<PageName>" LinkedList
    When User clicks the Run Button by entering valid data from "<sheetName>" and <rowNumber> for LinkedList
    Then User should be able to see the result for LinkedList

    Examples: 
      | PageName                        | sheetName | rowNumber |
      | Introduction                    | Editor    |         2 |
      | Creating Linked List            | Editor    |         2 |
      | Types of Linked List            | Editor    |         2 |
      | Implement Linked List in Python | Editor    |         2 |
      | Traversal                       | Editor    |         2 |
      | Insertion                       | Editor    |         2 |
      | Deletion                        | Editor    |         2 |
