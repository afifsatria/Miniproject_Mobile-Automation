Feature: Login
  As a user
  I have to be able to login
  So that i can buy products


  Scenario Outline: Login
    Given I am on alta shop apps
    When I clicks logout button
    And I go to login page
    And I input "<email>"
    And Input "<password>"
    And I Click login button
    Then I get the "<result>"
    Examples:
      |email           |password   |result                      |
      |bayu@gmail.com  |@@@@       |product_page                |
      |Pratama         |Pratama456 |Email atau Password invalid |
      |Satria          |           |Passsword can not be empty  |
      |                |Satria123  |Email can not empty         |


  Scenario: Null data
    Given I am on alta shop apps
    When I clicks logout button
    And I go to login page
    And Null data
    And I click login button
    Then the all the error messages appear
