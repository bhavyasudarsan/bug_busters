Feature: Login
 
    Scenario Outline: Verify that user is able to land on Login Page
    Given The user is on the DS Algo Home Page
    When The user should click the Sign in link
    Then The user should be redirected to Sign in page
     
    Scenario Outline: Verify that user receives error message for all empty fields during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after leaving the "Username" textbox and "Password" textbox empty
    Then The error message "Please fill out this field." appears below Username textbox
    
     Scenario Outline: Verify that user receives error message for empty Password field during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering the "Username" and leaves "Password" textbox empty
    Then The error message "Please fill out this field." appears below Password textbox
    
    Scenario Outline: Verify that user receives error message for empty Username field during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering the Password only
    Then The error message "Please fill out this field." appears below Username textbox
    
    Scenario Outline: Verify that user receives error message for invalid Username field (Unregistered User) during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering invalid username and valid password
    Then The user should able to see an error message "Invalid Username and Password".
    
    Scenario Outline: Verify that user receives error message for valid Username field (Registered User) and Incorrect password during Login
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering Valid username and Incorrect password
    Then The user should able to see an error message "Invalid Username and Password".
        
    Scenario Outline: Verify that user able to land on Home page after entering valid Username and Password fields
    Given The user is on the DS Algo Sign in Page
    When The user clicks login button after entering valid username and valid password
    Then The user should land in Data Structure Home Page with message "You are logged in"
    
    Scenario Outline: Verify that user able to sign out successfully
    Given The user is in the Home page after Sign in
    When The user clicks "Sign out" 
    Then The user should be redirected to home page with message "Logged out successfully"
    
    
