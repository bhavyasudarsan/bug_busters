@Graph
Feature: Graph

  Background: User launches the dsAlgo application
	Given User is in login page
	When User enter username and password from Excel test_data.xlsx sheet "Login"
	And User clicks on Login button   

  	Scenario: Verify that user is able to navigate to "Graph" page
		Given The user is in the Main page after Sign in for Graph
    When The user clicks the "Get Started" button in Graph Panel
    Then The user should be directed to "Graph" Page for Graph
    
    Scenario: Verify that user is able to navigate to "Graph" page with dropdown
		Given The user is in the Main page after Sign in for Graph
    When The user select Graph item from the drop down menu 
    Then The user should be directed to "Graph" Page for Graph
   
   Scenario: Verify that user is able to navigate to "Graph" page
		Given The user is in the "Graph" page after Sign in for Graph
    When The user clicks "Graph" link for Graph
    Then The user should be directed to "Graph" Page for Graph
    
       
    Scenario: Verify that user is able to navigate to "try Editor" page for "Graph" page
		Given The user is on the "Graph" page for Graph
    When The user clicks Try Here button in Graph page
    Then The user should be redirected to a page having an try Editor with a Run button to test for Graph
      
    Scenario Outline: Verify that user receives error for invalid python code for "Graph" page
		Given The user is in the tryEditor page in Graph page
    When User enters data from Excel "<SheetName1>" and <RowNumber1> for Graph
    Then The user should able to see an error message in alert window for Graph
    
    Examples:
		
    | SheetName1 | RowNumber1 |
    | Editor     | 1          |    
    | Editor     | 3          |
    | Editor     | 4          |
    
    Scenario Outline: Verify that user is able to see output for valid python code for "Graph" page
		Given The user is in the tryEditor page in Graph page
    When User enters data from Excel "<SheetName2>" and <RowNumber2> for Graph
    Then The user should able to see output in the console for Graph
    
   Examples:
		
    | SheetName2 | RowNumber2 |  
    | Editor     | 2          |   
    
    Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Graph" page
		Given The user is in the "Graph" page after Sign in for Graph
    When The user clicks "Practice Questions" link for Graph
    Then The user should be directed to "Practice Questions" Page for Graph
    
    
    Scenario: Verify that user is able to navigate to "Graph Representations" page
		Given The user is in the "Graph" page after Sign in for Graph
    When The user clicks "Graph Representations" link for Graph
    Then The user should be directed to "Graph Representations" Page for Graph
    
    Scenario: Verify that user is able to navigate to "try Editor" page for "Graph Representations" page
		Given The user is on the "Graph Representations" page for Graph
    When The user clicks Try Here button in Graph page
    Then The user should be redirected to a page having an try Editor with a Run button to test for Graph
    
    Scenario Outline: Verify that user receives error for invalid python code for "Graph Representations" page
		Given The user is in the tryEditor page in Graph Representations page
    When User enters data from Excel "<SheetName3>" and <RowNumber3> for Graph
    Then The user should able to see an error message in alert window for Graph
    
    Examples:
		
    | SheetName3 | RowNumber3 |
    | Editor     | 1          |    
    | Editor     | 3          |
    | Editor     | 4          |
    
    Scenario Outline: Verify that user is able to see output for valid python code for "Graph Representations" page
		Given The user is in the tryEditor page in Graph Representations page
    When User enters data from Excel "<SheetName4>" and <RowNumber4> for Graph
    Then The user should able to see output in the console for Graph
    
    Examples: 
       		
    | SheetName4 | RowNumber4 |  
    | Editor     | 2          |
    
    