Feature: Graph

Background: The user sign in to dsAlgo Portal
Given User Launches DsAlgo portal 

  	Scenario Outline: Verify that user is able to navigate to "Graph" page
		Given The user is in the Home page after Sign in
    When The user clicks the "Get Started" button in Graph Panel 
    Then The user be directed to "Graph" Page
    
    Scenario Outline: Verify that user is able to navigate to "Graph" page with dropdown
		Given The user is in the Home page after Sign in
    When The user select Graph item from the drop down menu 
    Then The user be directed to "Graph" Page


  	Scenario Outline: Verify that user is able to navigate to "Graph" page
		Given The user is in the "Graph" page after Sign in
    When The user clicks "Graph" link
    Then The user should be redirected to "Graph" page
    
       
    Scenario Outline: Verify that user is able to navigate to "try Editor" page for "Graph" page
		Given The user is on the "Graph" page
    When The user clicks "Try Here" button in "Graph" page
    Then The user should be redirected to a page having an try Editor with a Run button to test
    
    Scenario Outline: Verify that user receives error for invalid python code for "Graph" page
		Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window
    
    Scenario Outline: Verify that user is able to see output for valid python code for "Graph" page
		Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console
    
    Scenario Outline: Verify that user is able to navigate to "Practice Questions" Page for "Graph" page
		Given The user is in the "Graph" page after Sign in
    When The user clicks "Practice Questions" link
    Then The user should be redirected to "Practice Questions" page
    
    
    Scenario Outline: Verify that user is able to navigate to "Graph Representations" page
		Given The user is in the "Graph" page after Sign in
    When The user clicks "Graph Representations" link
    Then The user should be redirected to "Graph Representations" page
    
    Scenario Outline: Verify that user is able to navigate to "try Editor" page for "Graph Representations" page
		Given The user is on the "Graph Representations" page
    When The user clicks "Try Here" button in "Graph Representations" page
    Then The user should be redirected to a page having an try Editor with a Run button to test
    
   
    Scenario Outline: Verify that user receives error for invalid python code for "Graph Representations" page
		Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button
    Then The user should able to see an error message in alert window
    
    Scenario Outline: Verify that user is able to see output for valid python code for "Graph Representations" page
		Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  