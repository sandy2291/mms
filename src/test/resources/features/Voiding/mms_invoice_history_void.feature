@MMSINVOICEHISTORY
Feature: Mms Invoice History Void

  Scenario: Void ,Unvoid button and new column added on Grid
    Given user is logges in as 'kcsadmin' and 'admin' as password
    When user Click on MMS Login Button
    And User clicks on the Invoice History link option under the Billing
    Then User will navigate to the Invoice history screen with a grid
    And User will see a new button for Void Invoice and Unvoid Invoice
    And Grid shows a new column added Void Status

  Scenario: Verify all Three Options & Radio Button
    Given User is already on the Invoice history screen
    And has already Generated an Invoice
    And User has already checked the box against that invoice number
    When user clicks on the void invoice button
    Then A dialogue appears with 3 options.
    And the tile of the dialogue is Void invoice
    And Three radio buttons are present
    And First radio button has the message I'm correcting this invoice.It has not been processed by Railinc or submitted to anyone and I will be reusing the same invoice number.
    And Second radio button has the message I'm resubmitting this invoice. I have already sent it to the Data exchange or my customer and need to submit a revised invoice with the same invoice number
    And Third radio button has the message I'm resubmitting this invoice. I have already sent it to the Data exchange or my customer and need to submit a revised invoice with a new invoice number
    And two buttons - cancel and void invoice is present

  Scenario: System flow on clicking the void button
    Given User is already on the Invoice history screen
    And User has already checked the box against the invoice "VOIDOPT1"
    And Invoice has not bee sent to combined billing
    And "Void invoice" button is clicked
    And Dialogue shows with three options
    When User selects the first option "I'm correcting this invoice.It has not been processed by Railinc or submitted to anyone and I will be reusing the same invoice number"
    And clicks on void invoice button
    Then system will validate at the backend

  #And generates a success message stating invoice is voided
  #And invoice will disappear from the grid
  Scenario: check for void status on the grid for option 1
    Given User has already voided a invoice selecting the first option for InvoiceNumber TESTppp
    When user clicks on Filter
    And enter the invoice 'VOIDOPT1' to 'VOIDOPT1'
    And click on save
    Then the grid should show that invoice number with void status column "Voided for Correction"

  Scenario: Validation error while selecting the first option of voiding
    Given User has already Generated an Invoice "DEMO123"
    And Invoice has been sent to combined billing
    And has not been sent to DX file
    And User has already checked the box against the invoice
    #And "Void invoice" button is clicked
    When User selects the first option "I'm correcting this invoice.It has not been processed by Railinc or submitted to anyone and I will be reusing the same invoice number"
    And clicks on void invoice button
    Then system will validate at the backend
    And generates a error message "Invoice can't be voided , as invoices are sent for combined billing."
    And The invoice stays on the grid.
