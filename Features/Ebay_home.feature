Feature: Ebay home page

  @P1
  Scenario: Advance search
    Given User is on ebay home page
    When User clicks on Advance Search link
    Then New page should open

  @P2444
  Scenario: Search items count
    Given User is on ebay home page
    When I search for 'iphone13'
    Then Search items count of 1000000 should be displayed

  @P240 @LocalHook @P555
  Scenario: Search an item with category
    Given User is on ebay home page
    When I search for 'Toys' in 'baby' category

  @P231
  Scenario Outline: Home Page Links
    Given User is on ebay home page
    When I click on '<link>'
    Then Validate that page navigates to '<url>' and title contains '<title>'

    Examples: 
      | link              | url                                                            | title              |
      | Motors            | https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334 | Motors             |
      | Electronics       | https://www.ebay.com/b/Electronics/bn_7000259124               | Electronics        |
      | Collectibles & Art | https://www.ebay.com/b/Collectibles-Art/bn_7000259855          | Collectibles & Art |
      | Home & Garden     | https://www.ebay.com/b/Home-Garden/11700/bn_1853126            | Home & Garden      |
