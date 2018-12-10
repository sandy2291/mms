@MMSCARTOCUSTOMERASSOCIATION
Feature: Car To Customer Association

  @TESTCIBUILD @MMSCARTOCUSTOMERASSOCIATION-001
  Scenario: Navigate to Car to customer association page.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Car to Customer Associations Submenu from Configuration Mainmenu.
    Then User lands to Car to Customer Associations Page.

  @MMSCARTOCUSTOMERASSOCIATION-003
  Scenario: Save Add Association
    Given User is on the Car To Customer Associations page
    When User clicks on the Add Association button
    Then User can see the "Add Car to Customer Association" Pop Up
    And User enters data in fields like "GE","003","043","A070"
    And clicks on the Save button
    And User lands to Car to Customer Associations Page.
    And can see the Association added

  @TESTCIBUILD @MMSCARTOCUSTOMERASSOCIATION-002
  Scenario: Cancel Add Association
    Given User is on the Car To Customer Associations page
    When User clicks on the Add Association button
    Then User can see the "Add Car to Customer Association" Pop Up
    And User can see the Text box for fields like "Initials","Start/End Number","Customer",save and cancel buttons
    And User enters data in fields like "ASDF","0435","083","A070"
    And clicks on the cancel button
    And User lands to Car to Customer Associations Page.
    And cannot see the Association added

  @MMSCARTOCUSTOMERASSOCIATION-004
  Scenario: Cancel Edit Association
    Given User is on the Car To Customer Associations page
    When user clicks on filter button
    And enters "GE" as car initial
    And selects "All" for enabled
    And clicks on the Save filter
    When User clicks on the Arrow button in the Actions column for a Company
    And clicks on "Edit" Button
    Then User can see the "Edit Car to Customer Association" Pop Up
    And User can see the Text box for fields like "Initials","Start/End Number","Customer"
    And User enters data in fields like "EG","0435","083","A070"
    And clicks on the cancel button
    And User lands to Car to Customer Associations Page.
    And cannot see the Association added

  @MMSCARTOCUSTOMERASSOCIATION-005
  Scenario: Save Edit Association
    Given User is on the Car To Customer Associations page
    When user clicks on filter button
    And enters "GE" as car initial
    And selects "Enabled Only" for enabled
    And clicks on the Save filter
    When User clicks on the Arrow button in the Actions column for a Company
    And clicks on "Edit" Button
    Then User can see the "Edit Car to Customer Association" Pop Up
    And User can see the Text box for fields like "Initials","Start/End Number","Customer"
    And User enters data in fields like "GE32","035","083","A070"
    And clicks on the Save button
    And User lands to Car to Customer Associations Page.
    And can see the Association added

  @MMSCARTOCUSTOMERASSOCIATION-006
  Scenario: Cancel Disable Association
    Given User is on the Car To Customer Associations page
    When user clicks on filter button
    And enters "GE32" as car initial
    And selects "Enabled Only" for enabled
    And clicks on the Save filter
    And User clicks on the Arrow button in the Actions column for a Company
    And clicks on "Disable" Button
    #Then User can see the "Are You Sure?" Pop Up
    Then User is on "Are You Sure?" popup
    And User can see the cancel and save buttons
    And clicks on the cancel button of popup
    And User lands to Car to Customer Associations Page.
    And "Enabled" column shows "Yes"

  @MMSCARTOCUSTOMERASSOCIATION-007
  Scenario: save Disable Association
    Given User is on the Car To Customer Associations page
    When user clicks on filter button
    And enters "GE32" as car initial
    And selects "Enabled Only" for enabled
    And clicks on the Save filter
    And User clicks on the Arrow button in the Actions column for a Company
    And clicks on "Disable" Button
    #Then User can see the "Are You Sure?" Pop Up
    Then User is on "Are You Sure?" popup
    And User can see the cancel and save buttons
    And clicks on the ok button
    And User lands to Car to Customer Associations Page.
    And user clicks on filter button
    And enters "GE32" as car initial
    And selects "Disabled Only" for enabled
    And clicks on the Save filter
    And "Enabled" column shows "No"
#@MMSCARTOCUSTOMERASSOCIATION-008
#Scenario: Cancel Enable Association  
#Given User is on the Car To Customer Associations page
#When user clicks on filter button
#And enters "GE32" as car initial
#And selects "Disabled Only" for enabled
#And clicks on the Save filter
#And User clicks on the Arrow button in the Actions column for a Company
#And clicks on "Enable" Button
#Then User can see the "Are You Sure?" Pop Up
#And User can see the cancel and save buttons
#And clicks on the cancel button of popup
#And User lands to Car to Customer Associations Page.
#And "Enabled" column shows "No"
