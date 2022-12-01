Feature: des

  Background:
    And user enter "admin" and pwd as "MPCs0K@ce1" on login page
    And user click on login button on login page
    And user click on leave tab on left panel

  Scenario: a
    And user should see "Leav lits" displayed

  Scenario: b
    And user should see "Apply" displayed
