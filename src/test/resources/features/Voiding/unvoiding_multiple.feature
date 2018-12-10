@UnvoidingErrorMultiple
Feature: Unvoiding Multiple

  @NavigateToInvHistory
  Scenario: Navigate to Invoice History.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Invoice History Submenu from Billing Mainmenu.
    Then User is on Invoice History Page.

  @UnvoidErrorforInvoicesAllActive
  Scenario: error on unvoiding the invoices which have active invoices-Multiple
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "Voided"
    And clicks on save button
    And User selects invoice
      | VOIDOPT1 |
      | DEMO333  |
    And user clicks on the "UnVoid invoice"
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # VOIDOPT1,DEMO333 can't be unvoided as there is/are active Invoice(s)"
    And clicks on ok
    And User lands to Invoice History Page.
    #And selection was removed from grid
    And invoice was deselected from grid

  @UnvoidErrorforInvoicesAllModified
  Scenario: error on unvoiding the invoices which has some updates on it after voiding
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "Voided"
    And clicks on save button
    And User selects invoice
      | DEMO222 |
      | DEMO234 |
    And user clicks on the "UnVoid invoice"
    Then User is on "Are You Sure?" popup
    And clicks on OK
    And User is on "Failed to Unvoid Invoice(s)" popup
    And popup displays generates error message as "Invoice(s)# DEMO222,DEMO234 can't be unvoided as the invoice(s) is/are modified"
    And clicks on ok of failed invoice popup
    And User lands to Invoice History Page.
    #And selection was removed from grid
    And invoice was deselected from grid
    And there will be notification on the page
    And error message will be shown in activity summary panel as "FAILURE : Unable to unvoid invoice(s) # DEMO222,DEMO234 , because that number is currently an active invoice"

  @UnvoidErrorforInvoicesModifedActive
  Scenario: error on unvoiding the invoices which has some updates on it after voiding and which has active invoices
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "Voided"
    And clicks on save button
    And User selects invoice
      | DEMO333 |
      | DEMO567 |
      | DEMO234 |
    And user clicks on the "UnVoid invoice"
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # DEMO333,DEMO567 can't be unvoided as there is/are active Invoice(s)"
    And clicks on ok
    And modified invoices remains selected
    And user clicks on the "UnVoid invoice"
    Then User is on "Are You Sure?" popup
    And clicks on OK
    And User is on "Failed to Unvoid Invoice(s)" popup
    And popup displays generates error message as "Invoice(s)# DEMO234 can't be unvoided as the invoice(s) is/are modified"
    And clicks on ok of failed invoice popup
    And User lands to Invoice History Page.
    #And selection was removed from grid
    And invoice was deselected from grid
    And there will be notification on the page
    And error message will be shown in activity summary panel as "FAILURE : Unable to unvoid invoice(s) # DEMO234 , because that number is currently an active invoice"

  @UnvoidErrorforInvoicesModifedActiveNotVoidedAndVoided
  Scenario: error on unvoiding the invoices which has some updates on it after voiding and which has active invoices
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "All"
    And clicks on save button
    And User selects invoice
      | VOIDOPT1 |
      | DEMO333  |
      | DEMO222  |
      | DEMO234  |
    And user clicks on the "UnVoid invoice"
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # VOIDOPT1 can't be unvoided as it/they is/are not voided"
    And popup displays another error message "Invoice(s) # DEMO333 can't be unvoided as there is/are active Invoice(s)"
    And clicks on ok
    And modified invoices remain selected
    And user clicks on the "UnVoid invoice"
    Then User is on "Are You Sure?" popup
    And clicks on OK
    And User is on "Failed to Unvoid Invoice(s)" popup
    And popup displays generates error message as "Invoice(s)# DEMO222,DEMO234 can't be unvoided as the invoice(s) is/are modified"
    And clicks on ok of failed invoice popup
    And User lands to Invoice History Page.
    #And selection was removed from grid
    And invoice was deselected from grid
    And there will be notification on the page
    And error message will be shown in activity summary panel as "FAILURE : Unable to unvoid invoice(s) # DEMO222,DEMO234 , because that number is currently an active invoice"
