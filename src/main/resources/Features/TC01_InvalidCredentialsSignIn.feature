@regression
Feature: User Logging in
  I want to make sure that user cannot login using Invalid data.

  Scenario: user will not be logged in after entering a Invalid data
    Given the user in the homepage
    When User click on profile button
    And User tap on sign in button
    And Enter invalid credentials
    Then Error message should be displayed