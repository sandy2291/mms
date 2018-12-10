@MMSRepairDetail
Feature: Repair Details

  @MMSRepairDetail-001
  Scenario: Navigate to Rebuttal billing page.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Repair Details Submenu from Invoice Mainmenu
    Then User lands to Repair Detail Page

  @MMSRepairDetail-002
  Scenario: Check the Repair Details under Repairs Tab
    Given User is already on Repair Detail Page
    And User clicks on filter of repair page
    And Enters the Invoice Number "I001501" to "I001501"
    When User Clicks on Save
    Then User can view a grid below under the Repair Tab
    And User can verify the Description for the Particular Car as "TEST"
    And User clicks on Cars tab
    And User can view a grid below under the Cars Tab
    And User can verify the the Car Initial as "AS" and Car Number as "001501"
    And User clicks on Invoices tab
    And User can view a grid below under the Invoices Tab
    And User can verify total Amount for the Invoice as "$2,886.63"

  @MMSRepairDetail-003
  Scenario: Check for Audit Results
    Given User is already on Repair Detail Page
    And User clicks on Repairs tab
    And User can view a grid below under the Repair Tab
    When User Click on Audit Tab in the Grid.
    Then User is on "Audit Results" popup
    And User can Verify the Number of Repair as "AS 001501"
    And User Can verify the description for the Repair under Message as "When the detail source is GB, all repairs on the car must be group billable jbo codes."
    And clicks on close button

  @MMSRepairDetail-004
  Scenario: Check for Car Details
    Given User is already on Repair Detail Page
    When User clicks on Cars tab
    And User can view a grid below under the Cars Tab
    And User clicks on Audits Tab in the Grid.
    Then User is on "Audit Results for Car AS 001501, Invoice I001501" popup
    And clicks on close button

  @MMSRepairDetail-005
  Scenario: Check for Car Details
    Given User is already on Repair Detail Page
    When User clicks on Invoices tab
    And User can view a grid below under the Invoices Tab
    Then User can verify Invoice number as "I001501"
    And User can verify total Amount for the Invoice as "$2,886.63"
