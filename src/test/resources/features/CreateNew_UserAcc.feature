#@ignore
Feature: Create New User

  Background:
    Given I am on the homescreen
    And I click on the button to signin

  Scenario: I want to create a new user account

    And I enter email to create new user
    And I click the create account button
    When I enter all mandatory details for new user
    And I click the register button
    Then New user should be created successfully