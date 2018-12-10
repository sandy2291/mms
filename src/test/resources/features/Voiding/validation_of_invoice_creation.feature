@ValidationInvoiceCreation
Feature: Validation Of Invoice Creation

  @NavigateToInvoicing
  Scenario: Navigate to Invoicing.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Invoicing Submenu from Billing Mainmenu.
    Then User is on Invoicing Page.

  @ValidationInvoiceCreationSingle
  Scenario: error on creating invoice due to combined billing logic-Single
    Given User is on Invoicing Page.
    And a customer is selected which was already voided by third option
      | DEMO |
    And clicks on generate invoice button
    #And the same invoice number was sent from CRB to combine billing
    And User is on "Generate Invoices" popup
    And clicks on generate invoice button of popup
    #And Invoice number is populated same as the invoice number that was sent to combined billing from CRB
    Then User can Verify Error Message "The invoice can't be created as the same invoice number DEMO234b exists in MMS or has been voided for resubmission with new invoice number"
    And clicks on cancel invoice

  @ValidationInvoiceCreationMultiple
  Scenario: error on creating invoice due to combined billing logic-Multiple
    Given User Selects Invoicing Submenu from Billing Mainmenu.
    And User is on Invoicing Page.
    And a customer is selected which was already voided by third option
      | DEMO |
      | A002 |
      | KCS  |
    And clicks on generate invoice button
    #And the same invoice number was sent from CRB to combine billing
    And User is on "Generate Invoices" popup
    And clicks on generate invoice button of popup
    #And Invoice number is populated same as the invoice number that was sent to combined billing from CRB
    Then User can Verify Error Message "The invoice can't be created as the same invoice number DEMO444 exists in MMS or has been voided for resubmission with new invoice number"
    And User can Verify Second Error Message "The invoice can't be created as the same invoice number DEMO234b exists in MMS or has been voided for resubmission with new invoice number"
    And clicks on cancel invoice
