@RemoveFromCombinedbillingofVoidedinvoice
Feature: Remove From Combined Billing Of Voided

  @NavigateToInvHistory
  Scenario: Navigate to Invoice History.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Invoice History Submenu from Billing Mainmenu.
    Then User is on Invoice History Page.

  @RemovefromCombinedbillingforMultipleinvoice-voided
  Scenario: show an Error while trying to Remove from combined billing  an  voided invoice-Multiple
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "Voided"
    And clicks on save button
    And User selects invoice
      | DEMO333 |
      | DEMO345 |
    When user clicks on the "Remove from combined billing" button
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # DEMO333,DEMO345 can't be removed from combined billing as it/they is/are already voided"
    And clicks on ok
    And User lands to Invoice History Page.
    And invoice was deselected from grid

  @RemovefromCombinedbillingforMultipleinvoice-voided
  Scenario: show an Error while trying to void an  voided invoice-Multiple
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "All"
    And clicks on save button
    And User selects invoice
      | DEMO333 |
      | DEMO345 |
      | DEMO234 |
    When user clicks on the "Remove from combined billing" button
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # DEMO234 can't be removed from combined billing as it/they is/are not sent to combined billing"
    And popup displays another error message "Invoice(s) # DEMO333,DEMO345 can't be removed from combined billing as it/they is/are already voided"
    And clicks on ok
    And User lands to Invoice History Page.
    And invoice was deselected from grid
