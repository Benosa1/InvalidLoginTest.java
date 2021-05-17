Feature: Retrieve Password

  Background:
    Given I am on the homescreen
    And I click on the button to signin

  Scenario: I want to retrieve my forgotten password

    And I click the forgot your password link
    When I enter my email
    And I Click the retrieve passowrd button
    Then I should get a confirmation message