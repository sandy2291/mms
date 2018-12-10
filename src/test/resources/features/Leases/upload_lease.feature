@UploadLeases
Feature: Upload Lease

  @NavigateToUploadLeasePage
  Scenario: log into MMS application.
    Given the user enter the username 'kcsadmin'
    And User enters password 'admin'
    And User Clicks on Login Button
    When User clicks upload leases Submenu from Configuration Mainmenu
    Then User is on Upload Leases Page

  @UploadLease
  Scenario: Upload lease
    Given User is on Upload Leases Page
    When User clicks on Upload File
    And browse the file "uploadLease.csv"
    #Then User will see a progress bar as "In progress"
    Then User will see a progress bar as "Upload Completed."
    #And In the grid user will notice Pending in grey, for that file
    And clicks on refresh lease
    And In the grid user will notice complete in green, for that file

  @ViewLog
  Scenario: View Log
    Given User is on Upload Leases Page
    And user clicks on Action arrow
    And selects "View Log" from list
    Then User is on "Process Log for Lease" page
    And level will be shown as "INFORMATIONAL"
    And message will be shown as "File Received"
    And message will be shown as "Started process"
    And message will be shown as "Finished process"

  @UploadLeaseFileFailure1
  Scenario: Uploading lease file with removing a column
    Given User is already on Upload Leases Page
    When User clicks on Upload File
    And browse the file "UploadLeaseError.csv"
    #Then User will see a progress bar as "In progress"
    Then User will see a progress bar as "Upload Completed."
    And clicks on refresh lease
    And In the grid user will notice error in red, for that file
