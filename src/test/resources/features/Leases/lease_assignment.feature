@MMSLEASES
Feature: Lease Assignment

  @MMSLEASES-001
  Scenario: log into MMS application.
    Given the user enter the username 'kcsadmin'
    And User enters password 'admin'
    And User Clicks on Login Button
    When User clicks Lease Assignment Submenu from Configuration Mainmenu
    Then navigates to Lease Assignement Page

  @MMSLEASES-002
  Scenario: Navigate to Upload Lease Assignment screen.
    Given the user is already on Lease Assignment Page
    When user clicks on Upload CSV
    Then user will navigate to Upload Lease assignment page
    #@MMSLEASES-003
    #Scenario: Upload Lease assignment.
    #Given user is already in Lease Assignment Page
    When User clicks on Upload File
    And browse the file "LeaseAssignment.csv"
    Then User will see a progress bar as "Upload Completed."

  #And In the grid user will notice Pending in grey, for that file
  @MMSLEASES-004
  Scenario: Search for the Car loaded via the file
    Given user reached to Lease Assignment Page
    When User clicks on Filter
    And User Enters Car Initial 'KCS'
    And Car Number range from '000470' to '000470'
    Then User will get the cars on the grid as per the data loaded

  @MMSLEASES-005
  Scenario: Unassign a lease assignment with a end date
    Given User is viewing Lease Assignment page
    When User selects the row with an end date
    And Clicks on Un-Assign
    And Enters the End date '05/08/2016'
    And Clicks on Save unassign
    Then User will get an error stating the end date is already set

  @MMSLEASES-006
  Scenario: View log for Complete file upload
    Given User lands to Lease Assignment page
    When User selects the successfull row
    And Clicks on View log under Actions column
    Then User will land to the process log with a grid
    And Grid will have 3 rows stating File received, Started Process and Finished Process

  @MMSLEASES-007
  Scenario: Navigate View lease page.
    Given User has clicked on Configuration tab and Leases has appeared on the menu list.
    When User clicks on the Leases and Selects View Leases.
    Then User will navigate to the View Leases page.

  @MMSLEASES-008
  Scenario: navigate to Add a Lease page.
    Given User is on the View leases page.
    When User clicks on Add Lease button.
    Then User will land to Add Lease page.

  @MMSLEASES-009
  Scenario: Select a lease with Full Lease type and I am leasing these cars to someone.
    Given User is on the Add Lease page.
    When User selects Lease Type as Full and Lease Relationship as I am leasing these cars to someone.
    Then User will see a new section added below Lease parameters as Lease information.
