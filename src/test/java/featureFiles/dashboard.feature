Feature: dashboard feature

  Background:
#    And user enter "admin" and pwd as "MPCs0K@ce1" on login page
#    And user click on login button on login page

  @1
  Scenario: verify user should be able to login
    And user should see "Employee Managemen" title on dashboard page


  @2 @smoke
  Scenario: verify employee salary is non zero
    And user click on my info tab on dashboard page
    And user click on salary tab on my info page
    And user should see salary is non zero ""

  @3
  Scenario: abc
    Given "2" and "3" sum is "6"

  @3
  Scenario: abc
    Given "2" and "3" sum is "6"

  @3
  Scenario: abc
    Given "2" and "3" sum is "6"
