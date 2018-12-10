@MMS_Unvoiding_On_Voided
Feature: Mms Unvoiding on Voided

  #US13487 Pop up message on unvoiding an non voided invoice
  @MMSLOGIN
  Scenario: Void ,Unvoid button and new column added on Grid
    Given user is logges in as 'kcsadmin' and 'admin' as password
    When user Click on MMS Login Button
    And User clicks on the Invoice History link option under the Billing
    Then User will navigate to the Invoice history screen with a grid
    And User will see a new button for Void Invoice and Unvoid Invoice
    And Grid shows a new column added Void Status

  @PopupUnvoidedforsingleinvoice
  Scenario: show an Error while trying to unvoid an non voided invoice-single
    When user has selected an invoice which is not voided 'DEMO234'
    And user clicks on the "UnVoid invoice"
    Then User will get a dialogue with the message "Invoice(s) # can't be unvoided as it is not voided" with a OK button
    And clicking OK, should remove the selection made on the grid.

  @PopupUnvoidedforMultipleinvoice
  Scenario: show an Error while trying to unvoid an non voided invoice-Multiple
    Given user has selected multiple invoices which is not voided
    When user clicks on the "UnVoid invoice"
    Then User will get a dialogue with the message Invoices can't be unvoided as it is not voided with a OK button
    And clicking OK, should remove the selection made on the grid.

  @PopupUnvoidedforMultipleinvoice-Combi
  Scenario: show an Error while trying to unvoid an non voided invoice-Multiple
    Given user has selected multiple invoices which is not voided and few are voided
    When user clicks on the "UnVoid invoice"
    Then User will get a dialogue with the message Invoices can't be unvoided as it not voided with a OK button
    And clicking OK, should remove the selection made on the grid.
    And Rest of the invoices will still be selected.

  @UnvoidVoidedInvoice
  Scenario: Unvoid voided Invoice
    Given User has selected an Invoice which is voided and no changes are made to this Invoice
    When user clicks on the "UnVoid invoice"
    When User is able to unvoid the Invoice
    When user clicks on Filter
    And enter the invoice 'VOIDOPT1' to 'VOIDOPT1'
    And click on save
    And can see the Voiding status as blank
