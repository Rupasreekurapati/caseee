
Feature: Login Page
  I want to use this template for logging into 

 
  Scenario Outline: login
    Given the login page displayed
    And give username as "<username>"
    
    And give password as "<password>"
    
    And click  the login button
    Then next page  displayed
    And click the search bar
    And enter the "headphone" in it
  
    And click on search button
  
    And click on add to cart button
    

 
    Examples: 
      | username   |password    |
      | lalitha    |Password123 |
