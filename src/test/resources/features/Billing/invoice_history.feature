@MMSINVOICEHISTORY @Regression
Feature: Invoice History

  @MMSINVOICEHISTORY-001
  Scenario: Navigate to Invoice History.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Invoice History Submenu from Billing Mainmenu.
    Then User is on Invoice History Page.

  @MMSINVOICEHISTORY-002
  Scenario: Check for Sending Invoices to Combined Billing
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "All"
    And clicks on save button
    And User Selects Invoice Number "DEMO123".
    When User Selects Send to Combined Billing.
    And Clicks on OK.
    Then User can verify Last sent to combine as present date in the grid for Invoice Number "asgasdg".

  @MMSINVOICEHISTORY-003
  Scenario: Check for Sending Multiple Invoice to Combined Billing
    Given User is on Invoice History Page.
    And User selects Multiple Invoice Number "DEMO123", "VOIDOPT1".
    When User Selects Send to Combined Billing.
    And Clicks on OK.
    Then User can Verify Last Sent to combine as present date in the grid for Multiple Invoice.

  #@Manual
  #@MMSINVOICEHISTORY-005
  #Scenario: Check for Bulk Billing Summary for Multiple Invoice
  #Given User is on Invoice History Page.
  #And User selects Multiple Invoice Number "DEMO123", "VOIDOPT1".
  #When User selects Bulk Billing Summary.
  #And User can view Report Download Window.
  #And User selects Download under Action Column in the Grid.
  #Then User can verify file downloaded Successfully in the current Window.
  @MMSINVOICEHISTORY-004
  Scenario: Check for Sending Single Invoice to combined Billing using Filter Criteria.
    Given User is on Invoice History Page.
    And User Clicks on Filter.
    And Enters Invoice Number "DEMO123"
    When User Selects Invoice Number "DEMO123".
    And User Selects Send to Combined Billing.
    And Clicks on OK.
    Then User Can Verify Last Sent to combine as present date in the grid for Single Invoice.
