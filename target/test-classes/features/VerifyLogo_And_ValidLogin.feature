Feature: Logo and Valid login

  Background:
    Given I am on the homescreen
    And I click on the button to signin

  Scenario: I want to verify that logo is displayed and login with valid credentials

    And I verify that the application logo is displayed
    When I enter my valid username
    And I enter my valid password
    When I click on the login button
    Then I should be logged in successfully

