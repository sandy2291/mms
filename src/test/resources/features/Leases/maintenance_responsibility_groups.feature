@MAINTENANCERESPONSIBILITYGROUPS
Feature: Maintenance Responsibility Groups

  @MAINTENANCERESPONSIBILITYGROUPS-001
  Scenario: Navigate to Maintenance responsibility groups
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User navigate through configuration.
    And User selects Leases and clicks maintenance responsibility groups
    Then User is on maintenance responsibility groups page

  @MAINTENANCERESPONSIBILITYGROUPS-002
  Scenario: User adds a Group and clicks on Cancel
    Given User is on maintenance responsibility groups page
    And User has clicked Add Groups button
    And User is on the Add Group Page
    And And User has entered name as "name"
    And User has entered description as "desc"
    And User has entered Job Code as "Any"
    And User has entered Qualifier Codes as "Any"
    And User has entered why made code as "Any"
    When User clicks on the Cancel button
    Then User is on maintenance responsibility groups page
    And does not see the newly added Group in the Grid

  @MAINTENANCERESPONSIBILITYGROUPS-003
  Scenario: User keeps all the fields blank and clicks on Save
    Given User is on maintenance responsibility groups page
    And User has clicked Add Groups button
    And User is on the Add Group Page
    #And User has entered description as "desc1"
    When User clicks on the save group button
    Then User gets an Red error message box against the Name field indicating its a mandatory field
    Then User clicks on the Cancel button

  @MAINTENANCERESPONSIBILITYGROUPS-004
  Scenario: User keeps Repair Criteria fields blank and clicks on Save
    Given User is on maintenance responsibility groups page
    And User has clicked Add Groups button
    And User is on the Add Group Page
    And And User has entered name as "name"
    And User has entered description as "desc"
    When User clicks on the save group button
    Then User gets an Red error message stating "You cannot have a line that matches everything"
    Then User clicks on the Cancel button

  @MAINTENANCERESPONSIBILITYGROUPS-005
  Scenario: User adds a new line in the Repair Criteria
    Given User is on maintenance responsibility groups page
    And User has clicked Add Groups button
    And User is on the Add Group Page
    When user clicks on add new line
    Then a line item with fields Job Codes,Qualifier Codes and Why Made Codes gets added in the Repair Criteria

  @MAINTENANCERESPONSIBILITYGROUPS-006
  Scenario: User clicks on delte icon in the Repair Criteria
    Given User is on the Add Group Page
    When user clicks on delte icon
    Then the Line Item gets deleted from the Repair Criteria
    And User clicks on the Cancel button

  @MAINTENANCERESPONSIBILITYGROUPS-007
  Scenario: User adds a group
    Given User is on maintenance responsibility groups page
    And User has clicked Add Groups button
    And User is on the Add Group Page
    And And User has entered name as "Automate"
    And User has entered description as "test automation"
    And User has entered Job Code as "Specified"
    And User has entered Job Code text as "4099"
    And User has entered Qualifier Codes as "Specified"
    And User has entered Qualifier Codes text as "FRA"
    And User has entered why made code as "Specified"
    And User has entered why made code text as "1A"
    When User clicks on the save group button
    Then User is on maintenance responsibility groups page
    And User can see the newly added Group in the Grid

  @MAINTENANCERESPONSIBILITYGROUPS-008
  Scenario: User adds a existing group
    Given User is on maintenance responsibility groups page
    And User has clicked Add Groups button
    And User is on the Add Group Page
    And And User has entered name as "Automate"
    And User has entered description as "test automation"
    And User has entered Job Code as "Specified"
    And User has entered Job Code text as "4099"
    And User has entered Qualifier Codes as "Specified"
    And User has entered Qualifier Codes text as "FRA"
    And User has entered why made code as "Specified"
    And User has entered why made code text as "1A"
    When User clicks on the save group button
    Then user gets error message as "The maintenance responsibility group rule already exists with this name"
    And User clicks on the Cancel button

  @MAINTENANCERESPONSIBILITYGROUPS-009
  Scenario: User selects Disable and cancel
    Given User is on maintenance responsibility groups page
    And user clicks on filter button
    And Selects enabled as "Enabled Only"
    And clicks on save button of filter
    When User clicks on arrow button of "Automate" record
    And User clicks on "Disable" from action list
    And User clicks on cancel of poup
    Then User is on maintenance responsibility groups page
    And enabled column shows "Yes" for "Automate" record

  @MAINTENANCERESPONSIBILITYGROUPS-010
  Scenario: User selects Disable and save
    Given User is on maintenance responsibility groups page
    And user clicks on filter button
    And Selects enabled as "Enabled Only"
    And clicks on save button of filter
    When User clicks on arrow button of "Automate" record
    And User clicks on "Disable" from action list
    And User clicks on save of poup
    Then User is on maintenance responsibility groups page
    And user clicks on filter button
    And Selects enabled as "Disabled Only"
    And clicks on save button of filter
    And enabled column shows "No" for "Automate" record

  @MAINTENANCERESPONSIBILITYGROUPS-011
  Scenario: User selects Enable and cancel
    Given User is on maintenance responsibility groups page
    And user clicks on filter button
    And Selects enabled as "Disabled Only"
    And clicks on save button of filter
    When User clicks on arrow button of "Automate" record
    And User clicks on "Enable" from action list
    And User clicks on cancel of poup
    Then User is on maintenance responsibility groups page
    And enabled column shows "No" for "Automate" record

  @MAINTENANCERESPONSIBILITYGROUPS-012
  Scenario: User selects Enable and save
    Given User is on maintenance responsibility groups page
    And user clicks on filter button
    And Selects enabled as "Disabled Only"
    And clicks on save button of filter
    When User clicks on arrow button of "Automate" record
    And User clicks on "Enable" from action list
    And User clicks on save of poup
    Then User is on maintenance responsibility groups page
    And user clicks on filter button
    And Selects enabled as "Enabled Only"
    And clicks on save button of filter
    And enabled column shows "Yes" for "Automate" record

  @MAINTENANCERESPONSIBILITYGROUPS-013
  Scenario: User selects Edit and cancel
    Given User is on maintenance responsibility groups page
    When User clicks on arrow button of "Automate" record
    And User clicks on "Edit" from action list
    And User is on edit group page
    And And User has entered name as "name"
    And User has entered description as "desc"
    And User has entered Job Code as "Any"
    And User has entered Qualifier Codes as "Any"
    And User has entered why made code as "Any"
    When User clicks on the Cancel button
    Then User is on maintenance responsibility groups page
    And does not see the newly added Group in the Grid

  @MAINTENANCERESPONSIBILITYGROUPS-014
  Scenario: User selects Edit and save
    Given User is on maintenance responsibility groups page
    When User clicks on arrow button of "Automate" record
    And User clicks on "Edit" from action list
    And User is on edit group page
    And And User has entered name as "Test Automation"
    And User has entered description as "desc"
    And User has entered Job Code as "Specified"
    And User has entered Job Code text as "4099"
    And User has entered Qualifier Codes as "Specified"
    And User has entered Qualifier Codes text as "FRA"
    And User has entered why made code as "Specified"
    And User has entered why made code text as "1A"
    And User clicks on the save group button
    Then User is on maintenance responsibility groups page
    And User can see the newly added Group in the Grid

  @MAINTENANCERESPONSIBILITYGROUPS-015
  Scenario: Click filter save and check
    Given User is on maintenance responsibility groups page
    And user clicks on filter button
    And Selects enabled as "All"
    And enters name as "Test Automation"
    And clicks on save button of filter
    Then user can see the row
