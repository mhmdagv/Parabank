Feature: Request Loan Cases
  Background:
    When Click to Username
    And Click to Password
    And LoginBTN

@abc
  Scenario Outline: Negative Request Loans with <loan> and <down>
    Given After Log in
    When Clicks Request Loan Info
    And Fill The Loans Amount <loan>
    And Fill The Down Amount <down>
    And Click ApplyBtn
    Then There Must Be Error Text
Examples:
  | name                     | loan | down |
  | with empty loan and down |      |      |
  | with empty loan          |      | 400  |
  | with empty down          | 4000 |      |


  Scenario Outline: Decline Request Loans with <loan> and <down>
    Given After Log in
    When Clicks Request Loan Info
    And Fill The Loans Amount <loan>
    And Fill The Down Amount <down>
    And Click ApplyBtn
    Then There Must Be Decline Text

    Examples:
      | name                            | loan | down |
      | with uncorrect loan and payment | 13   | 130  |

  Scenario Outline: Accepted Request Loans with <loan> and <down>
    Given After Log in
    When Clicks Request Loan Info
    And Fill The Loans Amount <loan>
    And Fill The Down Amount <down>
    And Click ApplyBtn
    Then There Must Be Accepted Text

    Examples:
      | name                             | loan | down |
      | with acceptable loan and payment | 4000 | 6000 |