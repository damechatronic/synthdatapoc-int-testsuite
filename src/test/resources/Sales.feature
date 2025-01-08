Feature: Sales management

  @NewSale
  Scenario: User creates new sale
    Given User is on the landing page
    When User enters a valid user and password
    Then User must be redirected to the inventory page
    * user selects an item from inventory that has stock
    Then goes to sales page
    * user enters a valid SKU, quantity and Employee id
    Then transaction and commission has been registered on DB
    * a Success message should be displayed
