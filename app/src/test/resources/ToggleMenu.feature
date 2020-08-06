Feature: XYZ

  @MyAreaTest
  Scenario: Check My Area Menu
    Given The main page at MyAreaTest
    When My Area clicked at MyAreaTest
    Then "Occupation" is seen at MyAreaTest

  @QueriesTest
  Scenario: Check Queries Menu
    Given The main page at QueriesTest
    When Queries clicked at QueriesTest
    Then "Occupation" is seen at QueriesTest
