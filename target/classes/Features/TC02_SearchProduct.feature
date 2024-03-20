@regression
Feature: Search for a product
  I want to make sure that user can search for a specific product

  Scenario: user will be able to search about a product
    Given the user in the homepage
    When User enter name of a product in search bar
    And click on search button
    Then the user should find the product