Feature: Login

  Background:
    When User fill username input field with "Fuad1992"
    And User fill password input field with "fuadfuad1"
    And Click login button


  Scenario: Check Open New account functionality
    Given User is in "Parabank homepage" page
    When Click to Open New Account button
    And Select Savings account
    And Select "18117" account
    And Clicks Open New Account button
    Then Account opened message should be displayed


  Scenario: Check Transfer funds functionality
    Given User is in "Parabank homepage" page
    When Click Transfer funds button
    And Fill Amount input field with "500"
    And Selects "16119" account
    And Select "16008" accounts
    And Click Transfer button
    Then Transfer Complete message should be displayed



  Scenario: Check Request loan functionality
    Given User is in "Parabank homepage" page
    When Click Request loan button
    And User fill Loan Amount input field with "2000"
    And User fill Down Payment input field with "2000"
    And Select From Account with "15786"
    And Click Apply now button
    Then Loan Request Processed message should be displayed



