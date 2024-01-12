Feature: OrangeHRM Login

  Scenario: Logo should be present on OrangeHRM HomePage
    Given Launch the firefox browser
    When Open the OrangeHRM Homepage
    Then verify the Home page is displayed

  Scenario: Login to Application
    When enter the UserName and Password click on Login button
    Then verify the Home page is displayed

  Scenario: Click on PIM add the Employee
    When click on PIM Icon
    Then Verify the PIM page is displayed
    When click on add Employee major tab and enter the Firstname,MiddleName and LastName click on save button
    Then Check weather the confirmation message is displayed

  Scenario: verify the Employee in the EmployeeList
    When click on Employee List major tab
    Then verify the EmployeeName is present in Employee List

  Scenario: Select the Employee and Delete
    When Mousehover to employee and click on delete icon
    Then verify the delete confirmation message is displayed
