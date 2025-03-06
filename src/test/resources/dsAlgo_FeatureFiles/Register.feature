Feature: Register

Background: The user sign in to dsAlgo Portal

Scenario Outline: Verify that user is able to navigate to Register page
Given The user is in the Home page
When The user clicks Register link on the Home page
Then The user should be redirected to registration page

Scenario Outline: Verify that user receives error message for all empty fields during registration
Given The user is on the user registration page 
When The user clicks Register button with all fields empty
Then The error "Please fill out this field." appears below Username textbox

Scenario Outline: Verify that user able to land on Home page after registration with valid fields
Given The user is on the user registration page  
When The user clicks Register button after entering  with valid username, password and password confirmation in related textboxes 
Then The user should be redirected to Home Page of DS Algo with message New Account Created. You are logged in"



