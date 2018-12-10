@UnvoidSingle
Feature: Unvoiding Single

  @NavigateToInvHistory
  Scenario: Navigate to Invoice History.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Invoice History Submenu from Billing Mainmenu.
    Then User is on Invoice History Page.

  @UnvoidErrorforActiveCorrection
  Scenario: error on unvoiding an invoice which has an active invoice-Single
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "Voided for correction and corrected"
    And clicks on save button
    And User selects invoice
      | DEMO222 |
    And user clicks on the "UnVoid invoice"
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # DEMO222 can't be unvoided as there is/are active Invoice(s)"
    And clicks on ok
    And User lands to Invoice History Page.
    And invoice was deselected from grid

  @UnvoidErrorforActiveResubmitSame
  Scenario: error on unvoiding an invoice which has an active invoice after resubmission with same number-Single
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "Voided for resubmission -same invoice and resubmitted"
    And clicks on save button
    And User selects invoice
      | DEMO567 |
    And user clicks on the "UnVoid invoice"
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # DEMO567 can't be unvoided as there is/are active Invoice(s)"
    And clicks on ok
    And User lands to Invoice History Page.
    And invoice was deselected from grid

  @UnvoidErrorforActiveResubmitNew
  Scenario: error on unvoiding an invoice which has an active invoice after resubmission with new number-Single
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "Voided for resubmission -new invoice and resubmitted"
    And clicks on save button
    And User selects invoice
      | DEMO333 |
    And user clicks on the "UnVoid invoice"
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # DEMO333 can't be unvoided as there is/are active Invoice(s)"
    And clicks on ok of failed Invoice Popup
    And User lands to Invoice History Page.
    And invoice was deselected from grid

  #@UnvoidErrorforinvoicechanges
  #Scenario: error on unvoiding an invoice which has some updates on it -Single
  #Given User is on Invoice History Page.
  #When clicks on filter button
  #And enters invoice date as ""
  #And Void status as "Voided"
  #And clicks on save button
  #And selects invoice with status as
  #And User selects invoice
  #|VOIDOPT1|
  #And user clicks on the "UnVoid invoice"
  #Then User is on "Are You Sure?" popup
  #And clicks on OK
  #And User is on "Invoice validation error" popup
  #And popup displays generates error message "Invoice(s) # VOIDOPT1 can't be unvoided as the invoice(s) is/are modified"
  #And clicks on ok of failed Invoice Popup
  #And User lands to Invoice History Page.
  #And invoice was deselected from grid
  @UnvoidErrorforinvoicechangesResubmissionSame
  Scenario: error on unvoiding an invoice which has some updates on it and its voided for resubmission with same invoice number-Single
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "Voided"
    And clicks on save button
    #And selects invoice with status as
    And User selects invoice
      | DEMO234 |
    And user clicks on the "UnVoid invoice"
    Then User is on "Are You Sure?" popup
    And clicks on OK
    And User is on "Failed to Unvoid Invoice(s)" popup
    And popup displays generates error message as "Invoice(s)# DEMO234 can't be unvoided as the invoice(s) is/are modified"
    And clicks on ok of failed invoice popup
    And User lands to Invoice History Page.
    And invoice was deselected from grid

  @UnvoidErrorforinvoicechangesResubmissionNewInvoice
  Scenario: error on unvoiding an invoice which has some updates on it and resubmission with  new invoice number -Single
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "Voided"
    And clicks on save button
    #And selects invoice with status as
    And User selects invoice
      | DEMO345 |
    And user clicks on the "UnVoid invoice"
    Then User is on "Are You Sure?" popup
    And clicks on OK
    And User is on "Failed to Unvoid Invoice(s)" popup
    And popup displays generates error message as "Invoice(s)# DEMO345 can't be unvoided as the invoice(s) is/are modified"
    And clicks on ok of failed invoice popup
    #And clicks on ok
    And User lands to Invoice History Page.
    And invoice was deselected from grid
