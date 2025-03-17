Feature: Register

Background: User launches dsAlgo application
Given The user is in the Home page
When The user clicks Register link on the Home page
Then The user should be land to "Registration" page

#Scenario Outline: Verify that user able to land on Home page after registration with valid fields
#Given The user is on the user registration page  
#When user enters Username as "Numpy1_Testers" and Password as "bug1_test" and Confirm Password as "bug1_test" and user clicks resgister button  
#Then The user should be redirected to "NumpyNinja" with message New Account Created.You are logged in.

#Scenario Outline: Verify that user receives error message for all empty fields during registration
#Given The user is on the user registration page  
#When The user clicks register button after leaving the Username as " " textbox and Password as " " and Confirm Password as " " textbox empty 
#Then The error "Please fill in this field." appears below Username textbox
#
#Scenario Outline: Verify that user receives error message for empty Password field during registration
#Given The user is on the user registration page  
#When The user enters Username as "NumpyTesters" and Password as " " and Confirm Password as " " and user clicks resgister button
#Then The error "Please fill in this field." appears below Password textbox
#
#Scenario Outline: Verify that user receives error message for empty Password Confirmation field during registration
#Given The user is on the user registration page  
#When The user enters Username as "NumpyTesters" and Password as "bug@test" and Confirm Password as " " and user clicks resgister button
#Then The error "Please fill in this field." appears below Password textbox
#
#Scenario Outline: Verify that user receives error message for invalid username field during registration
#Given The user is on the user registration page  
#When The user enters a username as "*Numpy&Testers*" and Password as "bug@test" and Confirm Password as "bug@test" with spacebar characters other than digits and @/./+/-/_
#And user clicks on register button
#Then The user should able to see warning message "password_mismatch:The two password fields didn’t match."
#
#Scenario Outline: Verify that user receives error message for entering numeric data for password field during registration
#Given The user is on the user registration page  
#When The user enters a username as "*Numpy&Testers*" and Password as "12345678" and Confirm Password as "12345678" with spacebar characters other than digits and @/./+/-/_
#And user clicks on register button
#Then The user should able to see warning message "password_mismatch:The two password fields didn’t match."
#
#Scenario Outline: Verify that user receives error message for mismatched Password and Password Confirmation field during registration
#Given The user is on the user registration page  
#When user enters Username as "NumpyTesters" and Password as "bug@test" and Confirm Password as "bug@busters" and user clicks resgister button
#Then The user should able to see warning message "password_mismatch:The two password fields didn’t match."
#
#Scenario Outline: Verify that user receives error message for entering less than 8 charachers for password field during registration
#Given The user is on the user registration page  
#When user enters Username as "NumpyTesters" and Password as "bug@12" and Confirm Password as "bug@12" and user clicks resgister button
#Then The user should able to see warning message "password_mismatch:The two password fields didn’t match."
#
#Scenario Outline: Verify that user able to land on login page
#Given The user is on the user registration page  
#When The user clicks Sign in link on the Registration page
#Then The user should see the "Login" Page
#
#Scenario Outline: Verify that user able to see warning message while selecting "Arrays" from the drop down without Sign in
#Given The user is on the user registration page  
#When The user selects "Arrays" from the drop down without Sign in.
#Then The user should able to see an warning message "You are not logged in" 
#And land on the "NumpyNinja" page
#
#Scenario Outline: Verify that user able to see warning message while selecting "Linked List" from the drop down without Sign in
#Given The user is on the user registration page  
#When The user selects "Linked List" from the drop down without Sign in.
#Then The user should able to see an warning message "You are not logged in" 
#And land on the "NumpyNinja" page
#
#Scenario Outline: Verify that user able to see warning message while selecting "Stack" from the drop down without Sign in
#Given The user is on the user registration page  
#When The user selects "Stack" from the drop down without Sign in.
#Then The user should able to see an warning message "You are not logged in" 
#And land on the "NumpyNinja" page
#
#Scenario Outline: Verify that user able to see warning message while selecting "Queue" from the drop down without Sign in
#Given The user is on the user registration page  
#When The user selects "Queue" from the drop down without Sign in.
#Then The user should able to see an warning message "You are not logged in" 
#And land on the "NumpyNinja" page
#
#Scenario Outline: Verify that user able to see warning message while selecting "Tree" from the drop down without Sign in
#Given The user is on the user registration page  
#When The user selects "Tree" from the drop down without Sign in.
#Then The user should able to see an warning message "You are not logged in" 
#And land on the "NumpyNinja" page
#
#Scenario Outline: Verify that user able to see warning message while selecting "Graph" from the drop down without Sign in
#Given The user is on the user registration page  
#When The user selects "Graph" from the drop down without Sign in.
#Then The user should able to see an warning message "You are not logged in" 
#And land on the "NumpyNinja" page

 Scenario: Data-Driven Register Test cases
 When The User register with data from Excel "Register"
 Then The User should see the either register Success or Failure

 