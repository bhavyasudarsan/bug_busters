@arrayTest
Feature: Testing the Array Module in dsAlgo portal

Background: Array user launches the dsAlgo application
Given Array user is in login page 
When Array User enters Username as "bugbusters" and Password as "Team@bug" 
And Array User clicks on Login button
Then Array User should see the Home page on successful login status "You are logged in"
    
Scenario: Verify that user is able to navigate to Arrays in Python page
Given The user is in the Array page after Sign in
When The user clicks Arrays in Python button
Then The user should be redirected to Arrays in Python page

Scenario: Verify that user is able to navigate to try Editor page for Arrays in Python page
Given The user is on the Arrays in Python page 
When The user clicks Try Here button in Arrays in Python page
Then The Array user should be redirected to a page having an try Editor with a Run button to test

Scenario: Verify that user receives error when click on Run button without entering code for Arrays in Python page
Given The user is in the tryEditor page for Arrays in Python page
When The Array user clicks the Run without entering the code in the Editor
Then The Array user should able to see an error message in alert window

Scenario: Verify that user recieves error for invalid python code for Arrays in Python page
Given The user is in the tryEditor page for Arrays in Python page
When The Array user write the invalid code in Editor and click the Run
Then The Array user should able to see an error message in alert window

Scenario: Verify that user is able to see Output for the valid python code for Arrays in Python page
Given The user is in the tryEditor page for Arrays in Python page
When The Array user write the valid code in Editor and click the Run
Then The Array user should able to see output in the console

Scenario: Verify that user is able to navigate to Practice Questions Page for Arrays in Python page
Given The user is in the Array page after Sign in
When The user clicks Practice Questions button from Arrays in Python page
Then The user should be redirected to Practice page from Arrays in Python page

Scenario: Verify that user is able to navigate to Search the array Page from Practice question page of Arrays in Python page
Given The user is on the Arrays in Python page
When The user clicks the Search the array link
Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons

Scenario: Verify that user receives error for invalid python code on running Search the array question
Given The user is on the practice question editor from Search the array
When The user write the invalid code for Search the array in Editor and Click the Run
Then The user should able to see an error message in alert window for Search the array

Scenario: Verify that user is able to run valid python code for Search the array question
Given The user is on the practice question editor from Search the array
When The user write the valid code for Search the array in Editor and Click the Run
Then The user should able to see output in the console for Search the array

Scenario: Verify that user receives error on submitting invalid python code for Search the array question
Given The user is on the practice question editor from Search the array
When The user write the invalid code for Search the array in Editor and Click the Submit
Then The user see an error message "Error occurred during submission" for Search the array

Scenario: Verify that user receives error on submitting valid python code for Search the array question
Given The user is on the practice question editor from Search the array
When The user write the valid code for Search the array in Editor and Click the Submit
Then The user see success message "Submission Successful" for Search the array

Scenario: Verify that user is able to navigate to Max Consecutive Ones Page from Practice question page of Arrays in Python page
Given The user is on the Arrays in Python page
When The user clicks the Max Consecutive Ones link
Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons

Scenario: Verify that user receives error for invalid python code on running Max Consecutive Ones question
Given The user is on the practice question editor from Max Consecutive Ones question
When The user write the invalid code for Max Consecutive Ones in Editor and Click the Run
Then The user should able to see an error message in alert window for Max Consecutive Ones

Scenario: Verify that user is able to run valid python code for Max Consecutive Ones question
Given The user is on the practice question editor from Max Consecutive Ones question
When The user write the valid code for Max Consecutive Ones in Editor and Click the Run
Then The user should able to see output in the console for Max Consecutive Ones

Scenario: Verify that user receives error on submitting invalid python code for Max Consecutive Ones question
Given The user is on the practice question editor from Max Consecutive Ones question
When The user write the invalid code for Max Consecutive in Editor and Click the Submit
Then The user see an error message "Error occurred during submission" for Max Consecutive

Scenario: Verify that user receives error on submitting valid python code for Max Consecutive Ones question
Given The user is on the practice question editor from Max Consecutive Ones question
When The user write the valid code for Max Consecutive in Editor and Click the Submit
Then The user see success message "Submission Successful" for Max Consecutive

Scenario: Verify that user is able to navigate to Find Numbers with Even Number of Digits Page from Practice question page of Arrays in Python page
Given The user is on the Arrays in Python page
When The user clicks the FindNumbers with Even Number of Digits link 
Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons

Scenario: Verify that user receives error for invalid python code on running Find Numbers with Even Number of Digits question
Given The user is on the practice question editor from FindNumbers with Even Number of Digits
When The user write the invalid code for Find Numbers with Even Number of Digits in Editor and Click the Run
Then The user should able to see an error message in alert window for Find Numbers with Even Number of Digits

Scenario: Verify that user is able to run valid python code for Find Numbers with Even Number of Digits question
Given The user is on the practice question editor from FindNumbers with Even Number of Digits
When The user write the valid code for Find Numbers with Even Number of Digits in Editor and Click the Run
Then The user should able to see output in the console for Find Numbers with Even Number of Digits

Scenario: Verify that user receives error on submitting invalid python code for Find Numbers with Even Number of Digits question
Given The user is on the practice question editor from FindNumbers with Even Number of Digits
When The user write the invalid code for Find Numbers with Even Number of Digits in Editor and Click the Submit
Then The user see an error message "Error occurred during submission" for Find Numbers with Even Number of Digits
@runThisScenario
Scenario: Verify that user receives error on submitting valid python code for Find Numbers with Even Number of Digits question
Given The user is on the practice question editor from FindNumbers with Even Number of Digits
When The user write the valid code for Find Numbers with Even Number of Digits in Editor and Click the Submit
Then The user see success message "Submission Successful" for Find Numbers with Even Number of Digits

Scenario: Verify that user is able to navigate to Squares of a Sorted Array Page from Practice question page of Arrays in Python page
Given The user is on the Arrays in Python page
When The user clicks the Squares of a Sorted Array link
Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons

Scenario: Verify that user receives error for invalid python code on running Squares of a Sorted Array question
Given The user is on the practice question editor from Squares of a Sorted Array
When The user write the invalid code for Squares of a Sorted Array in Editor and Click the Run
Then The user should able to see an error message in alert window for Squares of a Sorted Array

Scenario: Verify that user is able to run valid python code for Squares of a Sorted Array question
Given The user is on the practice question editor from Squares of a Sorted Array
When The user write the valid code for Squares of a Sorted Array in Editor and Click the Run
Then The user should able to see output in the console for Squares of a Sorted Array

Scenario: Verify that user receives error on submitting invalid python code for Squares of a Sorted Array question
Given The user is on the practice question editor from Squares of a Sorted Array
When The user write the invalid code for Squares of a Sorted Array in Editor and Click the Submit
Then The user see an error message "Error occurred during submission" for Squares of a Sorted Array

Scenario: Verify that user receives error on submitting valid python code for Squares of a Sorted Array question
Given The user is on the practice question editor from Squares of a Sorted Array
When The user write the valid code for Squares of a Sorted Array in Editor and Click the Submit
Then The user see success message "Submission Successful" for Squares of a Sorted Array

Scenario: Verify that user is able to navigate to Arrays Using List Page from Arrays in Python page
Given The user is on the Arrays in Python page
When The user clicks the Arrays Using List button
Then The user should be redirected to Arrays Using List page 

Scenario: Verify that user is able to navigate to try Editor page for Arrays Using List page
Given The user is on the Arrays Using List page
When The user clicks Try Here button in Arrays Using List page
Then The Array user should be redirected to a page having an try Editor with a Run button to test

Scenario: Verify that user receives error when click on Run button without entering code for Arrays Using List page
Given The user is in the tryEditor page from Arrays Using List page
When The Array user clicks the Run without entering the code in the Editor
Then The Array user should able to see an error message in alert window

Scenario: Verify that user recieves error for invalid python code for Arrays Using List  page
Given The user is in the tryEditor page from Arrays Using List page
When The Array user write the invalid code in Editor and click the Run
Then The Array user should able to see an error message in alert window

Scenario: Verify that user is able to see Output for the valid python code for Arrays Using List  page
Given The user is in the tryEditor page from Arrays Using List page
When The Array user write the valid code in Editor and click the Run
Then The Array user should able to see output in the console

Scenario: Verify that user is able to navigate to Basic Operations in Lists Page 
Given The user is in the Array page after Sign in
When The user clicks the Basic Operations in Lists button
Then The user should be redirected to Basic Operations in Lists page 

Scenario: Verify that user is able to navigate to try Editor page for Basic Operations in Lists page
Given The user is in Basic Operations in Lists page
When The user clicks Try Here button in Basic Operations in Lists page
Then The Array user should be redirected to a page having an try Editor with a Run button to test

Scenario: Verify that user receives error when click on Run button without entering code for Basic Operations in Lists page
Given The user is in the tryEditor page from Basic Operations in Lists
When The Array user clicks the Run without entering the code in the Editor
Then The Array user should able to see an error message in alert window

Scenario: Verify that user recieves error for invalid python code for Basic Operations in Lists  page
Given The user is in the tryEditor page from Basic Operations in Lists
When The Array user write the invalid code in Editor and click the Run
Then The Array user should able to see an error message in alert window

Scenario: Verify that user is able to see Output for the valid python code for Basic Operations in Lists  page
Given The user is in the tryEditor page from Basic Operations in Lists
When The Array user write the valid code in Editor and click the Run
Then The Array user should able to see output in the console

Scenario: Verify that user is able to navigate to Applications of Array Page 
Given The user is in the Array page after Sign in
When The user clicks the Applications of Array button
Then The user should be redirected to Applications of Array page

Scenario: Verify that user is able to navigate to try Editor page for Applications of Array page
Given The user is in Applications of Array page
When The user clicks Try Here button in Applications of Array page
Then The Array user should be redirected to a page having an try Editor with a Run button to test

Scenario: Verify that user receives error when click on Run button without entering code for Applications of Array page
Given The user is in the tryEditor page from Applications of Array
When The Array user clicks the Run without entering the code in the Editor
Then The Array user should able to see an error message in alert window

Scenario: Verify that user recieves error for invalid python code for Applications of Array  page
Given The user is in the tryEditor page from Applications of Array
When The Array user write the invalid code in Editor and click the Run
Then The Array user should able to see an error message in alert window

Scenario: Verify that user is able to see Output for the valid python code for Applications of Array  page
Given The user is in the tryEditor page from Applications of Array
When The Array user write the valid code in Editor and click the Run
Then The Array user should able to see output in the console
