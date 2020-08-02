Feature: XYZ

  @ToggleMenuTest
  Scenario: S1
    Given The main page
    When I am on main page
    And I open toggle menu
    And I select Sectors item
    And I open toggle menu
    And I select Services item
    And I open toggle menu
    And I select Persons item
    And I open toggle menu
    And I select Media item
    And I open toggle menu
    And I select Contacts item
    And I open toggle menu
    Then I close toggle menu
