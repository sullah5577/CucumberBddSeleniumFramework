@new_customer
Feature: Adding new customers

  Background:
    Given User is on login page


  Scenario: user can add new customers after login

    When user enters userid and password
      | mngr175171 |  | AmApere |
    And user clicks on the login button
    And user click on add new customer link
    And user fills in new customer information and submit
      | Jenny Kim | 06/28/1978 | 123 Bayside Street | Brooklyn | New York | 456789 | 3475550123 | jkim@gmail.com | jkl123456 |
    Then new customer should be registered successfully

  @acct_1
  Scenario: customer can be assigned new account

    When user inputs userid and password
      | mngr175171 |  | AmApere |
    And user then click on login button
    And user verifies customer account
    And user click new account
    And user enter account information
      | customer-id | initial-deposit |
      | 32638       | 5000            |

    And user submit the account information
    Then new account created


