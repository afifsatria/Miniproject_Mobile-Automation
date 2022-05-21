Feature: Register
  As a user
  I should be able to create new account
  So that i can buy products



  Scenario Outline: Register
    Given I am on product page for register
    When I click logout button
    And I click register on login page
    And I input fullname "<Fullname>"
    And I input email "<Email>"
    And I input pass "<Password>"
    And click register button
    Then I get "<Result>"
    Examples:
      |Fullname|Email            |Password    |Result                 |
      |Pratama |new              |12345       |product_page           |
      |Pratama |Pratama          |Password3211|Failed                 |
      |Satria  |                 |Satria321   |Email can not empty    |
      |Satria  |Satria@gmail.com |            |Password can not empty |


  Scenario: When null data
    Given I am on product page for register
    When I click logout button
    And I click register on login page
    And null data
    And click register button
    Then All the error meesages appear



