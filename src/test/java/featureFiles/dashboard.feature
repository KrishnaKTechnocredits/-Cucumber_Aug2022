Feature: dashboard feature

  @1 @regression @jira-1569
  Scenario: login
    And user enter "admin" and pwd as "" on login page
    And user click on login button on login page
    And user navigate to dashboard page
