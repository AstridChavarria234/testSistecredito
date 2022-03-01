Feature: Buy product in webSite
  Me as a client of dafiti
  I want to buy a product
  to give a gift

  Scenario Outline: Add product to shopping cart
    Given that a customer wants to buy a product
    When choose the product to buy
      | Product          | <Product>          |
      | Feature Product  | <Feature Product>  |
      | Delivery Address | <Delivery Address> |
      | Email            | <Email>            |
      | City             | <City>             |
      | Department       | <Department>       |
      | Neighborhood     | <Neighborhood>     |
      | Address          | <Address>          |
      | Apto Number      | <Apto Number>      |

    Then should see the payment information
    Examples:
      | Product | Feature Product | Delivery Address | Email          | City     | Department | Neighborhood | Address        | Apto Number |
      | Reloj   | Hombre-G-Shock  | Cr 34 # 12-35    | test@gmail.com | Medellin | Antioquia  | Medellin     | CR 34 # 12 -13 | 133         |
