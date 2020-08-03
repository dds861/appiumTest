Feature: Make initial sign in

  @SignInScreenAppearsTest
  Scenario: Check Sign In Screen Appears
    Given GoTo sign in page
    Then Sign in screen appears

  @CancelButtonClickTest
  Scenario: Check Cancel button click
    Given GoTo sign in page
    When Sign in screen appears
    And Cancel button clicked
    Then Unauthorized page appears

  @SignInButtonClickWithoutCredentialsTest
  Scenario: Check Sign In button click without credentials
    Given GoTo sign in page
    When Sign in screen appears
    And Click sign in button
    Then Sign in screen appears

  @SignInButtonClickWithUsernameOnlyTest
  Scenario: Check Sign In button click with username only
    Given GoTo sign in page
    When Sign in screen appears
    And Enter "Username" to username
    And Click sign in button
    Then Sign in screen appears

  @SignInButtonClickWithPasswordOnlyTest
  Scenario: Check Sign In button click with password only
    Given GoTo sign in page
    When Sign in screen appears
    And Enter "password" to password
    And Click sign in button
    Then Sign in screen appears

  @SignInButtonClickWithIncorrectCredentialsTest
  Scenario: Check Sign In button click with incorrect credentials
    Given GoTo sign in page
    When Sign in screen appears
    And Enter incorrect "Username" to username
    And Enter incorrect "password" to password
    And Click sign in button
    Then Sign in screen appears

  @SignInButtonClickWithCorrectCredentialsTest
  Scenario: Check Sign In button click with correct credentials
    Given GoTo sign in page
    When Sign in screen appears
    And Enter correct "Username" to username
    And Enter correct "password" to password
    And Click sign in button
    Then Main intranet page is being opened

