Feature: login functionality

  @logintest @smoke
  Scenario: login

    Given user on homepage
    When  user login username as "Admin" and password as "admin123"
    Then  login should be successful

