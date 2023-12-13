
@Calculator
Feature: This feature will help to develope a calculator

  Background: 
    Given I have the calculator

  Scenario: To add two numbers
    When I add 11 and 4
    Then I should get reault as 15

  Scenario: To sub two numbers
    When I sub 12 and 4
    Then I should get reault as 8

  Scenario Outline: To add two numbers with multiple data sets
    When I add <num1> and <num2>
    Then I should get reault as <result>

    Examples: 
      | num1 | num2 | result |
      |    9 |    8 |     17 |
      |   23 |   12 |     35 |
      |   -8 |   40 |     32 |

  Scenario: To add multiple numbers
    When I add below numbers
      |  3 |
      |  9 |
      |  7 |
      | 10 |
      | 20 |
    Then I should get reault as 49

  Scenario: To get total bill of my purchased items
    When I buy below items with price
      | coffee |  50 |
      | burger | 100 |
      | water  |  20 |
    Then I should get reault as 170

  Scenario: To get total bill of my purchased items with Qty
    When I buy below items with price and Qty
      | coffee | 2 |  50 |
      | burger | 1 | 100 |
      | water  | 3 |  20 |
    Then I should get reault as 260
