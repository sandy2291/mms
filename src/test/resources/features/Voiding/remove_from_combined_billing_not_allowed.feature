@RemoveFromCombinedbillingnotAllowed
Feature: Remove From Combined Billing Not Allowed

  @NavigateToInvHistory
  Scenario: Navigate to Invoice History.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    And User is on Home Page.
    When User Selects Invoice History Submenu from Billing Mainmenu.
    Then User is on Invoice History Page.

  @RemovenotallowedSingleinvoice
  Scenario: Remove from combined billing should not function if not sent to combined billing
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "All"
    And clicks on save button
    And User selects invoice
      | DEMO234 |
    When user clicks on the "Remove from combined billing" button
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # DEMO234 can't be removed from combined billing as it/they is/are not sent to combined billing"
    And clicks on ok
    And User lands to Invoice History Page.
    And invoice was deselected from grid

  @RemovenotallowedMultipleinvoice
  Scenario: Remove from combined billing should not function if not sent to combined billing for multiple
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "All"
    And clicks on save button
    And User selects invoice
      | DEMO098 |
      | DEMO567 |
      | DEMO234 |
    When user clicks on the "Remove from combined billing" button
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # DEMO098,DEMO567,DEMO234 can't be removed from combined billing as it/they is/are not sent to combined billing"
    And clicks on ok
    And User lands to Invoice History Page.
    And invoice was deselected from grid
    Given User is on Invoice History Page.
    When clicks on filter button
    And enters invoice date as ""
    And Void status as "All"
    And clicks on save button
    And User selects invoice
      | DEMO098 |
      | DEMO567 |
      | DEMO222 |
    When user clicks on the "Remove from combined billing" button
    Then User is on "Invoice validation error" popup
    And popup displays generates error message "Invoice(s) # DEMO098,DEMO567 can't be removed from combined billing as it/they is/are not sent to combined billing"
    And clicks on ok
    And User lands to Invoice History Page.
    And rest of invoices still be selected
