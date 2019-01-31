@login
Feature: Guru99 Bank Manager Login feature

  Background:
    Given User is on login page

  Scenario: Guru99 login test scenario

    When user enters username and password
    And user clicks on login button
    Then user have manager access to bank

  @login-1

  Scenario Outline: Verify invalid login for multiple users invalid username
    When user enters invalid "<username>" and valid "<password>"
    And user click on login button
    Then user is prompted with invalid username and password message

    Examples:

      | username   | password |
      | mngr175171 | AmApere  |
      | mngr185156 | AmApere  |
      | mngr012345 | AmApere  |

  @login-2
  Scenario Outline: Verify invalid login for multiple users with valid username
    When user enters valid "<username>" and invalid "<password>"
    And user  click on login button
    Then user  is prompted with invalid username and password message

    Examples:

      | username   | password |
      | mngr175171 | abc123   |
      | mngr175171 | xyz123   |
      | mngr175171 | jkl123   |