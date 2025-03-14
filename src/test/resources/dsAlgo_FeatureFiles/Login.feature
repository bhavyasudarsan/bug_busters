@Login
Feature: Login
 
    Scenario Outline: Verify that user is able to land on Login Page
    Given The Login user is on the DS Algo Home Page
    When The Login user should click the Sign in link
    Then The Login user should be redirected to Sign in page
     
    Scenario Outline: Verify that user receives error message for all empty fields during Login
    Given The Login user is on the DS Algo Sign in Page
    When The Login user clicks login button after leaving the "Username" textbox and "Password" textbox empty
    Then The error message "Please fill out this field." appears below Username textbox in Login page
    
     Scenario Outline: Verify that user receives error message for empty Password field during Login
    Given The Login user is on the DS Algo Sign in Page
    When The Login user clicks login button after entering the "Username" and leaves "Password" textbox empty
    Then The error message "Please fill out this field." appears below Password textbox in Login page
    
    Scenario Outline: Verify that user receives error message for empty Username field during Login
    Given The Login user is on the DS Algo Sign in Page
    When The Login user clicks login button after entering the Password only
    Then The error message "Please fill out this field." appears below Username textbox in Login page
    
    Scenario Outline: Verify that user receives error message for invalid Username field (Unregistered User) during Login
    Given The Login user is on the DS Algo Sign in Page
    When The Login user clicks login button after entering invalid username and valid password
    Then The Login user should able to see an error message "Invalid Username and Password".
    
    Scenario Outline: Verify that user receives error message for valid Username field (Registered User) and Incorrect password during Login
    Given The Login user is on the DS Algo Sign in Page
    When The Login user clicks login button after entering Valid username and Incorrect password
    Then The Login user should able to see an error message "Invalid Username and Password".
        
    Scenario Outline: Verify that user able to land on Home page after entering valid Username and Password fields
    Given The Login user is on the DS Algo Sign in Page
    When The Login user clicks login button after entering valid username and valid password
    Then The Login user should land in Data Structure Home Page with message "You are logged in"
    
    Scenario Outline: Verify that user able to sign out successfully
    Given The Login user is in the Home page after Sign in
    When The Login user clicks "Sign out" 
    Then The Login user should be redirected to home page with message "Logged out successfully"
    
    Scenario: Data-Driven Login Test cases
    Given The Login user is on the DS Algo Sign in Page
    When Login User logs in with data from Excel "Login"
    Then Login User should see the either Log in Success or Failure
    