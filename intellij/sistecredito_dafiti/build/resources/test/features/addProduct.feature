Feature: Add a product to the shopping cart
  Scenario: Add product to shopping cart
    Given that a customer wants to buy a product
    When choose the product to buy
    Then should see the product in the shopping cart

