Feature: Update Contact Info
  Background:
    When Click to Username
    And Click to Password
    And LoginBTN



  Scenario: Update Contact Infos
    Given After Log in
    When Clicks Contact Infos
    And Edit All The Contact Info Fields
    Then All Field Must Be Updated
