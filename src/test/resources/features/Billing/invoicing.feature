@MMSINVOICING
Feature: Invoicing

  @MMSINVOICING-001
  Scenario: Navigate to Invoicing.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Invoicing Submenu from Billing Mainmenu.
    Then User is on Invoicing Page.

  @MMSINVOICING-002
  Scenario: Check Details for Rebuttal or Exception Amount
    Given User is already on Invoicing Page.
    When User clicks on filter button
    And enters rmark as "A001"
    And type as "Rebuttal"
    And clicks on save filter
    And clicks on action column
    And User Selects the "View Details" under Action Column
    Then User can verify Car "001501",original Billing Party "KCS",Amount "$2,886.63".

  @MMSINVOICING-003
  Scenario: Check for Generating Invoice Without filling Invoice Number
    Given User is on Invoicing Page.
    When User clicks on filter button
    And enters rmark as "A001"
    And type as "All"
    And clicks on save filter
    And user selects "A001"
    And clicks on generate invoice button
    And enters invoice number as ""
    And invoice date as "9/7/2015"
    And due date as "10/7/2054"
    And Billing contact as "Ron Hessler"
    And clicks on generate invoice button of popup
    Then User can Verify Error Message "The Invoice Number field is required."
    And clicks on cancel invoice

  @MMSINVOICING-004
  Scenario: Check for Generating Invoice Due Date is less than Invoice Date
    Given User is on Invoicing Page.
    When User clicks on filter button
    And enters rmark as "A001"
    And type as "All"
    And clicks on save filter
    And user selects "A001"
    And clicks on generate invoice button
    And User is on "Generate Invoices" popup
    And enters invoice number as "875"
    And invoice date as "5/31/2016"
    And due date as "10/7/2027"
    And Billing contact as "Ron Hessler"
    And clicks on generate invoice button of popup
    And User will see a notification on the top right corner.
    Then User Can verify on Clicking the notification, panel Opens Error message "Invoice Due Date must be after Invoice Date for invoice"

  #Then User can Verify Error Message "Invoice Number field is required".
  @MMSINVOICING-005
  Scenario: Check for Generating Invoices
    Given User is on Invoicing Page.
    When User clicks on filter button
    And enters rmark as "A001"
    And type as "All"
    And clicks on save filter
    And user selects "A001"
    And clicks on generate invoice button
    And User is on "Generate Invoices" popup
    And enters invoice number as "AZSX"
    And invoice date as "5/20/2016"
    And due date as "10/7/2027"
    And Billing contact as "Ron Hessler"
    And clicks on generate invoice button of popup
    And User Selects Invoice History Submenu from Billing Mainmenu.
    Then User Can verify Billed Party "A001" for Generated Invoice for "AZSX" in the Grid.
    And User will see a notification on the top right corner.
    And on Clicking the notification, panel opens to show the success message.

  @MMSINVOICING-006
  Scenario: Check for Generating Invoices for multiple invoices
    Given User Selects Invoicing Submenu from Billing Mainmenu.
    And User is on Invoicing Page.
    When User clicks on filter button
    And enters rmark as ""
    And type as "All"
    And clicks on save filter
    And user selects "A001" customer
    And user selects "KCS" customer
    And clicks on generate invoice button
    And User is on "Generate Invoices" popup
    And enters invoice number as "asd" for "A001" customer
    And invoice date as "5/20/2016" for "A001" customer
    And due date as "10/7/2067" for "A001" customer
    And Billing contact as "Ron Hessler" for "A001" customer
    And enters invoice number as "qwe" for "KCS" customer
    And invoice date as "5/20/2016" for "KCS" customer
    And due date as "8/7/2057" for "KCS" customer
    And Billing contact as "John Thompson" for "KCS" customer
    And clicks on generate invoice button of popup
    And User Selects Invoice History Submenu from Billing Mainmenu.
    Then User Can verify Billed Party "A001" for Generated Invoice for "ASD" in the Grid.
    And User Can verify Billed Party "KCS" for Generated Invoice for "QWE" in the Grid.
    And User will see a notification on the top right corner.
    And on Clicking the notification, panel opens to show the success message.
