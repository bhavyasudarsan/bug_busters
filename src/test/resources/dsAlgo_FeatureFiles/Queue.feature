@Queue
Feature: Testing the Queue Module in dsAlgo portal

Background: User launches the dsAlgo application
Given User is in login page
When User enter username and password from Excel test_data.xlsx sheet "Login"
And User clicks on Login button   
 
Scenario: Verify that user is able to navigate to "Queue" page
Given The user is in the Main page after Sign in for Queue
When The user clicks the "Getting Started" button in Queue
Then The user should land in Queue 
    
Scenario: Verify that user is able to navigate to "Implementation of Queue in Python" page
Given The user is in the "Queue" page for Queue
When The user click "Implementation of Queue in Python" link for Queue
Then The user should be redirected to "Implementation of Queue in Python" Page for Queue
    
Scenario: Verify that user is able to navigate to "try Editor" page
Given The user is in the "Implementation of Queue in Python" page for Queue
When The user click "Try Here" button for Queue
Then The user should be redirected to a page having an "try Editor" Page for Queue
          
Scenario Outline: Verify that user receives error for invalid python code
Given The user is in the tryEditor page in "Implementation of Queue in Python" page for Queue
When User enters data from Excel "<SheetName1>" and <RowNumber1> for Queue
Then The user should able to see an error message in alert window for Queue     
    
Examples:
		
| SheetName1 | RowNumber1 |
| Editor     | 1          |    
| Editor     | 3          |
| Editor     | 4          |
    
Scenario Outline: Verify that user is able to see output for valid python code
Given The user is in the tryEditor page in "Implementation of Queue in Python" page for Queue
When User enters data from Excel "<SheetName2>" and <RowNumber2> for Queue
Then The user should able to see output in the console for Queue
    
Examples:
		
| SheetName2 | RowNumber2 |  
| Editor     | 2          |
    
Scenario: Verify that user is able to navigate to "Implementation using collections.deque" page
Given The user is in the "Queue" page for Queue
When The user click "Implementation using collections.deque" link for Queue
Then The user should be redirected to "Implementation using collections.deque" Page for Queue
    
Scenario: Verify that user is able to navigate to "try Editor" page
Given The user is in the "Implementation using collections.deque" page for Queue
When The user click "Try Here" button for Queue
Then The user should be redirected to a page having an "try Editor" Page for Queue
          
Scenario Outline: Verify that user receives error for invalid python code
Given The user is in the tryEditor page in "Implementation using collections.deque" page for Queue
When User enters data from Excel "<SheetName3>" and <RowNumber3> for Queue
Then The user should able to see an error message in alert window for Queue
    
Examples:
		
| SheetName3 | RowNumber3 |
| Editor     | 1          |    
| Editor     | 3          |
| Editor     | 4          |
    
Scenario Outline: Verify that user is able to see output for valid python code
Given The user is in the tryEditor page in "Implementation using collections.deque" page for Queue
When User enters data from Excel "<SheetName4>" and <RowNumber4> for Queue
Then The user should able to see output in the console for Queue
    
Examples:
		
| SheetName4 | RowNumber4 |  
| Editor     | 2          |
    
Scenario: Verify that user is able to navigate to "Implementation using array" page
Given The user is in the "Queue" page for Queue
When The user click "Implementation using array" link for Queue
Then The user should be redirected to "Implementation using array" Page for Queue
    
Scenario: Verify that user is able to navigate to "try Editor" page
Given The user is in the "Implementation using array" page for Queue
When The user click "Try Here" button for Queue
Then The user should be redirected to a page having an "try Editor" Page for Queue
        
Scenario Outline: Verify that user receives error for invalid python code
Given The user is in the tryEditor page in "Implementation using array" page for Queue
When User enters data from Excel "<SheetName5>" and <RowNumber5> for Queue
Then The user should able to see an error message in alert window for Queue
    
Examples:
		
| SheetName5 | RowNumber5 |
| Editor     | 1          |    
| Editor     | 3          |
| Editor     | 4          |
    
Scenario Outline: Verify that user is able to see output for valid python code
Given The user is in the tryEditor page in "Implementation using array" page for Queue
When User enters data from Excel "<SheetName6>" and <RowNumber6> for Queue
Then The user should able to see output in the console for Queue
    
 Examples:
		
| SheetName6 | RowNumber6 |  
| Editor     | 2          |
    
    
Scenario: Verify that user is able to navigate to "Queue Operations" page
Given The user is in the "Queue" page for Queue
When The user click "Queue Operations" link for Queue
Then The user should be redirected to "Queue Operations" Page for Queue
    
Scenario: Verify that user is able to navigate to "try Editor" page
Given The user is in the "Queue Operations" page for Queue
When The user click "Try Here" button for Queue
Then The user should be redirected to a page having an "try Editor" Page for Queue
           
Scenario Outline: Verify that user receives error for invalid python code
Given The user is in the tryEditor page in "Queue Operations" page for Queue
When User enters data from Excel "<SheetName7>" and <RowNumber7> for Queue
Then The user should able to see an error message in alert window for Queue
    
Examples:
		
| SheetName7 | RowNumber7 |
| Editor     | 1          |    
| Editor     | 3          |
| Editor     | 4          |
    
Scenario Outline: Verify that user is able to see output for valid python code
Given The user is in the tryEditor page in "Queue Operations" page for Queue
When User enters data from Excel "<SheetName8>" and <RowNumber8> for Queue
Then The user should able to see output in the console for Queue
    
Examples:
		
| SheetName8 | RowNumber8 |  
| Editor     | 2          |
    
Scenario: Verify that user is able to navigate to "Practice Questions" page
Given The user is in the "Queue" page for Queue
When The user click "Practice Questions" link for Queue
Then The user should be redirected to "Practice Questions" Page for Queue
    