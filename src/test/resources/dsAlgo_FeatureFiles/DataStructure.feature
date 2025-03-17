Feature: Data Structure

Background: The user sign in to dsAlgo Portal
Given user is in login page
When user enters Username as "bugbusters" and Password as "Team@bug" 
And user clicks on Login button
Then user should see the Home page on successful login status "You are logged in" 

Scenario Outline: Verify that user is able to navigate to Data Structure page
Given The user is in the Home page after Sign in
When The user clicks the Get Started button in Data Structure Page 
Then The user be directed to "Data Structures-Introduction" Page
   
Scenario: Verify that user is able to navigate to Time Complexity page
Given The user is in the Data Structures page
When The user clicks Time Complexity button
Then The user should be redirected to "Time Complexity" page

Scenario: Verify that user is able to navigate to "Practice Questions" page
Given The user is in the Time Complexity page of data structure
When The user clicks Practice Questions link
Then The user should see the redirected to "Practice Questions" page
    
Scenario: Verify that user is able to navigate to try Editor page
Given The user is in the Time Complexity page 
When The user clicks Try Here button
Then The user should be redirected to a page having an "Assessment" with a Run button to test

#Scenario: Verify that user receives error when click on Run button without entering code in Editor page
#Given The user is in the tryEditor page
#When The user clicks the Run button without entering the code in the Editor
#Then The user should able to see an error message
#
#Scenario: Verify that user receives error for invalid python code
#Given The user is in the tryEditor page
#When The user write the invalid code in Editor and click the Run button
#Then The user should able to see an "NameError: name 'hi' is not defined on line 1" message in alert window
#
#Scenario: Verify that user is able to see output for valid python code
#Given The user is in the tryEditor page
#When The user write the valid code in Editor and click the Run button
#Then The user should able to see output in the console

Scenario: Verify that user receives error when click on Run button without entering code in Editor page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor from Excel test_data.xlsx sheet "Editor"
Then The user should able to see an error message in alert window without entering code in the Editor from Excel test_data.xlsx sheet "Editor"

Scenario: Verify that user receives error for invalid python code
Given The user is in the tryEditor page
When The user clicks the Run button by entering invalid code  in the Editor from Excel test_data.xlsx sheet "Editor"
Then The user should able to see an error message in alert window by entering invalid code  in the Editor from Excel test_data.xlsx sheet "Editor"

Scenario: Verify that user is able to see output for valid python code
Given The user is in the tryEditor page
When The user clicks the Run button by entering valid code  in the Editor from Excel test_data.xlsx sheet "Editor"
Then The user should able to see output in alert window by entering valid code  in the Editor from Excel test_data.xlsx sheet "Editor"

