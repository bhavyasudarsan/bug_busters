Feature: Data Structure

Background: User launches the dsAlgo application
Given User is in login page
When User enter username and password from Excel test_data.xlsx sheet "Login"
And User clicks on Login button

Scenario: Verify that user is able to navigate to Data Structure page
Given The user is in the Home page after Sign in
When The user clicks the Get Started button in Data Structure Page 
Then The user be directed to "Data Structures-Introduction" Page
   
#Scenario: Verify that user is able to navigate to Time Complexity page
#Given The user is in the Data Structures page
#When The user clicks Time Complexity button
#Then The user should be redirected to "Time Complexity" page
#
#Scenario: Verify that user is able to navigate to "Practice Questions" page
#Given The user is in the Time Complexity page of data structure
#When The user clicks Practice Questions link
#Then The user should see the redirected to "Practice Questions" page
    #
Scenario: Verify that user is able to navigate to try Editor page
Given The user is in the Time Complexity page 
When The user clicks Try Here button
Then The user should be redirected to a page having an "Assessment" with a Run button to test

#Scenario Outline: Verify that user receives error for invalid python code for tryEditor page
#Given The user is in the tryEditor page
#When The user clicks the Run button by entering invalid code from "<SheetName>" and <RowNumber> for tryEditor page
#Then The user should able to see an error message in alert window for tryEditor page
#
#Examples:
 #
   #|SheetName|RowNumber|
   #|  Editor  |1|
   #|  Editor  |3|

@runThisScenario

Scenario Outline: Verify that user is able to see output for valid python code for tryEditor page
Given The user is in the tryEditor page
When The user clicks the Run button by entering valid code from "<SheetName>" and <RowNumber> for tryEditor page
Then The user should able to see output in the console for tryEditor page

Examples:
 
   |SheetName|RowNumber|
   |  Editor  |2|
  

