@ValidationMultipleInvoiceVoiding
Feature: Validation Multiple Invoice Voiding

  @NavigateToInvHistory
  Scenario: Navigate to Invoice History.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Invoice History Submenu from Billing Mainmenu.
    Then User is on Invoice History Page.

  @ValidatioErrorMultipleinvoices
  Scenario: show an validation error for multiple invoice
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "All"
    And clicks on save button
    And User has selected  invoices which has been sent to combined billing
      | DEMO222 |
      | DEMO345 |
    And user click on the "Void invoice"
    And User is on "Void Invoice" popup
    When User selects the first option "I'm correcting this invoice.It has not been processed by Railinc or submitted to anyone and I will be reusing the same invoice number"
    And clicks on void invoice button
    Then system will validate at the backend
    And User is on "Failed to Void Invoice(s)" popup
    And generates an error message "Invoice(s) # DEMO222,DEMO345 can't be voided as it/they is/are already sent to combined billing. To void it, please use Remove from combined billing button."
    And clicks on ok of failed invoice popup
    #And selection was removed from grid
    And invoice was deselected from grid
    And User lands to Invoice History Page.
    And there will be notification on the page
    And error message will be shown in activity summary panel as "FAILURE : Invoice(s) # DEMO222,DEMO345 can't be voided as it/they is/are already sent to combined billing. To void it, please use Remove from combined billing button."

  @ValidatioErrorMultipleinvoicesCombined
  Scenario: show an validation error for multiple invoice Combined
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "All"
    And clicks on save button
    And User has selected  invoices which has been sent to combined billing
      | DEMO222 |
      | DEMO234 |
    And user click on the "Void invoice"
    And User is on "Void Invoice" popup
    When User selects the first option "I'm correcting this invoice.It has not been processed by Railinc or submitted to anyone and I will be reusing the same invoice number"
    And clicks on void invoice button
    Then system will validate at the backend
    And User is on "Failed to Void Invoice(s)" popup
    And generates an error message "Invoice(s) # DEMO222 can't be voided as it/they is/are already sent to combined billing. To void it, please use Remove from combined billing button."
    And clicks on ok of failed invoice popup
    And selection was removed for failed invoice
    And User lands to Invoice History Page.
    And there will be notification on the page
    And error message will be shown in activity summary panel as "FAILURE : Invoice(s) # DEMO222 can't be voided as it/they is/are already sent to combined billing. To void it, please use Remove from combined billing button."
