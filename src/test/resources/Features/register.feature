
Feature: register
  @register
Scenario: Successful register
  Given User is in "paraBank" website
  When  User clicks register button
  And   User fills in his information completely
  And   User clicks register button for complete
  Then  User successfully registered should be displayed on the page
@error
  Scenario: Unsuccessful register
    Given User is in "paraBank" website
    When  User clicks register button
    And   User fills in his information is not completed
    And   User clicks register button for complete
    Then  User  should be displayed error msj on the page

