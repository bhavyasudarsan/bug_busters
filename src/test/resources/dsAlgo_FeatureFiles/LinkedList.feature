@linkedTest
Feature: Testing the Linked List Module in dsAlgo portal

  Background: User launches the dsAlgo application
    Given User is in login page
    When User enter username and password from Excel test_data.xlsx sheet "Login"
    And User clicks on Login button

  Scenario: Verify that user is able to navigate to "Linked List" from dropdown
    Given LinkedUser is on the Home page after signing in
    When LinkedUser selects "Linked List" from the dropdown menu
    Then LinkedUser  should be directed to the "Linked List" data structure page

  Scenario: Verify that user is able to navigate to "Linked List" by using start button
    Given LinkedUser is redirct the Home page
    When LinkedUser clicks the "Linked List" button in the Linked List panel
    Then LinkedUser  should be directed to the "Linked List" data structure page

  Scenario: Verify that user is able to navigate to "Introduction" page
    Given LinkedUser is on the Linked List page after signing in
    And LinkedUser selects "Linked List" from the dropdown menu
    When LinkedUser clicks the "Introduction" button
    Then LinkedUser should be redirected to the "Introduction" page

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Introduction" page
    Given LinkedUser is on "Introduction" page
    When LinkedUser clicks "Try Here" button in "Introduction" page
    Then LinkedUser should be redirected to a page having a try Editor with a "Run" button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Introduction" page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button without entering the code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should  able to see error message in alert window without entering value from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user is able to navigate to "Try Editor" page for "Introduction" page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should able to see an error message in alert window  by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user is able to see output for valid python code
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering valid python code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should able to see hello in the console by entering valid python code in the Editor from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user is able to navigate to "Creating Linked LIst"  page
    Given LinkedUser is in the Linked List page
    When LinkedUser clicks "Creating Linked LIst" button
    Then LinkedUser should be redirected to Creating Linked LIst page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Creating Linked LIst" page
    Given LinkedUser is on the Creating Linked LIst page
    When LinkedUser clicks "Try Here"  button in  Creating Linked LIst page
    Then LinkedUser should be redirected to a page having a try Editor with a "Run" button to test

  Scenario: Verify that user receives error when click on Run button without entering code for Creating Linked LIst page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button without entering the code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should  able to see error message in alert window without entering value from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user receives error for invalid python code for "Creating Linked LIst" page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should able to see an error message in alert window  by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user is able to see output for valid python code
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering valid python code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should able to see hello in the console by entering valid python code in the Editor from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user is able to navigate to "Types of Linked List" page
    Given LinkedUser is in the Linked List page
    When LinkedUser clicks Types of Linked List button
    Then LinkedUser should be redirected to Types of Linked List page

  Scenario: Verify that user is able to navigate to "try Editor" page for "Types of Linked List" page
    Given LinkedUser is on the Creating Linked LIst page
    When LinkedUser clicks "Try Here"  button in  Creating Linked LIst page
    Then LinkedUser should be redirected to a page having a try Editor with a "Run" button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Types of Linked List" page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button without entering the code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should  able to see error message in alert window without entering value from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user receives error for invalid python code for "Types of Linked List" page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should able to see an error message in alert window  by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user is able to see output for valid python code
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering valid python code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should able to see hello in the console by entering valid python code in the Editor from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user is able to navigate to "Implement Linked List in Python" page
    Given LinkedUser is in the Linked List page
    When LinkedUser clicks Implement Linked List in Python button
    Then LinkedUser should be redirected to Implement Linked List in Python page

  Scenario: Verify that user is able to navigate to "try Editor" page for Implement Linked List in Python page
    Given LinkedUser is on the Implement Linked List in Python page
    When LinkedUser clicks "Try Here"  button in  Implement Linked List in Python page
    Then LinkedUser should be redirected to a page having a try Editor with a "Run" button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Implement Linked List in Python" page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button without entering the code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should  able to see error message in alert window without entering value from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user receives error for invalid python code for "Implement Linked List in Python" page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should able to see an error message in alert window  by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user is able to see output for valid python code
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering valid python code in the Editor from Excel test_data.xlsx sheet "Linkedlist"
    Then LinkedUser should able to see hello in the console by entering valid python code in the Editor from Excel test_data.xlsx sheet "Linkedlist"

  Scenario: Verify that user is able to navigate to "Traversal" page
    Given LinkedUser is in the Linked List page
    When LinkedUser clicks Traversal button
    Then LinkedIser should be redirected to Traversal page

  Scenario: Verify that user is able to navigate to "try Editor" page for Traversal page
    Given LinkedUser is on the Traversal page
    When LinkedUser clicks "Try Here"  button in  Implement Linked List in Python page
    Then LinkedUser should be redirected to a page having a try Editor with a "Run" button to test

  Scenario: Verify that user receives error when click on Run button without entering code for "Implement Linked List in Python" page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button without entering the code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should  able to see error message in alert window without entering value from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user receives error for invalid python code for "Implement Linked List in Python" page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should able to see an error message in alert window  by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user is able to see output for valid python code
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering valid python code in the Editor from Excel test_data.xlsx sheet "Linkedlist"
    Then LinkedUser should able to see hello in the console by entering valid python code in the Editor from Excel test_data.xlsx sheet "Linkedlist"

  Scenario: Verify that user is able to navigate to "Insertion" page
    Given LinkedUser is in the Linked List page
    When LinkedUser clicks Insertion button
    Then LinkedIser should be redirected to Insertion page

  Scenario: Verify that user is able to navigate to "try Editor" page for Insertion page
    Given LinkedUser is on the Insertion page
    When LinkedUser clicks "Try Here"  button in  Insertion page
    Then LinkedUser should be redirected to a page having a try Editor with a "Run" button to test

  Scenario: Verify that user receives error when click on Run button without entering code for Insertion page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button without entering the code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should  able to see error message in alert window without entering value from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user receives error for invalid python code for Insertion page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should able to see an error message in alert window  by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user is able to see output for valid python code
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering valid python code in the Editor from Excel test_data.xlsx sheet "Linkedlist"
    Then LinkedUser should able to see hello in the console by entering valid python code in the Editor from Excel test_data.xlsx sheet "Linkedlist"

  Scenario: Verify that user is able to navigate to "Deletion" page
    Given LinkedUser is in the Linked List page
    When LinkedUser clicks Deletion button
    Then LinkedIser should be redirected to Deletion page

  Scenario: Verify that user is able to navigate to "try Editor" page for Insertion page
    Given LinkedUser is on the Insertion page
    When LinkedUser clicks "Try Here"  button in  Insertion page
    Then LinkedUser should be redirected to a page having a try Editor with a "Run" button to test

  Scenario: Verify that user receives error when click on Run button without entering code for Insertion page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button without entering the code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should  able to see error message in alert window without entering value from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user receives error for invalid python code for Insertion page
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should able to see an error message in alert window  by entering invalid python code in the Editor from Excel test_data.xlsx sheet "Editor"

  Scenario: Verify that user is able to see output for valid python code
    Given LinkedUser is on the "try Editor" page
    When LinkedUser clicks the Run Button by entering valid python code in the Editor from Excel test_data.xlsx sheet "Editor"
    Then LinkedUser should able to see hello in the console by entering valid python code in the Editor from Excel test_data.xlsx sheet "Editor"
