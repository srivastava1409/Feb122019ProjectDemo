Feature: Demo tours login functionality checking
 
  Scenario: Demo tours login functionality checking with valid credentials
    Given Open the browser and pass the application url
    When Enter the valid user id and password
    Then Signout options should be visible in the next page
