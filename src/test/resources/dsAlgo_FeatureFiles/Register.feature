Feature: Register 

Background: User launches dsAlgo application
Given The user is in the Home page
When The user clicks Register link on the Home page
Then The user should be land to "Registration" page

Scenario: Verify that user able to land on login page
Given The user is on the user registration page  
When The user clicks Sign in link on the Registration page
Then The user should see the "Login" Page

Scenario: Verify that user able to see warning message while selecting "Arrays" from the drop down without Sign in
Given The user is on the user registration page  
When The user selects "Arrays" from the drop down without Sign in.
Then The user should able to see an warning message "You are not logged in" 
And land on the "NumpyNinja" page

Scenario: Verify that user able to see warning message while selecting "Linked List" from the drop down without Sign in
Given The user is on the user registration page  
When The user selects "Linked List" from the drop down without Sign in.
Then The user should able to see an warning message "You are not logged in" 
And land on the "NumpyNinja" page

Scenario: Verify that user able to see warning message while selecting "Stack" from the drop down without Sign in
Given The user is on the user registration page  
When The user selects "Stack" from the drop down without Sign in.
Then The user should able to see an warning message "You are not logged in" 
And land on the "NumpyNinja" page

Scenario: Verify that user able to see warning message while selecting "Queue" from the drop down without Sign in
Given The user is on the user registration page  
When The user selects "Queue" from the drop down without Sign in.
Then The user should able to see an warning message "You are not logged in" 
And land on the "NumpyNinja" page

Scenario: Verify that user able to see warning message while selecting "Tree" from the drop down without Sign in
Given The user is on the user registration page  
When The user selects "Tree" from the drop down without Sign in.
Then The user should able to see an warning message "You are not logged in" 
And land on the "NumpyNinja" page

Scenario: Verify that user able to see warning message while selecting "Graph" from the drop down without Sign in
Given The user is on the user registration page  
When The user selects "Graph" from the drop down without Sign in.
Then The user should able to see an warning message "You are not logged in" 
And land on the "NumpyNinja" page

Scenario Outline: Verify that user receives error message for all invalid fields during Register
When The user register with data from Excel "<SheetName>" and <RowNumber> for Register
Then The error or validation message appears after register button clicked
 
 Examples:
 
   |SheetName|RowNumber|
   |Register|1|
   |Register|2|
   |Register|3|
   |Register|4|
   |Register|5|
   |Register|6|
   |Register|7|

Scenario Outline: Verify that user able to land on Home page after entering valid Username and Password fields
When The user register with data from Excel "<SheetName1>" and <RowNumber1> for Register
Then The user should be redirected to "home" page with success message 
     
Examples:
 
   |SheetName1|RowNumber1|
   |Register|8|
   
   
   
 
 