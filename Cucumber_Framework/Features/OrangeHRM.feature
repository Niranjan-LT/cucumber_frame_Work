@OrangeHrm
Feature: OrangeHRM Login

  @OpenAppn
  Scenario: Logo should be present on OrangeHRM HomePage
    Given Launch the firefox browser
    When Open the OrangeHRM Homepage
    Then verify the Login page is displayed

  @LoginToAppn
  Scenario: Login to Application
    When enter the UserName and Password click on Login button
    Then verify the Home page is displayed


