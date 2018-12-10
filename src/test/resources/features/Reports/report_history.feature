@MMSREPORTS
Feature: Report History

  @MMSREPORTS-001
  Scenario: Log into MMS application.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    When User Clicks on MMS Login Button.
    And User navigates to mms home page.
    And User clicks on report history
    Then User lands on the Report History Page

  #@Manual
  #@MMSREPORTS-002
  #Scenario: User downloads a Report from Report History page
  #Given User is on the Report History Page
  #And User has clicked "Arrow" button Under "Actions" column for a line item
  #And clicks on the "Download" button to land on the "Report Download" Pop Up
  #When User clicks on the "Arrow" button Under "Actions" column for a line item on the "Report Download" Pop Up
  #And  clicks on the Download button
  #Then User lands on the Report History page
  #And Report gets downloaded in pdf form in the Downloads folder
  @Manual @MMSREPORTS-003
  Scenario: User clicks on download and closes the pop up
    Given User lands on the Report History Page
    And User has clicked "Arrow" button Under "Actions" column for a line item
    And clicks on the "Download" button to lands on the "Report Download" Pop Up
    When User clicks on the "Close" button
    Then Report is not downloaded

  @MMSREPORTS-004
  Scenario: Filter data and select Save
    Given User is on the "Report History" Page
    And has clicked the "filter" button
    When User enters the filter criteria such as Report Create Date '11/30/2016'
    And clicks on the Save Button of report history
    Then User lands on the Report History Page
    And User can see the filtered data in the grid

  @MMSREPORTS-005
  Scenario: Filter data and select Cancel
    Given User is on the "Report History" Page
    And has clicked the "filter" button
    When User enters the filter criteria such as Report Create Date '11/30/2016'
    And clicks on the "Cancel" Button of report history
    Then User lands on the Report History page
    And User cannot see the filtered data in the grid
    But can see all the available data
