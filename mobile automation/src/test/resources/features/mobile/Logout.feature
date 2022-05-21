Feature: Logout

  Scenario: Logout
    Given I am successfully login to my account
    When I click logout button on product page for logout
    Then I successfully logout