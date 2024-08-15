Feature: practice.automationtesting websites

  Scenario: Accessing the practice.automationtesting websites
    Given Select go to practice automationtesting
    And Select add two Courses
    And Select button Shopping cart
    When Select delete a course in the shopping cart page
    Then Validate the calculation result