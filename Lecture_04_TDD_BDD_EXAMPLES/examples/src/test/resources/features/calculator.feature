Feature: Calculator

  Scenario: Add two numbers
    Given the calculator is started
    When I add 2 and 3
    Then the result should be 5

  Scenario: Add two numbers 2
    Given the calculator is started
    When I add 3 and 3
    Then the result should be 6

  Scenario: Subtract two numbers 2
    Given the calculator is started
    When I subtruct 3 and 2
    Then the result should be 1