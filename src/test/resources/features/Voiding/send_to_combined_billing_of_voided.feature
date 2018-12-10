@SendToCombinedbillingofVoidedinvoice
Feature: Send To Combined Billing Of Voided

  @NavigateToInvHistory
  Scenario: Navigate to Invoice History.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Invoice History Submenu from Billing Mainmenu.
    Then User is on Invoice History Page.

  @SendToCombinedbillingforsingleinvoice-voided
  Scenario: show an Error while trying to Send to combined billing an  voided invoice-single
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "Voided"
    And clicks on save button
    And User selects invoice
      | VOIDOPT1 |
    When user clicks on the send to combined billing button
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # VOIDOPT1 can't be sent to combined billing as it/they is/are voided"
    And clicks on ok
    And User lands to Invoice History Page.
    And invoice was deselected from grid

  @SendtoCombinedbillingforMultipleinvoice-voided
  Scenario: show an Error while trying to Send to combined billing  an  voided invoice-Multiple
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "Voided"
    And clicks on save button
    And User selects invoice
      | VOIDOPT1 |
      | DEMO333  |
    When user clicks on the send to combined billing button
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # VOIDOPT1,DEMO333 can't be sent to combined billing as it/they is/are voided"
    And clicks on ok
    And User lands to Invoice History Page.
    And invoice was deselected from grid

  @sendtoCombinedbillingforMultipleinvoice-combined
  Scenario: show an Error while trying to void an  voided invoice-Multiple
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "All"
    And clicks on save button
    And User selects invoice
      | DEMO123 |
      | DEMO987 |
      | DEMO333 |
      | DEMO345 |
    When user clicks on the send to combined billing button
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # DEMO333,DEMO345 can't be sent to combined billing as it/they is/are voided"
    And clicks on ok
    And User lands to Invoice History Page.
    And remaining invoices remain selected
