@Login
Feature: Login
 
    Scenario: Verify that user is able to land on Login Page
    Given The user is on the DS Algo Home Page for Login
    When The user should click the Sign in link for Login
    Then The user should be redirected to Sign in page for Login
     
    Scenario: Verify that user receives error message for all empty fields during Login
    Given The user is on the DS Algo Sign in Page for Login
    When The user clicks login button after leaving the "Username" textbox and "Password" textbox empty
    Then The error message "Please fill out this field." appears below Username textbox in Login page
    
    Scenario: Verify that user receives error message for empty Password field during Login
    Given The user is on the DS Algo Sign in Page for Login
    When The user clicks login button after entering the "Username" and leaves "Password" textbox empty
    Then The error message "Please fill out this field." appears below Password textbox in Login page
    
    Scenario: Verify that user receives error message for empty Username field during Login
    Given The user is on the DS Algo Sign in Page for Login
    When The user clicks login button after entering the Password only
    Then The error message "Please fill out this field." appears below Username textbox in Login page
    
    Scenario: Verify that user receives error message for invalid Username field (Unregistered User) during Login
    Given The user is on the DS Algo Sign in Page for Login
    When The user clicks login button after entering invalid username and valid password
    Then The user should able to see an error message "Invalid Username and Password".
    
    Scenario: Verify that user receives error message for valid Username field (Registered User) and Incorrect password during Login
    Given The user is on the DS Algo Sign in Page for Login
    When The user clicks login button after entering Valid username and Incorrect password
    Then The user should able to see an error message "Invalid Username and Password".
        
    Scenario: Verify that user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page for Login
    When The user clicks login button after entering valid username and valid password for Login
    Then The user should land in Data Structure Home Page with message "You are logged in" for Login
    
    Scenario: Verify that user able to sign out successfully
    Given The user is in the Home page after Sign in for Login
    When The user clicks "Sign out" 
    Then The user should be redirected to home page with message "Logged out successfully"
    
    Scenario Outline: Data-Driven Login Test cases
    Given The user is on the DS Algo Sign in Page for Login
    When User logs in with data from Excel "<SheetName>" and <RowNumber> for Login
    Then User should see the either Log in Success or Failure
    
	Examples:
		
   |SheetName|RowNumber|
   |  Login  |1|
   |  Login  |2|
   |  Login  |3|
   |  Login  |4|
   |  Login  |5|
   