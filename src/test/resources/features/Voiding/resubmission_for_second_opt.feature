@MMS_Invoicing_InvoiceEditable_SecondOpt
Feature: Resubmission For Second opt

  @MMSLOGIN-001
  Scenario: Login into MMS application.
    Given User is logged in as 'kcsadmin' and 'admin' as password.
    When User Clicks on MMS Login Button.
    Then User navigates to mms home page.

  @GenerateInvoiceforCorrectiononGrid
  Scenario: Generate invoice grid
    Given User has voided an invoice "DEMO567" for a customer "CSXT" with the 2nd option
    When user navigates to invoicing under billing menu
    Then user can see the customer listed on the grid
    And On click of the view the user will see the amount of the invoice which was voided with second option

  @GenerateInvoiceforCorrectionpart1
  Scenario: Generate invoice from the  grid
    Given User has voided an invoice "DEMO567" for a customer "CSXT" with the 2nd option
    And user is on the invoicing grid
    And has selected the customer for Second option
    When user clicks the button "Generate invoice"
    Then a dialogue window pops up with the same invoice number appears for Second Option
    And Invoice number is editable

  @GenerateInvoiceforCorrectionwithdifferentinvoicenumber
  Scenario: Generate invoice from the  grid with different invoice number
    Given User has already clicked on the Generate invoice number for the customer "CSTX"
    And dialogue already poped up with the same invoice number
    And user has clicked on the text area for the invoice number
    When User changes the invoice DEMO567 to 'DEMO568'
    And clicks on Generate Invoice button

  #Then Success Message appears on the right on the activity summary page
  #And message is displayed in the Activity summary
  #And the customer will disappear from the grid
  @VerifyinvoiceGeneratedaftercorrection
  Scenario: check the invoice created after correction
    Given User has already clicked on the Generate invoice(s) button after changing the details of the invoice "DEMO567" for Customer "CSXT"
    #When User navigates to Invoice history page under Billing
    Then User will find the invoice number on the invoice history Grid
    And the void status will be "Has Resubmitted invoices " with a tool tip .

  @Verifystatusofoldinvoiceaftercorrection
  Scenario: check the old invoice void status created after correction
    Given User has already clicked on the Generate invoice(s) button after changing the details of the invoice "DEMO567" for Customer "CSXT"
    #And Invoice generation was successful
    When User clicks on filter
    And Searches for the old invoice by Entering Invoice Number field 'DEMO567' to 'DEMO567'
    #Then User will find the invoice number on the invoice history Grid
    And Void statu will be "Voided for resubmission with same invoice number and resubmitted"
