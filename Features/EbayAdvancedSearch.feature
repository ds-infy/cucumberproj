Feature: Ebay Advanced Search Page.

  @P2
  Scenario: Ebay logo on Adv Search Page.
    Given I am on Ebay Adv Search Page
    When I click on ebay logo
    Then I am navigated to home page.

  @P234
  Scenario: Advance search an item.
    Given I am on Ebay Adv Search Page
    When I advance search an item
      | keyword   | exclude     | min | max     |
      | iphone 11 | refurbished | 300 |   90000 |
      | iphone 12 | new         | 500 | 5000000 |
