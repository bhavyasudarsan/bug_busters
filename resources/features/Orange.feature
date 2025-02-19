@leaveScenario 
Feature: Testing Leave application features in Orange HRM
  User will be able to apply different types of leaves in HRM application

@persoanlLeave @bharathi @vijayaTest
  Scenario: Apply personal leave
  
  Given user is login to Orange HRM application with "Admin" and "admin123"
  When user navigates to Leave meanu in Orange HRM application
  And user clicks apply link in leave screen of Orange HRM application
  Then user should able to view Apply Leave screen in Orange HRM application
  
  When user selects personal leave in leave screen of Orange HRM application
  Then user is able to view leave balance in leave screen of Orange HRM application
  
  When user selects from and to dates in leave screen of Orange HRM application
  And user enters comments in leave screen of Orange HRM application
  And user clicks Apply button in leave screen of Orange HRM application
  Then user is able to view success message in leave screen of Orange HRM application

