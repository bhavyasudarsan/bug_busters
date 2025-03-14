@Graph
Feature: Graph

Background: The user sign in to dsAlgo Portal
Given Graph User Launches DsAlgo portal 

  	Scenario Outline: Verify that user is able to navigate to "Graph" page
		Given The Graph user is in the Main page after Sign in
    When The Graph user clicks the "Get Started" button in Graph Panel 
    Then The Graph user be directed to "Graph" Page
    
    Scenario Outline: Verify that user is able to navigate to "Graph" page with dropdown
		Given The Graph user is in the Main page after Sign in
    When The user select Graph item from the drop down menu 
    Then The Graph user be directed to "Graph" Page


  	Scenario Outline: Verify that user is able to navigate to "Graph" page
		Given The Graph user is in the "Graph" page after Sign in
    When The Graph user clicks "Graph" link
    Then The Graph user should be redirected to "Graph" page
    
       
    Scenario Outline: Verify that user is able to navigate to "try Editor" page for "Graph" page
		Given The Graph user is on the "Graph" page
    When The Graph user clicks "Try Here" button in "Graph" page
    Then The Graph user should be redirected to a page having an try Editor with a Run button to test
    
    Scenario Outline: Verify that user receives error when click on Run button without entering code for Graph Page
    Given The Graph user is in the tryEditor page in "Graph" page
    When The Graph user clicks the Run Button without entering the code in the Editor 
    Then The Graph user should able to see an error message in alert window
    
    Scenario Outline: Verify that user receives error for invalid python code for "Graph" page
		Given The Graph user is in the tryEditor page in "Graph" page
    When The Graph user write the invalid code in Editor and click the Run Button
    Then The Graph user should able to see an error message in alert window
    
    Scenario Outline: Verify that user is able to see output for valid python code for "Graph" page
		Given The Graph user is in the tryEditor page in "Graph" page
    When The Graph user write the valid code in Editor and click the Run Button
    Then The Graph user should able to see output in the console
    
    Scenario Outline: Verify that user is able to navigate to "Practice Questions" Page for "Graph" page
		Given The Graph user is in the "Graph" page after Sign in
    When The Graph user clicks "Practice Questions" link
    Then The Graph user should be redirected to "Practice Questions" page
    
    
    Scenario Outline: Verify that user is able to navigate to "Graph Representations" page
		Given The Graph user is in the "Graph" page after Sign in
    When The Graph user clicks "Graph Representations" link
    Then The Graph user should be redirected to "Graph Representations" page
    
    Scenario Outline: Verify that user is able to navigate to "try Editor" page for "Graph Representations" page
		Given The Graph user is on the "Graph Representations" page
    When The Graph user clicks "Try Here" button in "Graph Representations" page
    Then The Graph user should be redirected to a page having an try Editor with a Run button to test
    
    
    Scenario Outline: Verify that user receives error when click on Run button without entering code for Graph Representations Page
    Given The Graph user is in the tryEditor page in "Graph Representations" page
    When The Graph user clicks the Run Button without entering the code in the Editor 
    Then The Graph user should able to see an error message in alert window
    
    Scenario Outline: Verify that user receives error for invalid python code for "Graph Representations" page
		Given The Graph user is in the tryEditor page in "Graph Representations" page
    When The Graph user write the invalid code in Editor and click the Run Button
    Then The Graph user should able to see an error message in alert window
    
    Scenario Outline: Verify that user is able to see output for valid python code for "Graph Representations" page
		Given The Graph user is in the tryEditor page in "Graph Representations" page
    When The Graph user write the valid code in Editor and click the Run Button
    Then The Graph user should able to see output in the console
    
    Scenario: Data-Driven Editor Test cases for Graph
      Given The Graph user is in the tryEditor page in "Graph" page
      When Graph User enters data from Excel "Editor" in "Graph"
      Then The Graph editor should display Expected Text
      
    Scenario: Data-Driven Editor Test cases for Graph Representation
      Given The Graph user is in the tryEditor page in "Graph Representations" page
      When Graph User enters data from Excel "Editor" in "Graph Representations"
      Then The Graph editor should display Expected Text