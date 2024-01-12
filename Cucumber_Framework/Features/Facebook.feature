Feature: Login To faceBook

  Scenario: Open the Browser enter the url and Enter the username and password
    Given open Browser enter the url
    When Enter the username and password
    Then click the Login button
    And close the browser
