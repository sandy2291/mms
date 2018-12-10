@Resubmission1stoption
Feature: Resubmission For First Opt

  @Login1
  Scenario: Login into MMS application.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    When User Clicks on MMS Login Button.
    Then User navigates to mms home page.

  @GenerateInvoiceforCorrectiononGrid
  Scenario: Generate invoice grid
    Given User has voided an invoice "VOIDOPT1" for a customer "A002"
    When user navigates to invoicing under billing menu
    Then user will see the customer listed on the grid
    And On click of the view the user will see the amount of the invoice which was voided.

  @GenerateInvoiceforCorrectionpart1
  Scenario: Generate invoice from the  grid
    Given User has voided an invoice "VOIDOPT1" for a customer "A002"
    And user is on the invoicing grid
    And has selected the customer
    When user clicks the button "Generate invoice"
    Then a dialogue window pops up with the same invoice number appearing
    And Invoice number is editable

  @GenerateInvoiceforCorrectionwithdifferentinvoicenumber
  Scenario: Generate invoice from the  grid with different invoice number
    Given User has already clicked on the Generate invoice number "VOIDOPT1" for the customer "A002"
    And dialogue already poped up with the same invoice number
    And user has clicked on the text area for the invoice number
    When User changes the invoice VOIDOPT1 to 'VOIDOPT2'
    And clicks on Generate Invoice button

  #Then Success Message appears on the right on the activity summary page
  #And the customer will disappear from the grid
  @VerifyinvoiceGeneratedaftercorrection
  Scenario: check the invoice created after correction
    Given User has already clicked on the Generate invoice(s) button after changing the details of the invoice "VOIDOPT1"
    When User navigates to Invoice history page under Billing
    Then User will find the invoice number on the invoice history Grid.

  @Verifystatusofoldinvoiceaftercorrection
  Scenario: check the old invoice void status created after correction
    Given User has already clicked on the Generate invoice(s) button after changing the detail of the invoice "VOIDOPT1"
    And Invoice generation was successful
    When User clicks on filter
    And Searches for the old invoice by Entering Invoice Number field 'VOIDOPT1' to 'VOIDOPT1'
    Then Void status will be "Voided for Correction and corrected"
