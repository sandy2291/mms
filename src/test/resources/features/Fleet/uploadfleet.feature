@MMSUPloadFleet @Phase1
Feature: Uploadfleet

  @MMSUPloadFleet-001
  Scenario: Log into MMS application.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    When User Clicks on MMS Login Button.
    Then User navigates to mms home page.

  @MMSUPloadFleet-002
  Scenario: Click on Upload fleet
    Given User navigate through configuration.
    When User selects fleets and clicks upload fleet.
    Then User navigates to upload fleets page.

  @UploadFleet
  Scenario: Upload Fleet
    Given User is on upload fleets page
    When User clicks on Upload File
    And browse the file "uploadfleet.csv"
    #Then User will see a progress bar as "In progress"
    Then User will see a progress bar as "Upload Completed."
    #And In the grid user will notice Pending in grey, for that file
    And user clicks on refresh
    And In the grid user will notice complete in green, for that file

  @MMSUPloadFleet-003
  Scenario: Verify uploaded details of the fleet
    Given User navigate through configuration.
    And User selects fleets and clicks fleets list.
    And User navigates to fleets list page.
    When User clicks on filter button.
    And User enters car initial 'KCS' and click on save.
    Then filter should apply and verify results.

  @ViewFleetLog
  Scenario: View Fleet Log
    Given User is on upload fleets page
    And user clicks on Action arrow
    And selects "View Log" from list
    Then User is on "Process Log for Fleet Upload" page
    And level will be shown as "INFORMATIONAL"
    And message will be shown as "File Received"
    And message will be shown as "Started process"
    And message will be shown as "Finished process"

  @DeleteFleet
  Scenario: Delete Fleet
    Given User is on upload fleets page
    When user clicks on Action arrow
    And selects "Delete" from list
    #And User can see the "Are You Sure?" Pop Up
    And User is on "Are You Sure?" popup
    And User can see the cancel and save buttons
    And clicks on the ok button
    And user clicks on refresh
    And status of file is changed to "DELETED"

  @VerifyDelete
  Scenario: Check for deleted cars
    Given User navigate through configuration.
    And User selects fleets and clicks fleets list.
    And User navigates to fleets list page.
    When User clicks on filter button.
    And User enters car initial 'KCS' and click on save.
    Then filter should apply and verify no results.

  @UploadFleetFileFailure
  Scenario: Upload Fleet list for negative test set
    Given User is on upload fleets page
    When User clicks on Upload File
    And browse the file "uploadfleet - error.csv"
    #Then User will see a progress bar as "In progress"
    Then User will see a progress bar as "Upload Completed."
    #And In the grid user will notice Pending in grey, for that file
    And user clicks on refresh
    And In the grid user will notice error in red, for that file

  @ViewFleetErrorLog
  Scenario: View Fleet Error Log
    Given User is on upload fleets page
    And user clicks on Action arrow
    And selects "View Log" from list
    Then User is on "Process Log for Fleet Upload" page
    And level will be shown as "INFORMATIONAL"
    And message will be shown as "Car Initials must contain 2 to 4 alphabetic characters"
