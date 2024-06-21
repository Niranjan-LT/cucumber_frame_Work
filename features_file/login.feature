Feature: Facebook Login feature

  Scenario: Login to facebook account
    Given open the application and enter the url 
    When enter the valid user & password click on login button
    Then home page should be displayed
    Then verify the home page is displayed
  