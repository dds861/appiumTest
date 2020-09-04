Feature: Make initial sign in

  @SignInScreenAppearsTest
  Scenario: Check Sign In Screen Appears
    Given Empty Page
    When Intranet page entered
    Then Sign in dialog appears

  @CancelButtonClickTest
  Scenario: Check Cancel button click
    Given Sign in dialog at CancelButtonClickTest
    When Cancel button clicked
    Then Unauthorized page appears

  @SignInButtonClickWithoutCredentialsTest
  Scenario: Check Sign In button click without credentials
    Given Sign in dialog at SignInButtonClickWithoutCredentialsTest
    When Sign in button clicked at SignInButtonClickWithoutCredentialsTest
    Then Dialog sign in appears

  @SignInButtonClickWithUsernameOnlyTest
  Scenario: Check Sign In button click with username only
    Given Sign in dialog at SignInButtonClickWithUsernameOnlyTest
    When Username "Username" is entered at SignInButtonClickWithUsernameOnlyTest
    And Sign in button clicked at SignInButtonClickWithUsernameOnlyTest
    Then Appears sign in dialog

  @SignInButtonClickWithPasswordOnlyTest
  Scenario: Check Sign In button click with password only
    Given Sign in dialog at SignInButtonClickWithPasswordOnlyTest
    When Password "Password" is entered at SignInButtonClickWithPasswordOnlyTest
    And Sign in button clicked at SignInButtonClickWithPasswordOnlyTest
    Then Dialog appears to sign in

  @SignInButtonClickWithIncorrectCredentialsTest
  Scenario: Check Sign In button click with incorrect credentials
    Given Sign in dialog at SignInButtonClickWithIncorrectCredentialsTest
    When Username "Username" is being entered incorrectly
    And Password "Password" is being entered incorrectly
    Then Dialog to sign in appears

  @SignInButtonClickWithCorrectCredentialsTest
  Scenario: Check Sign In button click with correct credentials
    Given Sign in dialog at SignInButtonClickWithCorrectCredentialsTest
    When Username "Username" is being entered correctly
    And Password "Password" is being entered correctly
    Then Main intranet page is being opened

