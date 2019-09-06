
Feature: Login to testme app


  Scenario Outline: login
    Given login page
    And enter the username as "<username>"
    
    And enter the password as "<password>"
    And click on the login button
    Then next page is displayed
    
  
    Examples: 
      | username  | password       | 
      | santhosh  | password123    | 
      
