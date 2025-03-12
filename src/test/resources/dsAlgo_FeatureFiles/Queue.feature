@Queue
Feature: Queue 

Background: The user sign in to dsAlgo Portal
Given Queue User Launches DsAlgo portal 
 
    Scenario Outline: Verify that user is able to navigate to "Queue" page
    Given The Queue user is in the Main page after Sign in
    When The Queue user clicks the "Getting Started" button in Queue
    Then The Queue user should land in "Queue"  
    
    Scenario Outline: Verify that user is able to navigate to "Implementation of Queue in Python" page
    Given The Queue user is in the "Queue" page
    When The Queue user click "Implementation of Queue in Python" link
    Then The Queue user should be redirected to "Implementation of Queue in Python" Page 
    
    Scenario Outline: Verify that user is able to navigate to "try Editor" page
    Given The Queue user is in the "Implementation of Queue in Python" page
    When The Queue user click "Try Here" button
    Then The Queue user should be redirected to a page having an "try Editor" Page
    
    Scenario Outline: Verify that user receives error when click on Run button without entering code
    Given The Queue user is in the tryEditor page in "Implementation of Queue in Python" page
    When The Queue user clicks the Run Button without entering the code in the Editor 
    Then The Queue user should able to see an error message in alert window
      
    Scenario Outline: Verify that user receives error for invalid python code
    Given The Queue user is in the tryEditor page in "Implementation of Queue in Python" page
    When The Queue user write the invalid code in Editor and click the Run Button 
    Then The Queue user should able to see an error message in alert window
    
    Scenario Outline: Verify that user is able to see output for valid python code
    Given The Queue user is in the tryEditor page in "Implementation of Queue in Python" page
    When The Queue user write the valid code in Editor and click the Run Button 
    Then The Queue user should able to see output in the console
    
    Scenario Outline: Verify that user is able to navigate to "Implementation using collections.deque"  page
    Given The Queue user is in the "Queue" page
    When The Queue user click "Implementation using collections.deque" link 
    Then The Queue user should be redirected to "Implementation using collections.deque" Page
    
    Scenario Outline: Verify that user is able to navigate to "try Editor" page
    Given The Queue user is in the "Implementation using collections.deque" page
    When The Queue user click "Try Here" button
    Then The Queue user should be redirected to a page having an "try Editor" Page
    
    Scenario Outline: Verify that user receives error when click on Run button without entering code
    Given The Queue user is in the tryEditor page in "Implementation using collections.deque" page
    When The Queue user clicks the Run Button without entering the code in the Editor 
    Then The Queue user should able to see an error message in alert window
      
    Scenario Outline: Verify that user receives error for invalid python code
    Given The Queue user is in the tryEditor page in "Implementation using collections.deque" page
    When The Queue user write the invalid code in Editor and click the Run Button
    Then The Queue user should able to see an error message in alert window
    
    Scenario Outline: Verify that user is able to see output for valid python code
    Given The Queue user is in the tryEditor page in "Implementation using collections.deque" page
    When The Queue user write the valid code in Editor and click the Run Button
    Then The Queue user should able to see output in the console
    
    Scenario Outline: Verify that user is able to navigate to "Implementation using array" page
    Given The Queue user is in the "Queue" page
    When The Queue user click "Implementation using array" link
    Then The Queue user should be redirected to "Implementation using array" Page
    
    Scenario Outline: Verify that user is able to navigate to "try Editor" page
    Given The Queue user is in the "Implementation using array" page
    When The Queue user click "Try Here" button 
    Then The Queue user should be redirected to a page having an "try Editor" Page
      
    Scenario Outline: Verify that user receives error when click on Run button without entering code
    Given The Queue user is in the tryEditor page in "Implementation using array" page
    When The Queue user clicks the Run Button without entering the code in the Editor 
    Then The Queue user should able to see an error message in alert window
      
    Scenario Outline: Verify that user receives error for invalid python code
    Given The Queue user is in the tryEditor page in "Implementation using array" page
    When The Queue user write the invalid code in Editor and click the Run Button
    Then The Queue user should able to see an error message in alert window
    
    Scenario Outline: Verify that user is able to see output for valid python code
    Given The Queue user is in the tryEditor page in "Implementation using array" page
    When The Queue user write the valid code in Editor and click the Run Button
    Then The Queue user should able to see output in the console
    
    
    Scenario Outline: Verify that user is able to navigate to "Queue Operations" page
    Given The Queue user is in the "Queue" page
    When The Queue user click "Queue Operations" link 
    Then The Queue user should be redirected to "Queue Operations" Page
    
    Scenario Outline: Verify that user is able to navigate to "try Editor" page
    Given The Queue user is in the "Queue Operations" page
    When The Queue user click "Try Here" button
    Then The Queue user should be redirected to a page having an "try Editor" Page
    
    Scenario Outline: Verify that user receives error when click on Run button without entering code
    Given The Queue user is in the tryEditor page in "Queue Operations" page
    When The Queue user clicks the Run Button without entering the code in the Editor 
    Then The Queue user should able to see an error message in alert window
       
    Scenario Outline: Verify that user receives error for invalid python code
    Given The Queue user is in the tryEditor page in "Queue Operations" page
    When The Queue user write the invalid code in Editor and click the Run Button
    Then The Queue user should able to see an error message in alert window
    
    Scenario Outline: Verify that user is able to see output for valid python code
    Given The Queue user is in the tryEditor page in "Queue Operations" page
    When The Queue user write the valid code in Editor and click the Run Button
    Then The Queue user should able to see output in the console
    
    Scenario Outline: Verify that user is able to navigate to "Practice Questions" page
    Given The Queue user is in the "Queue" page
    When The Queue user click "Practice Questions" link
    Then The Queue user should be redirected to "Practice Questions" Page
    