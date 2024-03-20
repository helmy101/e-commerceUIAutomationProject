@regression
Feature: Navigate through product
  I want to make sure that user can check product's specs and add it to cart

  Scenario: user will be able to check product's specs and add it to cart
    Given the user in the homepage
    When User enter name of a product in search bar
    And click on search button
    And the user should find the product
    And user click on product
    And user check product specification
    And user add product to cart
    And user navigate to cart page
    Then product should be add to card successfully