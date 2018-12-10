@MMSINVOICES
Feature: Invoice Review

@MMSINVOICES-001
Scenario: Navigate to Invoice Review Page

Given the user enters the username 'kcsadmin'
And User enter password 'admin'
And User Click on Login Button
When User Selects Invoice Review Submenu from Invoice Mainmenu
Then User lands to Invoice Review Page 
   
@MMSINVOICES-002
Scenario: Check the Invoice Details

Given User Selects Invoice Number 'I001501' 
When User Clicks on View Details under Action coulumn
Then User Lands to Invoice Details Page with Same Invoice Number
And User Can Verify Details Of Invoice with Same Invoice Number in the Grid

@MMSINVOICES-003
Scenario: Search for Invoice Number

Given User is already on Invoice Review Page.
#And User selects the already Created Invoice Number.
When User clicks on filter of invoice review.
And User Enter the Invoice Number 'I001501' and 'I001501' 
And Click on Save
Then User can verify the Invoice number details in the Grid.
 
#@Manual 
#@MMSINVOICES-004
#Scenario: Generate Invoice Report

#Given User is on Invoice Review Page.
#And User clicks on filter of invoice review.
#And User Enter the Invoice Number 'I001501' and 'I001501' 
#And Click on Save
#When User Selects already Created Invoice Number.
#And User Clicks on Generate Report Button.
#And User can view Report Download Window of invoice review.
#And User Clicks on Download Under Action Column.
#Then User Can verify the Report generated successfully.  

@MMSINVOICES-005
Scenario: Approve Payment for Invoice

Given User views Invoice Review Page.
And User clicks on filter of invoice review.
And User Enter the Invoice Number 'I001501' and 'I001501' 
And Click on Save
And User selects created Invoice number.
When User Clicks on Approve for Payemnt.
And User is on "Are You Sure?" popup
And User Click on Ok.
Then User can Verify the Payemnt Status as Approved in the Grid for Created Invoice Number.  

@MMSINVOICES-006
Scenario: Mark the Invoice as Paid

Given User lands on Invoice Review Page.
And User selects created Invoice number.
When User Clicks on Mark Paid.
And User is on "Are You Sure?" popup
And User clicks on Ok of popup.
Then User can verify the Payemnt Status as Paid in the Grid for Created Invoice Number.

@MMSINVOICES-007
Scenario: Mark the Invoice with the Payemnt Status as Paid 

Given User is already on Invoice Review Page
And User selects created Invoice number.
And User Clicks Filter
And User Search for Invoice Number 'I001501' and 'I001501'
And Clicks Save
When User select the Row
Then User gets Error message "Invoice I001501 is already marked paid".
    