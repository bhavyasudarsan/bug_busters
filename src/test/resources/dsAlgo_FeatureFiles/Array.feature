@arrayTest
Feature: Testing the Array Module in dsAlgo portal

Background: User launches the dsAlgo application
Given User is in login page
When User enter username and password from Excel test_data.xlsx sheet "Login"
And User clicks on Login button 

Scenario: Verify that user is able to navigate to Arrays in Python page
Given The user is in the Array page after Sign in
When The user clicks Arrays in Python button
Then The user should be redirected to Arrays in Python page

Scenario: Verify that user is able to navigate to try Editor page for Arrays in Python page
Given The user is on the Arrays in Python page 
When The user clicks Try Here button in Arrays in Python page
Then The user should be redirected to a page having an try Editor with a Run button to test for Array

Scenario Outline: Verify that user receives error for invalid python code for Arrays in Python page
Given The user is in the tryEditor page for Arrays in Python page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Array
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Array 
Examples:
|SheetName|RowNumber|
| Array |17|
| Array |18|

Scenario Outline: Verify that user is able to see Output for the valid python code for Arrays in Python page
Given The user is in the tryEditor page for Arrays in Python page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Array
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Array
Examples:
|SheetName|RowNumber|
| Array |16|

Scenario: Verify that user is able to navigate to Practice Questions Page for Arrays in Python page
Given The user is in the Array page after Sign in
When The user clicks Practice Questions button from Arrays in Python page
Then The user should be redirected to Practice page from Arrays in Python page

Scenario: Verify that user is able to navigate to Search the array Page from Practice question page of Arrays in Python page
Given The user is on the Arrays in Python page
When The user clicks the Search the array link
Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons

Scenario Outline: Verify that user receives error for invalid python code on running Search the array question
Given The user is on the practice question editor from Search the array
When The user write the invalid code from "<SheetName>" and <RowNumber> for practice question and Click the Run
Then The user should able to see an error message as per "<SheetName>" and <RowNumber> in alert window for practice question
Examples:
|SheetName|RowNumber|
| Array |1|

Scenario Outline: Verify that user is able to run valid python code for Search the array question
Given The user is on the practice question editor from Search the array
When The user write the valid code from "<SheetName>" and <RowNumber> for practice question and Click the Run
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for practice question 
Examples:
|SheetName|RowNumber|
| Array |0|

Scenario Outline: Verify that user receives error on submitting invalid python code for Search the array question
Given The user is on the practice question editor from Search the array
When The user write the invalid code from "<SheetName>" and <RowNumber> for practice question and Click the Submit
Then The user should able to see an error message as per "<SheetName>" and <RowNumber> in console for practice question
Examples:
|SheetName|RowNumber|
| Array |3|

Scenario Outline: Verify that user receives error on submitting valid python code for Search the array question
Given The user is on the practice question editor from Search the array
When The user write the valid code from "<SheetName>" and <RowNumber> for practice question and Click the Submit
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for practice question 
Examples:
|SheetName|RowNumber|
| Array |2|

Scenario: Verify that user is able to navigate to Max Consecutive Ones Page from Practice question page of Arrays in Python page
Given The user is on the Arrays in Python page
When The user clicks the Max Consecutive Ones link
Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons

Scenario Outline: Verify that user receives error for invalid python code on running Max Consecutive Ones question
Given The user is on the practice question editor from Max Consecutive Ones question
When The user write the invalid code from "<SheetName>" and <RowNumber> for practice question and Click the Run
Then The user should able to see an error message as per "<SheetName>" and <RowNumber> in alert window for practice question
Examples:
|SheetName|RowNumber|
| Array |5|

Scenario Outline: Verify that user is able to run valid python code for Max Consecutive Ones question
Given The user is on the practice question editor from Max Consecutive Ones question
When The user write the valid code from "<SheetName>" and <RowNumber> for practice question and Click the Run
Then The user should able to see output in console as per "<SheetName>" and <RowNumber> for practice question 
Examples:
|SheetName|RowNumber|
| Array |4|

Scenario Outline: Verify that user receives error on submitting invalid python code for Max Consecutive Ones question
Given The user is on the practice question editor from Max Consecutive Ones question
When The user write the invalid code from "<SheetName>" and <RowNumber> for practice question and Click the Submit
Then The user should able to see an error message as per "<SheetName>" and <RowNumber> in console for practice question
Examples:
|SheetName|RowNumber|
| Array |7|

Scenario Outline: Verify that user receives error on submitting valid python code for Max Consecutive Ones question
Given The user is on the practice question editor from Max Consecutive Ones question
When The user write the valid code from "<SheetName>" and <RowNumber> for practice question and Click the Submit
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for practice question 
Examples:
|SheetName|RowNumber|
| Array |6|

Scenario: Verify that user is able to navigate to Find Numbers with Even Number of Digits Page from Practice question page of Arrays in Python page
Given The user is on the Arrays in Python page
When The user clicks the FindNumbers with Even Number of Digits link 
Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons

Scenario Outline: Verify that user receives error for invalid python code on running Find Numbers with Even Number of Digits question
Given The user is on the practice question editor from FindNumbers with Even Number of Digits
When The user write the invalid code from "<SheetName>" and <RowNumber> for practice question and Click the Run
Then The user should able to see an error message as per "<SheetName>" and <RowNumber> in alert window for practice question
Examples:
|SheetName|RowNumber|
| Array |9|

Scenario Outline: Verify that user is able to run valid python code for Find Numbers with Even Number of Digits question
Given The user is on the practice question editor from FindNumbers with Even Number of Digits
When The user write the valid code from "<SheetName>" and <RowNumber> for practice question and Click the Run
Then The user should able to see output in console as per "<SheetName>" and <RowNumber> for practice question 
Examples:
|SheetName|RowNumber|
| Array |8|

Scenario Outline: Verify that user receives error on submitting invalid python code for Find Numbers with Even Number of Digits question
Given The user is on the practice question editor from FindNumbers with Even Number of Digits
When The user write the invalid code from "<SheetName>" and <RowNumber> for practice question and Click the Submit
Then The user should able to see an error message as per "<SheetName>" and <RowNumber> in console for practice question
Examples:
|SheetName|RowNumber|
| Array |11|

Scenario Outline: Verify that user receives error on submitting valid python code for Find Numbers with Even Number of Digits question
Given The user is on the practice question editor from FindNumbers with Even Number of Digits
When The user write the valid code from "<SheetName>" and <RowNumber> for practice question and Click the Submit
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for practice question 
Examples:
|SheetName|RowNumber|
| Array |10|

Scenario: Verify that user is able to navigate to Squares of a Sorted Array Page from Practice question page of Arrays in Python page
Given The user is on the Arrays in Python page
When The user clicks the Squares of a Sorted Array link
Then The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons

Scenario Outline: Verify that user receives error for invalid python code on running Squares of a Sorted Array question
Given The user is on the practice question editor from Squares of a Sorted Array
When The user write the invalid code from "<SheetName>" and <RowNumber> for practice question and Click the Run
Then The user should able to see an error message as per "<SheetName>" and <RowNumber> in alert window for practice question
Examples:
|SheetName|RowNumber|
| Array |13|

Scenario Outline: Verify that user is able to run valid python code for Squares of a Sorted Array question
Given The user is on the practice question editor from Squares of a Sorted Array
When The user write the valid code from "<SheetName>" and <RowNumber> for practice question and Click the Run
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for practice question 
Examples:
|SheetName|RowNumber|
| Array |12|

Scenario Outline: Verify that user receives error on submitting invalid python code for Squares of a Sorted Array question
Given The user is on the practice question editor from Squares of a Sorted Array
When The user write the invalid code from "<SheetName>" and <RowNumber> for practice question and Click the Submit
Then The user should able to see an error message as per "<SheetName>" and <RowNumber> in console for practice question
Examples:
|SheetName|RowNumber|
| Array |15|

Scenario Outline: Verify that user receives error on submitting valid python code for Squares of a Sorted Array question
Given The user is on the practice question editor from Squares of a Sorted Array
When The user write the valid code from "<SheetName>" and <RowNumber> for practice question and Click the Submit
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for practice question 
Examples:
|SheetName|RowNumber|
| Array |14|

Scenario: Verify that user is able to navigate to Arrays Using List Page from Arrays in Python page
Given The user is on the Arrays in Python page
When The user clicks the Arrays Using List button
Then The user should be redirected to Arrays Using List page 

Scenario: Verify that user is able to navigate to try Editor page for Arrays Using List page
Given The user is on the Arrays Using List page
When The user clicks Try Here button in Arrays Using List page
Then The user should be redirected to a page having an try Editor with a Run button to test for Array

Scenario Outline: Verify that user recieves error for invalid python code for Arrays Using List  page
Given The user is in the tryEditor page from Arrays Using List page
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Array
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Array 
Examples:
|SheetName|RowNumber|
| Array |17|
| Array |18|

Scenario Outline: Verify that user is able to see Output for the valid python code for Arrays Using List  page
Given The user is in the tryEditor page from Arrays Using List page
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Array
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Array
Examples:
|SheetName|RowNumber|
| Array |16|

Scenario: Verify that user is able to navigate to Basic Operations in Lists Page 
Given The user is in the Array page after Sign in
When The user clicks the Basic Operations in Lists button
Then The user should be redirected to Basic Operations in Lists page 

Scenario: Verify that user is able to navigate to try Editor page for Basic Operations in Lists page
Given The user is in Basic Operations in Lists page
When The user clicks Try Here button in Basic Operations in Lists page
Then The user should be redirected to a page having an try Editor with a Run button to test for Array

Scenario Outline: Verify that user recieves error for invalid python code for Basic Operations in Lists  page
Given The user is in the tryEditor page from Basic Operations in Lists
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Array
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Array 
Examples:
|SheetName|RowNumber|
| Array |17|
| Array |18|

Scenario Outline: Verify that user is able to see Output for the valid python code for Basic Operations in Lists  page
Given The user is in the tryEditor page from Basic Operations in Lists
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Array
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Array
Examples:
|SheetName|RowNumber|
| Array |16|

Scenario: Verify that user is able to navigate to Applications of Array Page 
Given The user is in the Array page after Sign in
When The user clicks the Applications of Array button
Then The user should be redirected to Applications of Array page

Scenario: Verify that user is able to navigate to try Editor page for Applications of Array page
Given The user is in Applications of Array page
When The user clicks Try Here button in Applications of Array page
Then The user should be redirected to a page having an try Editor with a Run button to test for Array

Scenario Outline: Verify that user recieves error for invalid code for Applications of Array  page
Given The user is in the tryEditor page from Applications of Array
When The user writes invalid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Array
Then The user see an error message in alert window as per "<SheetName>" and <RowNumber> for Array 
Examples:
|SheetName|RowNumber|
| Array |17|
| Array |18|

Scenario Outline: Verify that user is able to see Output for the valid python code for Applications of Array  page
Given The user is in the tryEditor page from Applications of Array
When The user write the valid code from "<SheetName>" and <RowNumber> and clicks the Run in the Editor for Array
Then The user should able to see output in the console as per "<SheetName>" and <RowNumber> for Array
Examples:
|SheetName|RowNumber|
| Array |16|

