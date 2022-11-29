Feature: login feature

  Background:
#    Given user is on application login page
    When user enters user and password on login page
    And user click on login button on login page

  @1 @regression @jira-1569
  Scenario: verify employee ctc is displayed on my salary tab
    Then user verify dashboard page displayed
    And user click on my info tab on darshboard page
    And user click on salary tab
    Then user should see ctc under salary tab

  @1 @smoke @jira-1570
  Scenario: verify employee ctc is displayed on my salary tab
    Then user verify dashboard page displayed
    And user click on my info tab on darshboard page
    And user click on salary tab
    Then user should see ctc under salary tab

  @3
  Scenario Outline: anything
    And user enter userName as "<userName>" and password as "<Password>"
#    And user enter userName as "harsh" and password as "harsh123"
    And user enter 78954313 in ctc

    Examples:
      | userName | Password  |
      | admin    | admim1234 |
      | harsh    | harsh123  |
      | maulik   | maulik123 |
