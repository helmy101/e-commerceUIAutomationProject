@regression @checkout
Feature: Proceed to checkout
  I want to make sure that user can proceed to checkout and submit order

  Scenario: user will be able to proceed to checkout and submit order
    Given the user in the homepage
    When User enter name of a product in search bar
    And click on search button
    And the user should find the product
    And user click on product
    And user check product specification
    And user add product to cart
    And user navigate to cart page
    Then product should be add to card successfully
    And user click proceed to checkout
    And user enter delivery details
    And accept terms and conditions
    And user select payment
    Then user can place order