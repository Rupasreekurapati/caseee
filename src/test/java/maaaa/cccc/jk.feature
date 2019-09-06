

Feature: Registration for testme app

i am registering for testme app


  Scenario Outline: register Sucessfull
    Given testmeapp link 
    When click the sign in
    And enter the user as "<user name>"
    And enter the first as "<firstname>"
    And enter the last as "<lastname>"
    And enter the pass as "<password>"
    And enter the confirm as "<confirm password>"
    And enter the gender as "<gender>"
    And enter the email as "<email>"
    And enter the mobile as "<mobile number>"
    And enter the dob as "<dob>"
    And enter the address as "<address>"
    And enter the security question as "<answer>"
    And click the signup
    Then web page is displayed

Examples:
       |user name|firstname|lastname|password |confirm password|gender|email     |mobile number|dob       |address         |answer                   |
       | sam     | samm    | qwe    | asd     |asd             |female|tyu@nm.com|98765432     |03-07-1998|chennai         |Nellore                  |
        


  