@MMSUSERMANGER @Phase1
Feature: User Manager

  @check1 @check3 @MMSUSERMANAGER-001
  Scenario: Navigate to User Manager.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User navigate through configuration.
    And User selects System and clicks User Manager.
    Then User is on User Manager Page.

  @check3 @MMSUSERMANAGER-002
  Scenario: Add User
    Given User is on User Manager Page.
    When User clicks on the Add User button
    Then User lands on the Add User Page
    And User can see the Text box for fields like Username,First Name,Last Name, Email and Roles check box such as Administrator,User,User_Editor, save and cancel buttons

  @check1 @MMSUSERMANAGER-003
  Scenario: Cancel Add User
    Given User is on the Add User Page
    When User enters data in fields like "Username","First Name","Last Name", "Email" and selects "Roles" check boxes
    And clicks on the cancel Button
    Then User lands on the "User Manager" page
    And User cannot see the User added in the grid

  @MMSUSERMANAGER-004
  Scenario: Save Add User
    Given User is on the Add User Page
    When User enters data in fields like "TEST1","First Name","Last Name", "test1@ey.com" and selects "Roles" check boxes
    And clicks on the save button
    Then User lands on the "User Manager" page
    And User can see the User added in the grid

  @MMSUSERMANAGER-005
  Scenario: Edit User
    Given User is on User Manager Page.
    When User clicks on filter button
    And username, roles, approval tier and enabled are displayed
    And has entered Username as "aaer00"
    And has selected Enabled filter as "All"
    And clicks on save
    When User clicks on the Arrow button in the Actions column for a User
    And clicks on "Edit" button
    Then User lands on the Edit User page
    And User can see the Text box for fields like Username,First Name,Last Name, Email and Roles check box such as Administrator,User,User_Editor, save and cancel buttons
    And clicks on the cancel Button

  @MMSUSERMANAGER-006
  Scenario: Cancel Edit User
    Given User is on User Manager Page.
    When User clicks on filter button
    And has entered Username as "aaer00"
    And has selected Enabled filter as "All"
    And clicks on save
    When User clicks on the Arrow button in the Actions column for a User
    And clicks on "Edit" button
    Then User lands on the Edit User page
    And User edits data in fields like "First Name","Last Name", "Email" and selects "Roles" check boxes
    And clicks on the cancel Button
    Then User lands on the "User Manager" page
    And User cannot see the User added in the grid

  @MMSUSERMANAGER-008
  Scenario: Disable a User from Drop Down disable option
    Given User is on User Manager Page.
    When User clicks on filter button
    And username, roles, approval tier and enabled are displayed
    And has entered Username as "aaer00"
    And has selected Enabled filter as "All"
    And clicks on save
    And User clicks on the Arrow button in the Actions column for a User
    And clicks on "Disable" button
    Then User can see that "Enabled" column displays "No" value for this User

  @MMSUSERMANAGER-009
  Scenario: Enable a User from Drop Down disable option
    Given User is on User Manager Page.
    When User clicks on filter button
    And username, roles, approval tier and enabled are displayed
    And has selected Enabled filter as "All"
    And has entered Username as "aaer00"
    And clicks on save
    And User clicks on the Arrow button in the Actions column for a User
    And clicks on "Enable" button
    Then User can see that "Enabled" column displays "Yes" value for this User

  @MMSUSERMANAGER-010
  Scenario: Disable a User from disable Button above the User Grid
    Given User is on User Manager Page.
    When User clicks on filter button
    And has entered Username as "aaer00"
    And has selected Enabled filter as "All"
    And clicks on save
    When User selects all enabled User
    And clicks on the disable button available above the User Grid
    And clicks on OK
    Then User can see that "Enabled" column displays "No" value for this User

  #Then User can see that Enabled column wont display "Yes" value for all Users
  @MMSUSERMANAGER-011
  Scenario: Enable a User from Enable Button above the User Grid
    Given User is on User Manager Page.
    When User clicks on filter button
    And has entered Username as "aaer00"
    And has selected Enabled filter as "All"
    And clicks on save
    When User selects all enabled User
    And clicks on the enable button available above the User Grid
    And clicks on OK
    Then User can see that "Enabled" column displays "Yes" value for this User

  #Then User can see that Enabled column wont display "NO" value for all Users
  @MMSUSERMANAGER-007
  Scenario: Save Edit User
    Given User is on User Manager Page.
    When User clicks on filter button
    And has entered Username as "aaer00"
    And has selected Enabled filter as "All"
    And clicks on save
    When User clicks on the Arrow button in the Actions column for a User
    And clicks on "Edit" button
    Then User lands on the Edit User page
    When User edits data in fields like "First","Last", "aaer01@ey.com" and selects "Roles" check boxes
    And clicks on the save button
    Then User lands on the "User Manager" page
    And User can see the User added in the Grid
