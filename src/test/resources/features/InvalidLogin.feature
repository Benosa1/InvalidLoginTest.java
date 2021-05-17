#@ignore
Feature: Login

  Background:
    Given I am on the homescreen
    And I click on the button to signin

  Scenario Outline: Login with invalid credentials should return appropriate error message

    When I enter user email "<email>" in the username field
    And I enter user password "<password>" in the password field
    And I click on login
    Then I should get the right error message "<ErrorMessage>"

      Examples:
      |email                           |password                     |ErrorMessage              |
      |lanreikuesan+1@gmail.com        |march                        |Authentication failed.    |
      |lanre222@gmail.com              |march2021                    |Authentication failed.    |
      #|lanre222@mail.com               |march                        |Authentication failed.    |
      #|                                |                             |An email address required.|
      #|lanreikuesan+1@gmail.com        |                             |Password is required.     |
      #|                                |march2021                    |An email address required.|

