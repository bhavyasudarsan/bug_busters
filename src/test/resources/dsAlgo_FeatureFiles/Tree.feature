@treeTest
Feature: Testing the Tree Module in dsAlgo portal

Background: User launches the dsAlgo application
Given User is in login page
When User enter username and password from Excel test_data.xlsx sheet "Login"
And User clicks on Login button 

Scenario: Verify that user is able to navigate to Overview of Trees page
Given The user is in the Tree page after Sign in
When The user clicks the Overview of Trees button
Then The user be redirected to the Overview of Trees Page

Scenario: Verify that user is able to navigate to try Editor page for Overview of Trees page
Given The user is in the Overview of Trees page
When The user clicks Try here button in Overview of Trees page
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user receives error for invalid python code for Overview of Trees page
Given The user is in the try Editor page from Overview of Trees page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Overview of Trees page
Given The user is in the try Editor page from Overview of Trees page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|
  
Scenario: Verify that user is able to navigate to Terminologies Page 
Given The user is in the Tree page after Sign in
When The user clicks the Terminologies button
Then The user be redirected to the "Terminologies" page

Scenario: Verify that user is able to navigate to try Editor page for Terminologies page
Given The user is in Terminologies page
When The user clicks Try here button in Terminologies page
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user receives error for invalid python code for Terminologies page
Given The user is in the try Editor page from Terminologies page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Terminologies page
Given The user is in the try Editor page from Terminologies page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|

Scenario: Verify user is able to navigate to Types of Trees page
Given The user is in the Tree page after Sign in
When The user clicks Types of Trees button
Then The user should be redirected to the "Types of Trees" page

Scenario: Verify that user is able to navigate to try Editor page for Types of Trees page
Given The user is in Types of Trees page
When The user clicks Try here button in Types of Trees page
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user recieves error for invalid python code for Types of Trees page
Given The user is in the try Editor page from Types of Trees page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Types of Trees page
Given The user is in the try Editor page from Types of Trees page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|

Scenario: Verify user is able to navigate to Tree Traversals page
Given The user is in the Tree page after Sign in
When The user clicks Tree Traversals button
Then The user should be redirected to the Tree Traversals page

Scenario: Verify that user is able to navigate to try Editor page for Tree Traversals page
Given The user is in the Tree Traversals page
When The user clicks Try here button in Tree Traversals page
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user recieves error for invalid python code for Tree Traversals page
Given The user is in the try Editor page from Tree Traversals page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Tree Traversals page
Given The user is in the try Editor page from Tree Traversals page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|

Scenario: Verify user is able to navigate to Traversals-Illustration page
Given The user is in the Tree page after Sign in
When The user clicks Traversals-Illustration button
Then The user should be redirected to the Traversals-Illustration page

Scenario: Verify that user is able to navigate to try Editor page for Traversals-Illustration page
Given The user is in the Traversals-Illustration page
When The user clicks Try here button in Traversals-Illustration page
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user recieves error for invalid python code for Traversals-Illustration page
Given The user is in the try Editor page from Traversals-Illustration page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Traversals-Illustration page
Given The user is in the try Editor page from Traversals-Illustration page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|

Scenario: Verify user is able to navigate to Binary Trees page
Given The user is in the Tree page after Sign in
When The user clicks Binary Trees button
Then The user should be redirected to the Binary Trees page

Scenario: Verify that user is able to navigate to try Editor page for Binary Trees page
Given The user is in the Binary Trees page
When The user clicks Try here button in Binary Trees page
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user recieves error for invalid python code for Binary Trees page
Given The user is in the try Editor page from Binary Trees page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Binary Trees page
Given The user is in the try Editor page from Binary Trees page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|

Scenario: Verify user is able to navigate to Types of Binary Trees page
Given The user is in the Tree page after Sign in
When The user clicks Types of Binary Trees button
Then The user should be redirected to the Types of Binary Trees page

Scenario: Verify that user is able to navigate to try Editor page for Types of Binary Trees page
Given The user is in the Types of Binary Trees page
When The user clicks Try here button in Types of Binary Trees page
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user recieves error for invalid python code for Types of Binary Trees page
Given The user is in the try Editor page from Types of Binary Trees page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Types of Binary Trees page
Given The user is in the try Editor page from Types of Binary Trees page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|

Scenario: Verify user is able to navigate to Implementation in Python page
Given The user is in the Tree page after Sign in
When The user clicks Implementation in Python button
Then The user should be redirected to Implementation in Python page

Scenario: Verify that user is able to navigate to try Editor page for Implementation in Python page
Given The user is in the Implementation in Python page
When The user clicks Try here button in Implementation in Python page
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user recieves error for invalid python code for Implementation in Python page
Given The user is in the try Editor page from Implementation in Python page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Implementation in Python page
Given The user is in the try Editor page from Implementation in Python page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|

Scenario: Verify user is able to navigate to Binary Tree Traversals page 
Given The user is in the Tree page after Sign in
When The user clicks Binary Tree Traversals button
Then The user should be redirected to Binary Tree Traversals page

Scenario: Verify that user is able to navigate to try Editor page for Binary Tree Traversals page
Given The user is in the Binary Tree Traversals page
When The user clicks Try here button in Binary Tree Traversals page
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user recieves error for invalid python code for Binary Tree Traversals page
Given The user is in the try Editor page from Binary Tree Traversals page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Binary Tree Traversals page
Given The user is in the try Editor page from Binary Tree Traversals page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|

Scenario: Verify user is able to navigate to Implementation of Binary Trees page
Given The user is in the Tree page after Sign in
When The user clicks Implementation of Binary Trees button
Then The user should be redirected to Implementation of Binary Trees page

Scenario: Verify that user is able to navigate to try Editor page for Implementation of Binary Trees page
Given The user is in the Implementation of Binary Trees page
When The user clicks Try here button in Implementation of Binary Trees page
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user recieves error for invalid python code for Implementation of Binary Trees page
Given The user is in the try Editor page from Implementation of Binary Trees page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Implementation of Binary Trees page
Given The user is in the try Editor page from Implementation of Binary Trees page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|

Scenario: Verify user is able to navigate to Applications of Binary trees page
Given The user is in the Tree page after Sign in
When The user clicks Applications of Binary trees button
Then The user should be redirected to Applications of Binary trees page

Scenario: Verify that user is able to navigate to try Editor page for Applications of Binary trees page
Given The user is in the Applications of Binary trees page
When The user clicks Try here button in Applications of Binary trees page
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user recieves error for invalid python code for Applications of Binary trees page
Given The user is in the try Editor page from Applications of Binary trees page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Applications of Binary trees page
Given The user is in the try Editor page from Applications of Binary trees page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|

Scenario: Verify user is able to navigate to Binary Search Trees page
Given The user is in the Tree page after Sign in
When The user clicks Binary Search Trees button
Then The user should be redirected to Binary Search Trees page

Scenario: Verify that user is able to navigate to try Editor page for Binary Search Trees page
Given The user is in the Binary Search Trees page
When The user clicks Try here button in Binary Search Trees page 
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user recieves error for invalid python code for Binary Search Trees page
Given The user is in the try Editor page from Binary Search Trees page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Binary Search Trees page
Given The user is in the try Editor page from Binary Search Trees page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|

Scenario: Verify user is able to navigate to Implementation of BST page
Given The user is in the Tree page after Sign in
When The user clicks Implementation of BST button
Then The user should be redirected to Implementation of BST page

Scenario: Verify that user is able to navigate to try Editor page for Implementation of BST page
Given The user is in the Implementation of BST page
When The user clicks Try here button in Implementation of BST page
Then The tree user should be redirected to the try Editor page with a Run button to test

Scenario Outline: Verify that user recieves error for invalid python code for Implementation of BST page
Given The user is in the try Editor page from Implementation of BST page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Tree 
Examples:
|SheetName|RowNumber|
| Editor |2|
| Editor |3|

Scenario Outline: Verify that user is able to see Output for the valid python code for Implementation of BST page
Given The user is in the try Editor page from Implementation of BST page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Tree
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Tree
Examples:
|SheetName|RowNumber|
| Editor |1|

Scenario: Verify user is able to navigate to Practice Questions page from Implementation of BST page
Given The user is in the Implementation of BST page
When The user clicks Practice Question button
Then The user should redirected to the Practice Question page
