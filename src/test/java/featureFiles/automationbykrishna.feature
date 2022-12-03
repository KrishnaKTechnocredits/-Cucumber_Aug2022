Feature: Automation UI and DB

  @ui
  Scenario: validate employee basic information
    Given user is on application home page
    And user click on Demo table tab
    Then user verify employee basic informaiton with database