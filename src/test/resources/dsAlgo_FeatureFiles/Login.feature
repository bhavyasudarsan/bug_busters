@Login
Feature: Login
 
Scenario: Verify that user is able to land on Login Page
Given The user is on the DS Algo Home Page for Login
When The user should click the Sign in link for Login
Then The user should be redirected to Sign in page for Login
     
Scenario Outline: Verify that user receives error message for all invalid fields during Login
Given The user is on the DS Algo Sign in Page for Login
When User logs in with data from Excel "<SheetName>" and <RowNumber> for Login
Then The error or validation message appears after Login button clicked
    
Examples:
		
|SheetName|RowNumber|
|  Login  | 1       |
|  Login  | 3       |
|  Login  | 4       |
|  Login  | 5       |
                 
Scenario Outline: Verify that user able to land on Home page after entering valid Username and Password fields
Given The user is on the DS Algo Sign in Page for Login
When User logs in with data from Excel "<SheetName1>" and <RowNumber1> for Login
Then The user should see Login success message for Login
 
Examples:
		
|SheetName1|RowNumber1|
|  Login   | 2        |
      
Scenario: Verify that user able to sign out successfully
Given The user is in the Home page after Sign in for Login
When The user clicks "Sign out" 
Then The user should be redirected to home page with message "Logged out successfully"
       