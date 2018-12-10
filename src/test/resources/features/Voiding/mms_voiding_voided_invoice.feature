@VoidingVoidedinvoices
Feature: MMS Voiding Voided Invoice

@MMSLOGIN
Scenario: Void ,Unvoid button and new column added on Grid

Given user is logges in as 'kcsadmin' and 'admin' as password
When user Click on MMS Login Button
And User clicks on the Invoice History link option under the Billing
Then User will navigate to the Invoice history screen with a grid
And User will see a new button for Void Invoice and Unvoid Invoice
And Grid shows a new column added Void Status


@Popupvoidedforsingleinvoice
Scenario: show an Error while trying to void an  voided invoice-single

Given user has selected an invoice which is voided 
When user click on the "Void invoice" 
Then user will get dialogue with the message "Invoice(s) # can't be voided as it is already voided" with a OK button
And clicking OK, should remove selection made on the grid.


@PopupvoidedforMultipleinvoice
Scenario: show an Error while trying to void an  voided invoice-Multiple Combination

Given user has selected multiple invoices which are voided 
When user click on the "Void invoice" 
Then User gets dialogue with message "Invoice(s) # can't be voided as it is already voided" with a OK button
And clicking OK, should remove selection made on the grid.

@PopupvoidedforMultipleinvoice-Combi
Scenario: show an Error while trying to void an  voided invoice-Multiple

Given user has selected multiple invoices which is voided and few are not voided
When user click on the "Void invoice" 
Then User will get the dialogue with the message "Invoice(s) # can't be voided as it is already voided" with a OK button
And clicking OK, should remove selection made on the grid.
And Rest of the invoice will still be selected.